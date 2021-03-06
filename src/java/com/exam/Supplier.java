package com.exam;
// Generated Jun 13, 2018 11:43:00 AM by Hibernate Tools 4.3.1

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Supplier generated by hbm2java
 */
public class Supplier implements java.io.Serializable {

    private String supplierId;
    @NotEmpty
    private String name;
    @NotEmpty
    private String phone;
    @NotEmpty
    private String companyName;
    private Integer payable;

    public Supplier() {
    }

    public Supplier(String supplierId) {
        this.supplierId = supplierId;
    }

    public Supplier(String supplierId, String name, String phone, String companyName, Integer payable) {
        this.supplierId = supplierId;
        this.name = name;
        this.phone = phone;
        this.companyName = companyName;
        this.payable = payable;
    }

    public String getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getPayable() {
        return this.payable;
    }

    public void setPayable(Integer payable) {
        this.payable = payable;
    }
    
   

}
