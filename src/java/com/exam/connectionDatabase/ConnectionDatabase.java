/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.connectionDatabase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class ConnectionDatabase {
    String url="jdbc:mysql://localhost:3306/informationsystem";
    String user="root";
    String password="apcl123456";
    Connection con;
    
    public  Connection doConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);
            
        }catch(Exception e){
            e.printStackTrace();
        }
          return con;
    }
  
}
