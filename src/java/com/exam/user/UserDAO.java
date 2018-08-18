/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.user;

import com.exam.NewHibernateUtil;
import com.exam.User;
import com.exam.connectionDatabase.ConnectionDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Rezaul sabuj
 */
public class UserDAO {
   
    public void doSave(User us){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(us);
        s.getTransaction().commit();
        s.close();
    }
    
    public boolean doLogin(String id,String password){
         Session s=NewHibernateUtil.getSessionFactory().openSession();
         s.beginTransaction();
         Query q=s.createQuery("From User where id="+id+" and password="+password+"");
         List<User> li=q.list();
         if(li.size()>0){
             return true;
         }else{
             return false;
         }
    }
    
    int amount;
    public int getSales() {
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        
        try {
            GetDate gd = new GetDate();
            String dt = gd.getStringDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utild = df.parse(dt);
            java.sql.Date sqlD = new java.sql.Date(utild.getTime());
            PreparedStatement pstm1 = con.prepareStatement("SELECT SUM(grossSales) FROM sales where date=?");
            pstm1.setDate(1, sqlD);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                amount = rs.getInt("SUM(grossSales)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return amount;
    }
    
     int purchaseAmount;
    public int getPurchase() {
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        
        try {
            GetDate gd = new GetDate();
            String dt = gd.getStringDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utild = df.parse(dt);
            java.sql.Date sqlD = new java.sql.Date(utild.getTime());
            PreparedStatement pstm1 = con.prepareStatement("SELECT SUM(totalCostPrice) FROM purchase where date=?");
            pstm1.setDate(1, sqlD);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                purchaseAmount = rs.getInt("SUM(totalCostPrice)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return purchaseAmount;
    }
    
     int expenseAmount;
    public int getExpense() {
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        
        try {
            GetDate gd = new GetDate();
            String dt = gd.getStringDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utild = df.parse(dt);
            java.sql.Date sqlD = new java.sql.Date(utild.getTime());
            PreparedStatement pstm1 = con.prepareStatement("SELECT SUM(amount) FROM expense where expDate=?");
            pstm1.setDate(1, sqlD);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                expenseAmount = rs.getInt("SUM(amount)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return expenseAmount;
    }
    
    int cAmount;
    public int getCostOfGoodSold() {
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        
        try {
            GetDate gd = new GetDate();
            String dt = gd.getStringDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utild = df.parse(dt);
            java.sql.Date sqlD = new java.sql.Date(utild.getTime());
            PreparedStatement pstm1 = con.prepareStatement("SELECT SUM(costOfGoodSoldTotal) FROM costofgoodsold where salesDate=?");
            pstm1.setDate(1, sqlD);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                cAmount = rs.getInt("SUM(costOfGoodSoldTotal)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cAmount;
    }
    
    int rAmount;
     public int getReceivable() {
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        
        try {
            GetDate gd = new GetDate();
            String dt = gd.getStringDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utild = df.parse(dt);
            java.sql.Date sqlD = new java.sql.Date(utild.getTime());
            PreparedStatement pstm1 = con.prepareStatement("SELECT SUM(receivable) FROM sales where date=?");
            pstm1.setDate(1, sqlD);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                 rAmount= rs.getInt("SUM(receivable)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  rAmount;
    }
    
     int pAmount;
     public int getTodayPayable() {
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        
        try {
            GetDate gd = new GetDate();
            String dt = gd.getStringDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utild = df.parse(dt);
            java.sql.Date sqlD = new java.sql.Date(utild.getTime());
            PreparedStatement pstm1 = con.prepareStatement("SELECT SUM(payable) FROM purchase where date=?");
            pstm1.setDate(1, sqlD);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                 pAmount= rs.getInt("SUM(payable)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  pAmount;
    }
    
      int cashAmount;
     public int cashReceive() {
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        
        try {
            GetDate gd = new GetDate();
            String dt = gd.getStringDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utild = df.parse(dt);
            java.sql.Date sqlD = new java.sql.Date(utild.getTime());
            PreparedStatement pstm1 = con.prepareStatement("SELECT SUM(cash) FROM transaction where type=? and  date=?");
            pstm1.setString(1,"receive");
            pstm1.setDate(2,sqlD);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                 cashAmount= rs.getInt("SUM(cash)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  cashAmount;
    }
    
      int cashPayment;
     public int cashPayment() {
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        
        try {
            GetDate gd = new GetDate();
            String dt = gd.getStringDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utild = df.parse(dt);
            java.sql.Date sqlD = new java.sql.Date(utild.getTime());
            PreparedStatement pstm1 = con.prepareStatement("SELECT SUM(cash) FROM transaction where type=? and  date=?");
            pstm1.setString(1,"payment");
            pstm1.setDate(2,sqlD);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                 cashPayment= rs.getInt("SUM(cash)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  cashPayment;
    }
    
     
     public int getTodayIncome(){
         int income=amount-cAmount;
         return income;
     }
    
}
