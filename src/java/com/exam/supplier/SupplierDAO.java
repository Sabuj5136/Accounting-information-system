/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.supplier;

import com.exam.NewHibernateUtil;
import com.exam.Purchase;
import com.exam.Supplier;
import com.exam.connectionDatabase.ConnectionDatabase;
import com.exam.connectionDatabase.IncrementDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Rezaul sabuj
 */
public class SupplierDAO {
    String supId;
      ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        IncrementDAO id=new IncrementDAO();
        String supplierId=id.doIncrement2("7000","supplierId", "supplier");
        String supplierTable="supplier"+supplierId;
     public void saveNewSupplier(Supplier s){
         try{
              PreparedStatement pstmt=con.prepareStatement("insert into supplier values(?,?,?,?,?)");
              pstmt.setString(1, supplierId);
              pstmt.setString(2,s.getName());
              pstmt.setString(3,s.getPhone());
              pstmt.setString(4,s.getCompanyName());
              pstmt.setInt(5,0);
              int i=pstmt.executeUpdate();
              if(i>0){
                 PreparedStatement pstm = con.prepareStatement("create table "+supplierTable+"(productId VARCHAR(45),transactionId VARCHAR(45),productName VARCHAR(45),quantity INT(8),unitCostPrice INT(8),totalCost INT(8),payment INT(8),newPayable INT(8),previousPayable INT(8),totalPayable INT(8),purchaseDate DATE)");
                 pstm.executeUpdate();
              }
         }catch(Exception e){
             e.printStackTrace();
         }
     }
    
     
      public List<String> getSupplierId(){
        List<String> li=new ArrayList();
        try{
       
        
        PreparedStatement pstmt=con.prepareStatement("SELECT * FROM supplier");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                li.add(rs.getString("supplierId"));
            }
        
         }catch(Exception e){
             e.printStackTrace();
         }
        return li;
    }
      
      
    public String showSupplierId(){
        return "New Supplier Id: "+supplierId;
    }
    //for view All supplier
    public List<Supplier> showAllSupplier(){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        List<Supplier> li=new ArrayList();
        li=s.createCriteria(Supplier.class).list();
        return li;
    }
    
    public void updateSupplier(Supplier sp){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(sp);
        s.getTransaction().commit();
        s.close();
    }
    
    
    public List<SupplierDetails> detailsOfSupplier(Supplier su){
         supId=su.getSupplierId();
        String tableName="supplier"+supId;
        List<SupplierDetails> li=new ArrayList<>();
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        try{
            PreparedStatement pstm=con.prepareStatement("SELECT * FROM " +tableName+ "");
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                SupplierDetails pu=new SupplierDetails();
                pu.setProductId(rs.getString("productId"));
                pu.setProductName(rs.getString("productName"));
                pu.setQuantity(rs.getInt("quantity"));
                pu.setUnitCostPrice(rs.getInt("unitCostPrice"));
                pu.setTotalCost(rs.getInt("totalCost"));
                pu.setPayment(rs.getInt("payment"));
                pu.setNewPayable(rs.getInt("newPayable"));
                pu.setPreviousPayable(rs.getInt("previousPayable"));
                pu.setTotalPayable(rs.getInt("totalPayable"));
                li.add(pu);
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return li;
    }
    
    
    public String supIdName(){
        //Supplier su=new Supplier();
        //String k=su.getSupplierId();
        return supId;
    }

}
