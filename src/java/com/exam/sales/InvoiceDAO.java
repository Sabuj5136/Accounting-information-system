/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.sales;


import com.exam.connectionDatabase.ConnectionDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rezaul sabuj
 */
public class InvoiceDAO {
    public void saveInvoice(Invoice ic){
        //Invoice ic=new Invoice();
        String id=ic.getId();
        String name=ic.getName();
        String model=ic.getModel();
        int unitPrice=ic.getUnitPrice();
        int quantity=ic.getQuantity();
        int total=ic.getTotal();
        int unit=0;
        int costPerUnit=0;
        int totalSprice=0;
        try {
            ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstmt=con.prepareStatement("Insert into temporary values(?,?,?,?,?,?)");
            PreparedStatement pstm=con.prepareStatement("select * from product where productId=?");
            PreparedStatement pst=con.prepareStatement("update product set stock=?,totalSalesPrice=? where productId=?");
            PreparedStatement pst6=con.prepareStatement("INSERT INTO costofgoodsold VALUES(?,?,?,?,NOW())");
            

            pstmt.setString(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,model);
            pstmt.setInt(4,unitPrice);
            pstmt.setInt(5,quantity);
            pstmt.setInt(6,total);
            
            
           

            int i = pstmt.executeUpdate();
            if (i > 0) {
                System.out.println("Success");
            }
            pstm.setString(1,id);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                unit=rs.getInt("stock");
                costPerUnit=rs.getInt("costPerUnit");
               totalSprice=rs.getInt("totalSalesPrice");
            }
            int upQuantity=unit-quantity;
            int upTotalSales=totalSprice-total;
            pst.setInt(1,upQuantity);
            pst.setInt(2,upTotalSales);
            pst.setString(3,id);
            pst.executeUpdate();
            //for cost of good sold
            int costOfGoodSoldTotal=quantity*costPerUnit;
            pst6.setString(1, id);
            pst6.setInt(2, quantity);
            pst6.setInt(3, costPerUnit);
            pst6.setInt(4, costOfGoodSoldTotal);
            pst6.executeUpdate();
           
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    
    
    public List<Invoice> findAll(){
        
        List<Invoice> li=new ArrayList();
        try {
            ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstmt=con.prepareStatement("SELECT* FROM temporary");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                Invoice ic=new Invoice();
                ic.setId(rs.getString("id"));
                ic.setName(rs.getString("name"));
                ic.setModel(rs.getString("model"));
                ic.setUnitPrice(rs.getInt("unitPrice"));
                ic.setQuantity(rs.getInt("quantity"));
                ic.setTotal(rs.getInt("total"));
                
                li.add(ic);
                
                
            }     
           
    }catch(Exception e){
        e.printStackTrace();
    }
    
    return li;
    }
    
    
    
    public int grandSum(){
        int gtotal=0;
    
        try{
              ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstmt=con.prepareStatement("SELECT SUM(total) FROM temporary");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
              gtotal=rs.getInt("SUM(total)");
            }     
        }catch(Exception e){
            e.printStackTrace();
        }
         return gtotal; 
    }
    
    
   public void deleteTempo(){
       try{
            ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstmt=con.prepareStatement("DELETE FROM temporary");
            pstmt.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
  
}
