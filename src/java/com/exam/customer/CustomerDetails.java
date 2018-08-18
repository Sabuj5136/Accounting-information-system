/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.customer;

/**
 *
 * @author Rezaul sabuj
 */
public class CustomerDetails {
    private String invoiceId;
    private int salesValue;
    private int payment;
    private int newReceivable;
    private int previousReceivable;
    private int totalReceivable;

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(int salesValue) {
        this.salesValue = salesValue;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getNewReceivable() {
        return newReceivable;
    }

    public void setNewReceivable(int newReceivable) {
        this.newReceivable = newReceivable;
    }

    public int getPreviousReceivable() {
        return previousReceivable;
    }

    public void setPreviousReceivable(int previousReceivable) {
        this.previousReceivable = previousReceivable;
    }

    public int getTotalReceivable() {
        return totalReceivable;
    }

    public void setTotalReceivable(int totalReceivable) {
        this.totalReceivable = totalReceivable;
    }
}
