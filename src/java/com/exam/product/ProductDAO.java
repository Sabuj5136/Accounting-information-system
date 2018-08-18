/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.product;

import com.exam.NewHibernateUtil;
import com.exam.Product;
import com.exam.connectionDatabase.ConnectionDatabase;
import com.exam.connectionDatabase.IncrementDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author Rezaul sabuj
 */
public class ProductDAO {
    ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        IncrementDAO id=new IncrementDAO();
        String pid=id.doIncrement2("1000","productId","product");
        
    public List<String> getProductId(){
        List<String> li=new ArrayList();
        try{
       
        
        PreparedStatement pstmt=con.prepareStatement("SELECT * FROM product");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                li.add(rs.getString("productId"));
            }
        
         }catch(Exception e){
             e.printStackTrace();
         }
        return li;
    }
    
    
   public void saveNewProduct(Product iv){
       String se=id.doIncrement2("1","serial","product");
       int it=Integer.parseInt(se);
       try{
            PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1,pid);
            pstmt.setString(2,iv.getProductName());
            pstmt.setInt(3,0);
            pstmt.setInt(4,0);
            pstmt.setInt(5,0);
            pstmt.setInt(6,0);
            pstmt.setInt(7,0);
            pstmt.setString(8,iv.getModel());
            pstmt.setString(9,iv.getBrand());
            pstmt.setInt(10, it);
            int i=pstmt.executeUpdate();
            if(i>0){
                System.out.println("success");
            }
       }catch(Exception e){
           e.printStackTrace();
       }
       
   }
   
   public String getPid(){
       return "New Product Id: "+pid;
   }
   
   public List<Product> viewProductList(){
       Session s=NewHibernateUtil.getSessionFactory().openSession();
       s.beginTransaction();
       List<Product> li=new ArrayList();
       li=s.createCriteria(Product.class).list();
       return li;
   }
    
}
