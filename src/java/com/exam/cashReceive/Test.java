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
public class Test {
    public static void main(String[] args) {
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        String customerTable="customer"+6001;
        IncrementDAO id=new IncrementDAO();
        String ivId=id.getLastValue("9001","invoiceId",customerTable);
        System.out.println(ivId);
        try{
            PreparedStatement pstm4=con.prepareStatement("SELECT * FROM " +customerTable+ " WHERE invoiceId=?");
            pstm4.setString(1,ivId);
            ResultSet rs2=pstm4.executeQuery();
            while(rs2.next()){
                int r=rs2.getInt("totalReceivable");
                System.out.println(r);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
