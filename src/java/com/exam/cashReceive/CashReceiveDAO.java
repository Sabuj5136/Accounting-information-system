/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.cashReceive;

import com.exam.connectionDatabase.ConnectionDatabase;
import com.exam.connectionDatabase.IncrementDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Rezaul sabuj
 */
public class CashReceiveDAO {
    ConnectionDatabase cd = new ConnectionDatabase();
    Connection con = cd.doConnect();
    IncrementDAO id = new IncrementDAO();
    String tid = id.doIncrement2("5000", "transactionId", "transaction");
    int receive=0;
    int amount;
    String cid;
    int totalReceivable=0;
  

    public void addRecieveAmount(CashReceive cr) {
         amount=cr.getAmount();
         cid=cr.getCustomerId();
         String customerTable="customer"+cid;
        String ivId=id.getLastValue("9001","invoiceId",customerTable);
        String iv=id.doIncrement2("9001","invoiceId",customerTable);
        try {
            PreparedStatement pstm1 = con.prepareStatement("INSERT INTO transaction VALUES(?,?,?,NOW(),?,?)");
            PreparedStatement pstm2=con.prepareStatement("SELECT * FROM customer WHERE customerId=?");
            PreparedStatement pstm3=con.prepareStatement("UPDATE customer SET receivable=? WHERE customerId=?");
            PreparedStatement pstm4=con.prepareStatement("SELECT * FROM " +customerTable+ " WHERE invoiceId=?");
            PreparedStatement pstm5=con.prepareStatement("INSERT INTO " +customerTable+ " VALUES(?,?,?,?,?,?,?,NOW())");
            

            pstm1.setString(1, tid);
            pstm1.setInt(2, amount);
            pstm1.setString(3, "receive");
            pstm1.setInt(4, amount);
            pstm1.setInt(5, 0);
            pstm1.executeUpdate();
            //FOR PSTM2
            pstm2.setString(1,cid);
            ResultSet rs=pstm2.executeQuery();
            while(rs.next()){
                receive=rs.getInt("receivable");
            }
            //for pstm3
            int newReceivable=receive-amount;
            pstm3.setInt(1,newReceivable);
            pstm3.setString(2,cid);
            pstm3.executeUpdate();
            //get data from customer personal table
            pstm4.setString(1,ivId);
            ResultSet rs2=pstm4.executeQuery();
            int r=0;
            while(rs2.next()){
                 r=rs2.getInt("totalReceivable");
                System.out.println(r);
            }
            ///
            int balance=r-amount;
            pstm5.setString(1,iv);
            pstm5.setString(2, tid);
            pstm5.setInt(3, 0);
            pstm5.setInt(4,amount);
            pstm5.setInt(5, 0);
            pstm5.setInt(6, 0);
            pstm5.setInt(7, balance);
            pstm5.executeUpdate();
            
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
