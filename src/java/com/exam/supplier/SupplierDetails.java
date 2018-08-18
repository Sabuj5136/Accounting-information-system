/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.supplier;

import com.exam.Supplier;
import java.util.List;

/**
 *
 * @author Rezaul sabuj
 */
   public class SupplierDetails{
       private String productId;
       private String productName;
       private int quantity;
       private int unitCostPrice;
       private int totalCost;
       private int payment;
       private int newPayable;
       private int previousPayable;
       private int totalPayable;

    public SupplierDetails() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitCostPrice() {
        return unitCostPrice;
    }

    public void setUnitCostPrice(int unitCostPrice) {
        this.unitCostPrice = unitCostPrice;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getNewPayable() {
        return newPayable;
    }

    public void setNewPayable(int newPayable) {
        this.newPayable = newPayable;
    }

    public int getPreviousPayable() {
        return previousPayable;
    }

    public void setPreviousPayable(int previousPayable) {
        this.previousPayable = previousPayable;
    }

    public int getTotalPayable() {
        return totalPayable;
    }

    public void setTotalPayable(int totalPayable) {
        this.totalPayable = totalPayable;
    }
       
       
} 
