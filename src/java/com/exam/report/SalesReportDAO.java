/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.report;

import com.exam.Sales;
import com.exam.connectionDatabase.ConnectionDatabase;
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
 * @author l2pc208m
 */
public class SalesReportDAO {
    
    
    String from = "";
    String to = "";
    static String cFdate;
    static String ctdate;
    
    public List<Sales> doReport(Sales sr) {
           String mm=sr.getSelectMonth();
            String yy=sr.getSelectYear();
        if (mm.equals("January")) {
            from = "01-01";
            to = "31-01";
        }
        if (mm.equals("February")) {
            from = "01-02";
            to = "28-02";
        }
        if (mm.equals("March")) {
            from = "01-03";
            to = "31-03";
        }
        if (mm.equals("April")) {
            from = "01-04";
            to = "30-04";
        }
        if (mm.equals("May")) {
            from = "01-05";
            to = "31-05";
        }
        if (mm.equals("June")) {
            from = "01-06";
            to = "30-06";
        }
        if (mm.equals("July")) {
            from = "01-07";
            to = "31-07";
        }
        if (mm.equals("August")) {
            from = "01-08";
            to = "31-08";
        }
        if (mm.equals("September")) {
            from = "01-09";
            to = "30-09";

        }
        if (mm.equals("October")) {
            from = "01-10";
            to = "31-09";
        }
        if (mm.equals("November")) {
            from = "01-11";
            to = "30-11";
        }
        if (mm.equals("December")) {
            from = "01-12";
            to = "31-12";
        }

        cFdate = from + "-" + yy;
        ctdate = to + "-" + yy;

        //JOptionPane.showMessageDialog(null,mm);
        //JOptionPane.showMessageDialog(null,to);
       // JOptionPane.showMessageDialog(null, cFdate);
        List<Sales> li = new ArrayList();
        try {
            DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date dt1 = sdf.parse(cFdate);
            Date dt2 = sdf.parse(ctdate);
            java.sql.Date d1 = new java.sql.Date(dt1.getTime());
            java.sql.Date d2 = new java.sql.Date(dt2.getTime());
           // JOptionPane.showMessageDialog(null, d1);
            //JOptionPane.showMessageDialog(null, d2);
            ConnectionDatabase cd = new ConnectionDatabase();
            Connection con = cd.doConnect();
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM sales  WHERE (date between '" + d1 + "' and '" + d2 + "')");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Sales ss = new Sales();
                ss.setInvoiceId(rs.getString("invoiceId"));
                ss.setCustomerName(rs.getString("customerName"));
                ss.setGrossSales(rs.getInt("grossSales"));
                ss.setDiscount(rs.getInt("discount"));
                ss.setTransport(rs.getInt("transport"));
                ss.setNetSales(rs.getInt("netSales"));
                ss.setPayment(rs.getInt("payment"));
                ss.setReceivable(rs.getInt("receivable"));
                //JOptionPane.showMessageDialog(null, "IN RESULTSET");
                li.add(ss);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return li;
    }

  //  public String getMonth() {
       // String c = "On " + mm + " " + yy;
        //return c;
    //}

    public void pdf2() {
        //FindNewTransactionId fni=new FindNewTransactionId();
        // int uv=fni.doIncrement("5001");

        //JOptionPane.showMessageDialog(null, "pdf");
       // JOptionPane.showMessageDialog(null, cFdate + "this is date");
        String dd = String.valueOf(cFdate);
        String cc = String.valueOf(ctdate);

        Random rand = new Random();
        int n = rand.nextInt(10987650) + 1;
        String name = n + " " + "report";

        try {
            //JOptionPane.showMessageDialog(null, dd + "in try catch");

            DateFormat dft = new SimpleDateFormat("dd-MM-yyyy");
            Date dd2 = dft.parse(dd);
            java.sql.Date dt1 = new java.sql.Date(dd2.getTime());

            Date dd3 = dft.parse(cc);
            java.sql.Date dt2 = new java.sql.Date(dd3.getTime());

           // JOptionPane.showMessageDialog(null, dt1 + "go to try catch33333");
            String jrxmlFileName = "D:/abc/bymonth.jrxml";
            String jasperFileName = "D:/abc/bymonth.jasper";
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
            parameters.put("p2", new java.sql.Timestamp(dt2.getTime()));
            //pears.put("p2", fd2);
            //JOptionPane.showMessageDialog(null, dt1 + "thjjjjjjjjj");

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
