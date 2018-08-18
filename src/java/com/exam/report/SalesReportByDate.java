/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.report;

/**
 *
 * @author Rezaul sabuj
 */
public class SalesReportByDate {
    private String todate;
    private String fromdate;
    private String id;
    private String cusName;
    private int grossSales;
    private int discount;
    private int transport;
    private int netSales;
    private int payment;
    private int receivable;

   
 public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getNetSales() {
        return netSales;
    }

    public void setNetSales(int netSales) {
        this.netSales = netSales;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getReceivable() {
        return receivable;
    }

    public void setReceivable(int receivable) {
        this.receivable = receivable;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

   
    
    
}
