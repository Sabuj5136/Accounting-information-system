package com.exam;
// Generated Jun 13, 2018 11:43:00 AM by Hibernate Tools 4.3.1

import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 */
public class Product implements java.io.Serializable {

    private String productId;
    @NotEmpty
    private String productName;
    private Integer stock;
    private Integer costPerUnit;
    private Integer totalCostPrice;
    private Integer salesPerUnit;
    private Integer totalSalesPrice;
    @NotEmpty
    private String model;
    @NotEmpty
    private String brand;
    private Integer serial;

    public Product() {
    }

    public Product(String productId) {
        this.productId = productId;
    }

    public Product(String productId, String productName, Integer stock, Integer costPerUnit, Integer totalCostPrice, Integer salesPerUnit, Integer totalSalesPrice, String model, String brand) {
        this.productId = productId;
        this.productName = productName;
        this.stock = stock;
        this.costPerUnit = costPerUnit;
        this.totalCostPrice = totalCostPrice;
        this.salesPerUnit = salesPerUnit;
        this.totalSalesPrice = totalSalesPrice;
        this.model = model;
        this.brand = brand;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCostPerUnit() {
        return this.costPerUnit;
    }

    public void setCostPerUnit(Integer costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public Integer getTotalCostPrice() {
        return this.totalCostPrice;
    }

    public void setTotalCostPrice(Integer totalCostPrice) {
        this.totalCostPrice = totalCostPrice;
    }

    public Integer getSalesPerUnit() {
        return this.salesPerUnit;
    }

    public void setSalesPerUnit(Integer salesPerUnit) {
        this.salesPerUnit = salesPerUnit;
    }

    public Integer getTotalSalesPrice() {
        return this.totalSalesPrice;
    }

    public void setTotalSalesPrice(Integer totalSalesPrice) {
        this.totalSalesPrice = totalSalesPrice;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

}
