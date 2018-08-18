/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.purchase;

import com.exam.Product;
import com.exam.Purchase;
import com.exam.Supplier;
import com.exam.Transaction;
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
        ConnectionDatabase cd = new ConnectionDatabase();
        Connection con = cd.doConnect();
   
      
        try{
          PreparedStatement pstm6=con.prepareStatement("UPDATE supplier SET payable=? where supplierId=?");
         pstm6.setInt(1,1000);
         pstm6.setString(2,"7001");
         pstm6.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
