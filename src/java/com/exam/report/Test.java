/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.report;

import com.exam.connectionDatabase.ConnectionDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author l2pc208m
 */
public class Test {

    public static void main(String[] args) {
        String cFdate = "01-07-2018";
        String ctdate = "31-07-2018";
        String ss = "";
        try {
            DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            Date dt1 = sdf.parse(cFdate);
            Date dt2 = sdf.parse(ctdate);
            java.sql.Date d1 = new java.sql.Date(dt1.getTime());
            java.sql.Date d2 = new java.sql.Date(dt2.getTime());
            // JOptionPane.showMessageDialog(null, d1);
            //JOptionPane.showMessageDialog(null, d2);
            ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM sales WHERE (date between '" + d1 + "' and '" + d2 + "')");
            //PreparedStatement pstmt = con.prepareStatement("SELECT * FROM sales WHERE (date between '2018-07-01' and '2018-07-31')");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ss = rs.getString("invoiceId");
            }
            System.out.println(ss);
            System.out.println(d1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
