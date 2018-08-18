/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.expense;

import com.exam.connectionDatabase.ConnectionDatabase;
import com.exam.connectionDatabase.IncrementDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rezaul sabuj
 */
public class ExpenseDAO {

    public void addExpense(Expense exp) {
        ConnectionDatabase cd = new ConnectionDatabase();
        Connection con = cd.doConnect();
        IncrementDAO id = new IncrementDAO();
        String tid = id.doIncrement2("5000", "transactionId", "transaction");
        String voucherNo = exp.getVoucherNo();
        String expenseName = exp.getExpenseName();
        int amount = exp.getAmount();
        PreparedStatement pstm1;
        PreparedStatement pstm2;

        try {
            pstm1 = con.prepareStatement("INSERT INTO expense VALUES(?,?,?,?,NOW())");
            pstm2 = con.prepareStatement("INSERT INTO transaction VALUES(?,?,?,NOW(),?,?)");

            pstm1.setString(1, tid);
            pstm1.setString(2, expenseName);
            pstm1.setString(3, voucherNo);
            pstm1.setInt(4, amount);
            pstm1.executeUpdate();

            //FOR transaction table
            pstm2.setString(1, tid);
            pstm2.setInt(2, amount);
            pstm2.setString(3, "payment");
            pstm2.setInt(4, amount);
            pstm2.setInt(5, 0);
            pstm2.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Expense> viewAllExpense() {

        List<Expense> li = new ArrayList();
        try {
            ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstm1 = con.prepareStatement("select * from expense");
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                Expense exp = new Expense();
                exp.setVoucherNo(rs.getString("voucherNo"));
                exp.setExpenseName(rs.getString("NameOfExpense"));
                exp.setAmount(rs.getInt("amount"));
                li.add(exp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return li;
    }
}
