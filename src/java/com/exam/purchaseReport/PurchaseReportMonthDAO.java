/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.purchaseReport;

import com.exam.connectionDatabase.ConnectionDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rezaul sabuj
 */
public class PurchaseReportMonthDAO {
    private String selectMonth;
    private String selectYear;

    public PurchaseReportMonthDAO() {
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
    String from="";
    String to="";
    
    String cFdate="";
    String ctdate="";
    
    public List<PurchaseReportMonth> doMonthlyPurchaseReport(){
        if (selectMonth.equals("January")) {
            from = "01-01";
            to = "31-01";
        }
        if (selectMonth.equals("February")) {
            from = "01-02";
            to = "28-02";
        }
        if (selectMonth.equals("March")) {
            from = "01-03";
            to = "31-03";
        }
        if (selectMonth.equals("April")) {
            from = "01-04";
            to = "30-04";
        }
        if (selectMonth.equals("May")) {
            from = "01-05";
            to = "31-05";
        }
        if (selectMonth.equals("June")) {
            from = "01-06";
            to = "30-06";
        }
        if (selectMonth.equals("July")) {
            from = "01-07";
            to = "31-07";
        }
        if (selectMonth.equals("August")) {
            from = "01-08";
            to = "31-08";
        }
        if (selectMonth.equals("September")) {
            from = "01-09";
            to = "30-09";

        }
        if (selectMonth.equals("October")) {
            from = "01-10";
            to = "31-09";
        }
        if (selectMonth.equals("November")) {
            from = "01-11";
            to = "30-11";
        }
        if (selectMonth.equals("December")) {
            from = "01-12";
            to = "31-12";
        }

        cFdate = from + "-" + selectYear;
        ctdate = to + "-" + selectYear;
        JOptionPane.showMessageDialog(null,cFdate+"cFdate");
        List<PurchaseReportMonth> li=new ArrayList<>();
        try{
            JOptionPane.showMessageDialog(null,"in the try catch");
            DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date dt1 = sdf.parse(cFdate);
            Date dt2 = sdf.parse(ctdate);
            java.sql.Date d1 = new java.sql.Date(dt1.getTime());
            java.sql.Date d2 = new java.sql.Date(dt2.getTime());
            JOptionPane.showMessageDialog(null, d1);
            JOptionPane.showMessageDialog(null, d2);
            ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM purchase  WHERE (date between '" + d1 + "' and '" + d2 + "')");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
              
                PurchaseReportMonth pm=new PurchaseReportMonth();
               
                pm.setSupplierId(rs.getString("supplierId"));
                pm.setProductId(rs.getString("productId"));
                pm.setProductName(rs.getString("productName"));
                
                pm.setModel(rs.getString(rs.getString("model")));
                pm.setBrand(rs.getString("brand"));
                
                pm.setQuantity(rs.getString("quantity"));
                pm.setTotalCost(rs.getString("totalCostPrice"));
                pm.setTransportCost(rs.getString("transportCost"));
                pm.setOtherCost(rs.getString("otherCost"));
                pm.setTotalProductCost(rs.getString("totalProductCost"));
                li.add(pm);
                            

            }
          
        }catch(Exception e){
            e.printStackTrace();
        }
        return li;
    }
    
}
