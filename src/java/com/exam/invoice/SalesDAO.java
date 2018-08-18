/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.invoice;

import com.exam.Sales;
import com.exam.connectionDatabase.ConnectionDatabase;
import com.exam.connectionDatabase.IncrementDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Rezaul sabuj
 */
public class SalesDAO {

    //public static void main(String[] args) {
    ConnectionDatabase cd = new ConnectionDatabase();
    Connection con = cd.doConnect();
    IncrementDAO id = new IncrementDAO();
    String ivid = id.doIncrement2("9000", "invoiceId", "sales");
    String tid = id.doIncrement2("5000", "transactionId", "transaction");
    String pdf = "Invoice" + ivid;
    String id1 = "";
    String name = "";
    String model = "";
    int unitPrice = 0;
    int quantity = 0;
    int total = 0;
    PreparedStatement pst;
    //Sales sa = new Sales();
    String cid = "";
    int grossSales = 0;
    int discount = 0;
    int transport = 0;
    int netSales = 0;
    int payment = 0;
    int receivable = 0;
    String customerName = "";
    String comName = "";

    public void doInvoice(Sales sa) {
        //Sales sa = new Sales();
        cid = sa.getCustomerId();
        grossSales = sa.getGrossSales();
        discount = sa.getDiscount();
        transport = sa.getTransport();
        netSales = sa.getNetSales();
        payment = sa.getPayment();
        receivable = sa.getReceivable();
        String customerTable = "customer" + cid;

        try {

            PreparedStatement pstm = con.prepareStatement("SELECT * FROM customer WHERE customerId=?");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO sales VALUES(?,?,?,?,?,?,?,?,?,?,?,NOW())");
            PreparedStatement pstmt2 = con.prepareStatement("SELECT SUM(newReceivable) FROM " + customerTable + "");
            PreparedStatement pstmt3 = con.prepareStatement("INSERT INTO " + customerTable + " VALUES(?,?,?,?,?,?,?,NOW())");
            PreparedStatement pstmt4 = con.prepareStatement("UPDATE customer SET receivable=? WHERE customerId=?");
            PreparedStatement pstmt5 = con.prepareStatement("INSERT INTO transaction VALUES(?,?,?,NOW(),?,?)");
            pstm.setString(1, cid);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                customerName = rs.getString("name");
                comName = rs.getString("phone");
                System.out.println(comName);
            }

            pstmt.setString(1, ivid);
            pstmt.setString(2, tid);
            pstmt.setString(3, cid);
            pstmt.setString(4, customerName);
            pstmt.setString(5, comName);
            pstmt.setInt(6, grossSales);
            pstmt.setInt(7, discount);
            pstmt.setInt(8, transport);
            pstmt.setInt(9, netSales);
            pstmt.setInt(10, payment);
            pstmt.setInt(11, receivable);
            pstmt.executeUpdate();
            //for Recievable
            ResultSet rs2 = pstmt2.executeQuery();
            int newReceivable = 0;
            while (rs2.next()) {
                newReceivable = rs2.getInt("SUM(newReceivable)");
            }
            int totalReceivable = receivable + newReceivable;

            pstmt3.setString(1, ivid);
            pstmt3.setString(2, tid);
            pstmt3.setInt(3, netSales);
            pstmt3.setInt(4, payment);
            pstmt3.setInt(5, receivable);
            pstmt3.setInt(6, newReceivable);
            pstmt3.setInt(7, totalReceivable);
            pstmt3.executeUpdate();
            /////for Update customer
            pstmt4.setInt(1, totalReceivable);
            pstmt4.setString(2, cid);
            pstmt4.executeUpdate();
            //FOR transaction table
            pstmt5.setString(1, tid);
            pstmt5.setInt(2, netSales);
            pstmt5.setString(3, "receive");
            pstmt5.setInt(4, payment);
            pstmt5.setInt(5, receivable);
            pstmt5.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bill() {

        try {
            ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstmt = con.prepareStatement("SELECT * From temporary");
            PreparedStatement pstm = con.prepareStatement("create table " + pdf + "(id VARCHAR(45),name VARCHAR(45),model VARCHAR(45),unitPrice INT(8),quantity INT(8),total INT(8))");
            PreparedStatement ps = con.prepareStatement("delete from temporary");

            pstm.executeUpdate();
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                id1 = rs.getString("id");
                name = rs.getString("name");
                model = rs.getString("model");
                unitPrice = rs.getInt("unitPrice");
                quantity = rs.getInt("quantity");
                total = rs.getInt("total");
                pst = con.prepareStatement("insert into " + pdf + " values(?,?,?,?,?,?)");
                pst.setString(1, id1);
                pst.setString(2, name);
                pst.setString(3, model);
                pst.setInt(4, unitPrice);
                pst.setInt(5, quantity);
                pst.setInt(6, total);
                int i = pst.executeUpdate();
                if (i > 0) {
                    System.out.println("updated");
                }
                PreparedStatement pstm6 = con.prepareStatement("insert into billing values(?,?,?,?,?,?,?)");
                pstm6.setString(1, id1);
                pstm6.setString(2, name);
                pstm6.setString(3, model);
                pstm6.setInt(4, unitPrice);
                pstm6.setInt(5, quantity);
                pstm6.setInt(6, total);
                pstm6.setString(7, ivid);
                pstm6.executeUpdate();
            }

            ps.executeUpdate();
            ////for billing pdf

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pdfFile() {
        //IncrementDAO id = new IncrementDAO();
        // String uv=id.doIncrement2("9001","invoiceId","sales");
        //String uv = "9012";
       // String customerName = "Rakibul hasan";

        try {
            System.out.println("Start ....");

            String jrxmlFileName = "D:/apcl/bill.jrxml";
            String jasperFileName = "D:/apcl/bill.jasper";
            String pdfFileName = "D:/apcl/" + ivid + ".pdf";

            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/informationsystem", "root", "apcl123456");
            HashMap hm = null;
            // Create arguments
            // Map params = new HashMap();
              String gross=String.valueOf(grossSales);
                 String dis=String.valueOf(discount);
                 String trn=String.valueOf(transport);
                 String net=String.valueOf(netSales);
                 String pay=String.valueOf(payment);
                 String rec=String.valueOf(receivable);
                 
          
            
          

            hm = new HashMap();
            hm.put("p1", ivid);
            hm.put("p2", customerName);
            hm.put("p3", comName);
            hm.put("p4", cid);
            hm.put("p5", gross);
            hm.put("pds", dis);
            hm.put("p6", trn);
            hm.put("p7", net);
            hm.put("p8", pay);
            hm.put("p9", rec);
         
          
           
           
            
            
            

            // Generate jasper print
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, hm, conn);

            // Export pdf file
            JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);

            //JOptionPane.showMessageDialog(null, "Done");
            System.out.println(ivid);
             Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler D:/apcl/" + ivid + ".pdf");

        } catch (Exception e) {
            System.out.print("Exception" + e);
        }

    }

}
