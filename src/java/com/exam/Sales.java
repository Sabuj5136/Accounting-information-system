package com.exam;
// Generated Jun 13, 2018 11:43:00 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Sales generated by hbm2java
 */
public class Sales  implements java.io.Serializable {


     private String invoiceId;
     private String transactionId;
     private String customerId;
     private String customerName;
     private String phone;
     private Integer grossSales;
     private Integer discount;
     private Integer transport;
     private Integer netSales;
     private Integer payment;
     private Integer receivable;
     private Date date;
     private String selectMonth;
     private String selectYear;
     

    public Sales() {
    }

	
    public Sales(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    public Sales(String invoiceId, String transactionId, String customerId, String customerName, String phone, Integer grossSales, Integer discount, Integer transport, Integer netSales, Integer payment, Integer receivable, Date date) {
       this.invoiceId = invoiceId;
       this.transactionId = transactionId;
       this.customerId = customerId;
       this.customerName = customerName;
       this.phone = phone;
       this.grossSales = grossSales;
       this.discount = discount;
       this.transport = transport;
       this.netSales = netSales;
       this.payment = payment;
       this.receivable = receivable;
       this.date = date;
    }
   
    public String getInvoiceId() {
        return this.invoiceId;
    }
    
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Integer getGrossSales() {
        return this.grossSales;
    }
    
    public void setGrossSales(Integer grossSales) {
        this.grossSales = grossSales;
    }
    public Integer getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public Integer getTransport() {
        return this.transport;
    }
    
    public void setTransport(Integer transport) {
        this.transport = transport;
    }
    public Integer getNetSales() {
        return this.netSales;
    }
    
    public void setNetSales(Integer netSales) {
        this.netSales = netSales;
    }
    public Integer getPayment() {
        return this.payment;
    }
    
    public void setPayment(Integer payment) {
        this.payment = payment;
    }
    public Integer getReceivable() {
        return this.receivable;
    }
    
    public void setReceivable(Integer receivable) {
        this.receivable = receivable;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    static String fromdate;
    static String todate;

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public String getSelectMonth() {
        return selectMonth;
    }

    public void setSelectMonth(String selectMonth) {
        this.selectMonth = selectMonth;
    }

    public String getSelectYear() {
        return selectYear;
    }

    public void setSelectYear(String selectYear) {
        this.selectYear = selectYear;
    }




}


