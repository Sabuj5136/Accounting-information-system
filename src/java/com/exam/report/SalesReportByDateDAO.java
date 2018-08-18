/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.report;

import com.exam.Sales;
import com.exam.connectionDatabase.ConnectionDatabase;
import com.exam.connectionDatabase.IncrementDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Rezaul sabuj
 */
public class SalesReportByDateDAO {
     String cFdate="";
     String ctdate="";
   public List<Sales> reportDate(Sales sd){
       //SalesReportByDate sr=new SalesReportByDate();
       cFdate=sd.getFromdate();
       ctdate=sd.getTodate();
      List<Sales> li=new ArrayList<>();
        // JOptionPane.showMessageDialog(null, cFdate);
       //  JOptionPane.showMessageDialog(null, "you");
       try{
          
           DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dt1 = sdf.parse(cFdate);
            Date dt2 = sdf.parse(ctdate);
            java.sql.Date d1 = new java.sql.Date(dt1.getTime());
            java.sql.Date d2 = new java.sql.Date(dt2.getTime());
            //JOptionPane.showMessageDialog(null, d1);
            //JOptionPane.showMessageDialog(null, d2);
            ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM sales  WHERE (date between '" + d1 + "' and '" + d2 + "')");
            ResultSet rs = pstmt.executeQuery();
                                //JOptionPane.showMessageDialog(null, "try");

            while(rs.next()){
                Sales sl=new Sales();
                sl.setInvoiceId(rs.getString("customerId"));
                sl.setCustomerName(rs.getString("customerName"));
                sl.setGrossSales(rs.getInt("grossSales"));
                sl.setDiscount(rs.getInt("discount"));
                sl.setTransport(rs.getInt("transport"));
                sl.setNetSales(rs.getInt("netSales"));
                sl.setPayment(rs.getInt("payment"));
                sl.setReceivable(rs.getInt("receivable"));
                li.add(sl);
                 //JOptionPane.showMessageDialog(null, "try");
            }
            
       }catch(Exception e){
           e.printStackTrace();
       }
       return li;
   }
   
   public String showDate1(){
       return cFdate;
   }
   public String showDate2(){
       return ctdate;
   }
   
   public void pdf(String cFdate1,String ctdate2) {
         //FindNewTransactionId fni=new FindNewTransactionId();
       // int uv=fni.doIncrement("5001");
      
     //JOptionPane.showMessageDialog(null,"pdf");
       //JOptionPane.showMessageDialog(null,cFdate1+"this is date");
       
       
       
       
       
      
       Random rand=new Random();
       int n=rand.nextInt(10987650)+1;
       String name=n+" "+"report"; 
        
        try {
            
           
            
           // JOptionPane.showMessageDialog(null,"go to try catch");
            String jrxmlFileName = "D:/abc/bymonth.jrxml";
            String jasperFileName = "D:/abc/bymonth.jasper";
           String pdfFileName = "D:/abc/"+name+".pdf";
           
            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/informationsystem", "root", "apcl123456");
            HashMap hm = null;
            
             
         
             DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
             Date dt1=sdf.parse(cFdate1);
             Date dt2=sdf.parse(ctdate2);
              //String sdate=sdf.format(dt1);
            
             Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("p1",new java.sql.Timestamp(dt1.getTime())); 
            parameters.put("p2",new java.sql.Timestamp(dt2.getTime())); 
             //pears.put("p2", fd2);
             //JOptionPane.showMessageDialog(null,sdate+"youyou");
             
             

            // Generate jasper print
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, parameters, conn);

            // Export pdf file
            JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);

            //JOptionPane.showMessageDialog(null, "Done");
            System.out.println(name);
         Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler D:/abc/" + name + ".pdf");

        } catch (Exception e) {
            System.out.print("Exception" + e);
        }
            
    
     }

   
}
