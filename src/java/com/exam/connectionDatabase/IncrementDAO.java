/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.connectionDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class IncrementDAO {
    public String doIncrement(String n1){
          int id=0;
          String p2=n1;
          String n2="";
        try{
         
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        PreparedStatement pstmt=con.prepareStatement("SELECT MAX(product_id) FROM productlist");
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){
             n2=rs.getString(1);
            if(n2==null){
                n2=p2;
            }else{
                n2=rs.getString("MAX(product_id)");
            }
            int n3=Integer.parseInt(n2);
             id=n3+1;
        }
        }catch(Exception e){
            e.printStackTrace();
        }
         return n2;
    }
    
    
    
    
    
    
    
    
   
    
    //this method for autoIncrement.it takes three parameter.
    public String doIncrement2(String n1,String columnName,String tableName){
        String s1=columnName;
        String s2=tableName;
          int id=0;
          String p2=n1;
          String result="";
          
        try{
         
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        PreparedStatement pstmt=con.prepareStatement("SELECT MAX(" +s1+ ") FROM "+s2+"");
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){
            String n2=rs.getString(1);
            if(n2==null){
                n2=p2;
            }else{
                n2=rs.getString("MAX(" +s1+ ")");
            }
            int n3=Integer.parseInt(n2);
             id=n3+1;
             result=String.valueOf(id);
        }
        }catch(Exception e){
            e.printStackTrace();
        }
         return result;
    }
    
    
    
    ///For getting last value of a column;
    public String getLastValue(String n1,String columnName,String tableName){
        String s1=columnName;
        String s2=tableName;
          int id=0;
          String p2=n1;
          String n2="";
          
        try{
         
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        PreparedStatement pstmt=con.prepareStatement("SELECT MAX(" +s1+ ") FROM "+s2+"");
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){
             n2=rs.getString(1);
            if(n2==null){
                n2=p2;
            }else{
                n2=rs.getString("MAX(" +s1+ ")");
            }
            
        }
        }catch(Exception e){
            e.printStackTrace();
        }
         return n2;
    }
    
}
