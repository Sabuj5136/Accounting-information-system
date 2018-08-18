/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.purchaseReport;

/**
 *
 * @author Rezaul sabuj
 */
public class PurchaseReportMonth {
       private String supplierId;
       private String productId;
       private String productName;
       private String model;
       private String brand;
       private String quantity;
       private String totalCost;
       private String transportCost;
       private String otherCost;
       private String totalProductCost;
       private String payment;
       private String payable;

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(String transportCost) {
        this.transportCost = transportCost;
    }

    public String getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(String otherCost) {
        this.otherCost = otherCost;
    }

    public String getTotalProductCost() {
        return totalProductCost;
    }

    public void setTotalProductCost(String totalProductCost) {
        this.totalProductCost = totalProductCost;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPayable() {
        return payable;
    }

    public void setPayable(String payable) {
        this.payable = payable;
    }
       
}
