/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.invoice;

import com.exam.connectionDatabase.IncrementDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Rezaul sabuj
 */
public class ReportDAO {
     public void pdf() {
         IncrementDAO id=new IncrementDAO();
       // String uv=id.doIncrement2("9001","invoiceId","sales");
        String uv="9012";
        String customerName="Rakibul hasan";
        
        try {
            System.out.println("Start ....");

            String jrxmlFileName = "D:/apcl/bill.jrxml";
            String jasperFileName = "D:/apcl/bill.jasper";
           String pdfFileName = "D:/apcl/"+uv+".pdf";

            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/informationsystem", "root", "apcl123456");
            HashMap hm = null;
            // Create arguments
            // Map params = new HashMap();
           
            
             hm = new HashMap();
             hm.put("p1", uv);
             hm.put("p2", customerName);
            // hm.put("p3", comName);
            
             
             

            // Generate jasper print
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, hm, conn);

            // Export pdf file
            JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);

            JOptionPane.showMessageDialog(null, "Done");
            System.out.println(uv);

        } catch (Exception e) {
            System.out.print("Exception" + e);
        }
            
    
     }
}
