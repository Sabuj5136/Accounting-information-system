/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.customer;

import com.exam.Customer;
import com.exam.NewHibernateUtil;
import com.exam.Supplier;
import com.exam.connectionDatabase.ConnectionDatabase;
import com.exam.connectionDatabase.IncrementDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Rezaul sabuj
 */
public class CustomerDAO {

    ConnectionDatabase cd = new ConnectionDatabase();
    Connection con = cd.doConnect();
    IncrementDAO id = new IncrementDAO();
    String customerId = id.doIncrement2("6000", "customerId", "customer");
    String customerTable = "customer" + customerId;

    public void saveNewCustomer(Customer c) {
        try {
            PreparedStatement pstmt = con.prepareStatement("insert into customer values(?,?,?,?,?)");
            pstmt.setString(1, customerId);
            pstmt.setString(2, c.getName());
            pstmt.setString(3, c.getPhone());
            pstmt.setString(4, c.getCompanyName());
            pstmt.setInt(5, 0);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                PreparedStatement pstm = con.prepareStatement("create table " + customerTable + "(invoiceId VARCHAR(45),transactionId VARCHAR(45),salesValue INT(8),payment INT(8),newReceivable INT(8),previousReceivable INT(8),totalReceivable INT(8),sellingDate DATE)");
                pstm.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> getCustomerId() {
        List<String> li = new ArrayList();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM customer");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                li.add(rs.getString("customerId"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return li;
    }

    public String showCustomerId() {
        return "New Customer Id: " + customerId;
    }

    public List<Customer> viewAllCustomer() {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        List<Customer> li = new ArrayList();
        li = s.createCriteria(Customer.class).list();
        return li;

    }

    public List<CustomerDetails> detailsOfCustomer(Customer cus) {
        String cusId = cus.getCustomerId();
        String tableName = "customer"+cusId;
        ConnectionDatabase cd = new ConnectionDatabase();
        Connection con = cd.doConnect();
        List<CustomerDetails> li = new ArrayList();

        try {
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM " +tableName+ "");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                CustomerDetails cm = new CustomerDetails();
                cm.setInvoiceId(rs.getString("invoiceId"));
                cm.setSalesValue(rs.getInt("salesValue"));
                cm.setPayment(rs.getInt("payment"));
                cm.setNewReceivable(rs.getInt("newReceivable"));
                cm.setPreviousReceivable(rs.getInt("previousReceivable"));
                cm.setTotalReceivable(rs.getInt("totalReceivable"));
                li.add(cm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return li;
    }
}
