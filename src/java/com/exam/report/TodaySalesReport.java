/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.report;

import com.exam.Sales;
import com.exam.connectionDatabase.ConnectionDatabase;
import static com.exam.report.SalesReportDAO.cFdate;
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
public class TodaySalesReport {

    public List<Sales> todayPdfReport() {
        //public static void main(String[] args) {

        List<Sales> li = new ArrayList();
        Date d1 = new java.util.Date();
        System.out.println(d1);
        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.sql.Date d2 = new java.sql.Date(d1.getTime());
        System.out.println(d2);
        try {
            ConnectionDatabase ced = new ConnectionDatabase();
            Connection con = ced.doConnect();
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM sales  WHERE date='" + d2 + "'");
            ResultSet rs = pstmt.executeQuery();
            String b = "";
            while (rs.next()) {
                Sales sa = new Sales();
                sa.setInvoiceId(rs.getString("invoiceId"));
                sa.setCustomerName(rs.getString("customerName"));
                sa.setGrossSales(rs.getInt("grossSales"));
                sa.setDiscount(rs.getInt("discount"));
                sa.setTransport(rs.getInt("transport"));
                sa.setNetSales(rs.getInt("netSales"));
                sa.setReceivable(rs.getInt("receivable"));
                li.add(sa);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return li;
    }

    public void pdf3() {
        
        

        Random rand = new Random();
        int n = rand.nextInt(10987650) + 1;
        String name = n + " " + "report";

        try {

            Date d1 = new java.util.Date();
            //System.out.println(d1);
            DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String d2= sdf.format(d1);
            Date dd3=sdf.parse(d2);
            //JOptionPane.showMessageDialog(null,dd3+" dd3");
            java.sql.Date dt1 = new java.sql.Date(dd3.getTime());

            //JOptionPane.showMessageDialog(null, dt1 + "go to try catch33333");
            String jrxmlFileName = "D:/abc/todaySales.jrxml";
            String jasperFileName = "D:/abc/todaySales.jasper";
            String pdfFileName = "D:/abc/" + name + ".pdf";

            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/informationsystem", "root", "apcl123456");
            HashMap hm = null;
            // Create arguments
            // Map params = new HashMap();

            //////// DateFormat sdf=new SimpleDateFormat("yyy-MM-dd");
            ///////// Date dt1=sdf.parse(cFdate);
            ////////////////String sdate=sdf.format(dt1);
            // Date dt2=sdf.parse(ctdate);
            //java.sql.Date fd1=new java.sql.Date(dt1.getTime());
            //java.sql.Date fd2=new java.sql.Date(dt2.getTime());
            // hm = new HashMap();
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("p1", new java.sql.Timestamp(dt1.getTime()));
            //pears.put("p2", fd2);
            //JOptionPane.showMessageDialog(null, dt1 + "thjjjjjjjjj");

            // Generate jasper print
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, parameters, conn);

            // Export pdf file
            JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);

            //JOptionPane.showMessageDialog(null, "Done");
            System.out.println(name);

        } catch (Exception e) {
            System.out.print("Exception" + e);
        }

    }

}
