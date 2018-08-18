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
public class PurchaseDAO {

    ConnectionDatabase cd = new ConnectionDatabase();
    Connection con = cd.doConnect();
    IncrementDAO id = new IncrementDAO();
    String purchaseId = id.doIncrement2("3000", "purchaseId", "purchase");
    String transactionId = id.doIncrement2("5000", "transactionId", "transaction");
    
    Purchase pr=new Purchase();
    

    public void purchaseSave(Purchase pr) {
       
        String proId = pr.getProductId();
        String supplierId = pr.getSupplierId();
        int quantity = pr.getQuantity();
        int costPerUnit = pr.getCostPerUnit();
        int totalCostPrice = pr.getTotalCostPrice();
        int transportCost = pr.getTransportCost();
        int otherCost = pr.getOtherCost();
        int totalProductCost = pr.getTotalProductCost();
        int payment = pr.getPayment();
        int payable = pr.getPayable();
        int salesPerUnit = pr.getSalesPerUnit();

        String supplierTable = "supplier" + supplierId;
        //for update
        try {
            PreparedStatement pstm = con.prepareStatement("select * from product where productId=?");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO purchase VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,NOW())");
            PreparedStatement pstmt2 = con.prepareStatement("UPDATE  product SET stock=?,costPerUnit=?,totalCostPrice=?,salesPerUnit=?,totalSalesPrice=?  WHERE productId=? ");
            PreparedStatement pstm5 = con.prepareStatement("INSERT INTO transaction VALUES(?,?,?,NOW(),?,?)");
            PreparedStatement pstm3=con.prepareStatement("SELECT SUM(newPayable) FROM " +supplierTable+ "");
            PreparedStatement pstmt4 = con.prepareStatement("INSERT INTO " +supplierTable+ " VALUES(?,?,?,?,?,?,?,?,?,?,NOW())");
            PreparedStatement pstm6=con.prepareStatement("UPDATE supplier SET payable=? where supplierId=?");
            PreparedStatement pstm7=con.prepareStatement("INSERT INTO expense VALUES(?,?,?,?,NOW())");


            pstm.setString(1, proId);
            ResultSet rs = pstm.executeQuery();
            String pName = "";
            String pModel = "";
            String pBrand = "";
            int productStock = 0;
            int inventoryCostPerUnit = 0;
            int inventoryTotalCostPrice = 0;
            int inventorySalesPerUnit = 0;
            int inventoryTotalSalesPrice = 0;
            while (rs.next()) {
                pName = rs.getString("productName");
                productStock = rs.getInt("stock");
                inventoryCostPerUnit = rs.getInt("costPerUnit");
                inventoryTotalCostPrice = rs.getInt("totalCostPrice");
                inventorySalesPerUnit = rs.getInt("salesPerUnit");
                inventoryTotalSalesPrice = rs.getInt("totalSalesPrice");
                pModel = rs.getString("model");
                pBrand = rs.getString("brand");
                //System.out.println("productStock");
                //System.out.println(model);
                // System.out.println(brand);
            }

            pstmt.setString(1, purchaseId);
            pstmt.setString(2, transactionId);
            pstmt.setString(3, supplierId);
            pstmt.setString(4, proId);
            pstmt.setString(5, pName);
            pstmt.setString(6, pModel);
            pstmt.setString(7, pBrand);
            pstmt.setInt(8, quantity);
            pstmt.setInt(9, costPerUnit);
            pstmt.setInt(10, totalCostPrice);
            pstmt.setInt(11, transportCost);
            pstmt.setInt(12, otherCost);
            pstmt.setInt(13, totalProductCost);
            pstmt.setInt(14, payment);
            pstmt.setInt(15, payable);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                System.out.println("success");
            }

            int updateStock = productStock + quantity;
            int updateTotalCost = totalProductCost + inventoryTotalCostPrice;
            int updateCostPerUnit = updateTotalCost / updateStock;
            int updateTotalSales = updateStock * salesPerUnit;

            pstmt2.setInt(1, updateStock);
            pstmt2.setInt(2, updateCostPerUnit);
            pstmt2.setInt(3, updateTotalCost);
            pstmt2.setInt(4, salesPerUnit);
            pstmt2.setInt(5, updateTotalSales);
            pstmt2.setString(6, proId);
            pstmt2.executeUpdate();
            //For transaction
            int cash=payment+transportCost+otherCost;
            pstm5.setString(1,transactionId);
            pstm5.setInt(2,totalProductCost);
            pstm5.setString(3,"payment");
            pstm5.setInt(4,cash);
            pstm5.setInt(5,payable);
            pstm5.executeUpdate();
            //for get payable pstmt3
            int sumTotalPayable=0;
           // int sumPayment=0;
            ResultSet rs2= pstm3.executeQuery();
         while(rs2.next()){
              sumTotalPayable=rs2.getInt("SUM(newPayable)");
             // sumPayment=rs2.getInt("SUM(payment)");
            // System.out.println(totalPayable);
             //System.out.println(payment);
         }
         
         
      // int previousPayable=sumTotalPayable-sumPayment;
         
           
        //
        int totalPayable=payable+sumTotalPayable;
       
            
         pstmt4.setString(1,proId);
         pstmt4.setString(2,transactionId);
         pstmt4.setString(3,pName);
         pstmt4.setInt(4,quantity);
         pstmt4.setInt(5,costPerUnit);
         pstmt4.setInt(6,totalCostPrice);
         pstmt4.setInt(7,payment);
         pstmt4.setInt(8,payable);
         pstmt4.setInt(9,sumTotalPayable);
         pstmt4.setInt(10,totalPayable);
         pstmt4.executeUpdate();
         
         //FOR supplier Table
         pstm6.setInt(1,totalPayable);
         pstm6.setString(2,supplierId);
         pstm6.executeUpdate();
         
         //FOR EXPENSE
         int amount=transportCost+otherCost;
         pstm7.setString(1,transactionId);
         pstm7.setString(2,purchaseId);
         pstm7.setString(3,"PurchaseCost");
         pstm7.setInt(4,amount);
         pstm7.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   

}
