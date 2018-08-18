/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import com.exam.cashReceive.CashReceive;
import com.exam.cashReceive.CashReceiveDAO;
import com.exam.customer.CustomerDAO;
import com.exam.customer.CustomerDetails;
import com.exam.expense.Expense;
import com.exam.expense.ExpenseDAO;
import com.exam.invoice.SalesDAO;
import com.exam.product.ProductDAO;
import com.exam.purchase.PurchaseDAO;
import com.exam.purchaseReport.PurchaseReportMonth;
import com.exam.purchaseReport.PurchaseReportMonthDAO;
import com.exam.report.SalesReport;
import com.exam.report.SalesReportByDate;
import com.exam.report.SalesReportByDateDAO;
import com.exam.report.SalesReportDAO;
import com.exam.report.TodaySalesReport;
//import com.exam.report.TodaysReport;
import com.exam.sales.Invoice;
import com.exam.sales.InvoiceDAO;
//import com.exam.sales.invoice.SalesDAO;
//import com.exam.purchase.PurchaseDAO;
import com.exam.supplier.SupplierDAO;
import com.exam.supplier.SupplierDetails;
import com.exam.user.UserDAO;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("save.htm")
    public String doSave(@Valid @ModelAttribute("user") User us, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "reg";
        }
        UserDAO ud = new UserDAO();
        ud.doSave(us);
        return "login";
    }

    @RequestMapping("login.htm")
    public String doLogin(@Valid @ModelAttribute("user") User us, BindingResult result, Model m) {
        UserDAO ud = new UserDAO();
        if (ud.doLogin(us.getId(), us.getPassword())) {
            int sales = ud.getSales();
            m.addAttribute("ai", sales);
            int purchase = ud.getPurchase();
            m.addAttribute("pi", purchase);
            int expense = ud.getExpense();
            m.addAttribute("ex", expense);
            int cost = ud.getCostOfGoodSold();
            m.addAttribute("qi", cost);
            int receivable = ud.getReceivable();
            m.addAttribute("re", receivable);
            return "template";
        } else {
            return "login";
        }

    }

    /////////////////////////this method is called for addNewProductPage.To get all Product id.
    @RequestMapping("getProductId.htm")
    public String getProductId(Model m) {
        ProductDAO pd = new ProductDAO();
        List<String> li = new ArrayList();
        li = pd.getProductId();
        m.addAttribute("pid", li);
        return "addNewProduct";
    }

    @RequestMapping("saveNewProduct.htm")
    public String saveNewProduct(@Valid @ModelAttribute("product") Product iv, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "addNewProduct";
        }
        ProductDAO pd = new ProductDAO();
        pd.saveNewProduct(iv);
        return "template";
    }

    @RequestMapping("saveNewSupplier.htm")
    public String saveNewSupplier(@Valid @ModelAttribute("supplier") Supplier s, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "addSupplier";
        }
        SupplierDAO sd = new SupplierDAO();
        sd.saveNewSupplier(s);
        List<Supplier> li = new ArrayList();
        li = sd.showAllSupplier();
        m.addAttribute("ai", li);
        return "viewAllSupplier";
       
    }

    @RequestMapping("saveNewCustomer.htm")
    public String saveNewCustomer(@Valid @ModelAttribute("customer") Customer c, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "addNewCustomer";

        }
        CustomerDAO cd = new CustomerDAO();
        cd.saveNewCustomer(c);
         List<Customer> li = new ArrayList();
         li = cd.viewAllCustomer();
        m.addAttribute("ai", li);
        return "viewAllCustomer";
    }

    @RequestMapping("getProductId2.htm")//for purchase2 jsp page
    public String getProductId2(Model m) {
        ProductDAO pd = new ProductDAO();
        SupplierDAO sd = new SupplierDAO();
        List<String> li = new ArrayList();
        List<String> si = new ArrayList();
        li = pd.getProductId();
        si = sd.getSupplierId();
        m.addAttribute("pid", li);
        m.addAttribute("sid", si);
        return "purchase2";
    }

    @RequestMapping("savePurchase.htm")
    public String doSavePurchase(@Valid @ModelAttribute("purchase") Purchase pr, BindingResult result, Model m) {

        PurchaseDAO pd = new PurchaseDAO();
        pd.purchaseSave(pr);
        List<Product> li = new ArrayList();
        ProductDAO ps = new ProductDAO();
        li = ps.viewProductList();
        m.addAttribute("ai", li);
        return "viewInventory";
       
    }
//for getting customerId
    @RequestMapping("getCustomerId.htm")
    public String getCustomerId(@ModelAttribute("customer") Customer cr, Model m) {
        CustomerDAO cd = new CustomerDAO();
        List<String> ci = new ArrayList();
        ci = cd.getCustomerId();
        m.addAttribute("cid", ci);
        return "invoice";
    }

    @RequestMapping("temporary.htm")
    public String doSaveTemporary(@Valid @ModelAttribute("invoice") Invoice ic, BindingResult result, Model m) {
        InvoiceDAO id = new InvoiceDAO();
        id.saveInvoice(ic);
        List<Invoice> li = new ArrayList();
        li = id.findAll();
        int total = id.grandSum();
        m.addAttribute("ai", li);
        m.addAttribute("ti", total);
        CustomerDAO cd = new CustomerDAO();
        List<String> ci = new ArrayList();
        ci = cd.getCustomerId();
        m.addAttribute("cid", ci);
        return "invoice";
    }

    @RequestMapping("cancel.htm")
    public String doCancelInvoice(@ModelAttribute("invoice") Invoice ic, Model m) {
        InvoiceDAO id = new InvoiceDAO();
        id.deleteTempo();
        List<Invoice> li = new ArrayList();
        li = id.findAll();
        m.addAttribute("ai", li);
        return "invoice";
    }

    @RequestMapping("saveInvoice.htm")
    public String doInvoice(@ModelAttribute("sales") Sales sa, Model m) {
        SalesDAO sd = new SalesDAO();
        sd.doInvoice(sa);
        sd.bill();
        sd.pdfFile();
        return "printPdf";
       
    }

    //show All supplier.......
    @RequestMapping("viewAllSupplier.htm")
    public String showAllSupplier(@ModelAttribute("supplier") Supplier sup, Model m) {
        SupplierDAO sd = new SupplierDAO();
        List<Supplier> li = new ArrayList();
        li = sd.showAllSupplier();
        m.addAttribute("ai", li);
        return "viewAllSupplier";
    }

    @RequestMapping("upSupplier.htm")
    public String upSupplier(@ModelAttribute("supplier") Supplier sup, Model m) {
        SupplierDAO sd = new SupplierDAO();
        List<Supplier> li = new ArrayList();
        li = sd.showAllSupplier();
        m.addAttribute("ai", li);
        return "editSupplier";
    }

    @RequestMapping("updateSupplier.htm")
    public String updateSupplier(@ModelAttribute("supplier") Supplier sup, Model m) {
        SupplierDAO sd = new SupplierDAO();
        sd.updateSupplier(sup);
        List<Supplier> li = new ArrayList();
        li = sd.showAllSupplier();
        m.addAttribute("ai", li);
        return "viewAllSupplier";
    }

    @RequestMapping("viewProductList.htm")
    public String viewProductList(@ModelAttribute("product") Product pr, Model m) {
        ProductDAO pd = new ProductDAO();
        List<Product> li = new ArrayList();
        li = pd.viewProductList();
        m.addAttribute("ai", li);
        return "viewProductList";
    }

    @RequestMapping("viewAllCustomer.htm")
    public String viewAllCustomer(@ModelAttribute("Customer") Product cu, Model m) {
        CustomerDAO cd = new CustomerDAO();
        List<Customer> li = new ArrayList();
        li = cd.viewAllCustomer();
        m.addAttribute("ai", li);
        return "viewAllCustomer";
    }

    @RequestMapping("viewInventory.htm")
    public String viewInventory(@ModelAttribute("product") Product pr, Model m) {
        ProductDAO pd = new ProductDAO();
        List<Product> li = new ArrayList();
        li = pd.viewProductList();
        m.addAttribute("ai", li);
        return "viewInventory";
    }

    @RequestMapping("addExpense.htm")
    public String addExpense(@ModelAttribute("expense") Expense exp, Model m) {
        ExpenseDAO ed = new ExpenseDAO();
        ed.addExpense(exp);
        return "template";
    }

    @RequestMapping("viewAllExpense.htm")
    public String viewAllExpense(@ModelAttribute("expense") Expense exp, Model m) {
        ExpenseDAO ed = new ExpenseDAO();
        List<Expense> li = new ArrayList();
        li = ed.viewAllExpense();
        m.addAttribute("ai", li);
        return "viewAllExpense";

    }

    @RequestMapping("todayInfo.htm")
    public String todayInfo(Model m) {
        UserDAO ud = new UserDAO();
        int sales = ud.getSales();
        m.addAttribute("ai", sales);
        int purchase = ud.getPurchase();
        m.addAttribute("pi", purchase);
        int expense = ud.getExpense();
        m.addAttribute("ex", expense);
        int cost = ud.getCostOfGoodSold();
        m.addAttribute("qi", cost);
        int receivable = ud.getReceivable();
        m.addAttribute("re", receivable);
        int payable=ud.getTodayPayable();
        m.addAttribute("pa",payable);
        int cRecive=ud.cashReceive();
        m.addAttribute("cr",cRecive);
        int cPayment=ud.cashPayment();
        m.addAttribute("pay", cPayment);
        int tIncome=ud.getTodayIncome();
        m.addAttribute("ti",tIncome);

        return "todayInfo";
    }
     @RequestMapping("cashReceiveFromCustomer.htm")
    public String getCustoId(@ModelAttribute("customer") Customer cr,Model m) {
        CustomerDAO cd = new CustomerDAO();
        List<String> ci = new ArrayList();
        ci = cd.getCustomerId();
        m.addAttribute("cid", ci);
        return "cashReceiveFromCustomer";
    }
     @RequestMapping("cashReceive.htm")
    public String addReceiveAmount(@ModelAttribute("cashReceive") CashReceive cr,Model m) {
        CashReceiveDAO cc=new CashReceiveDAO();
        cc.addRecieveAmount(cr);
        return "template";
    }
    
    @RequestMapping("homeInfo.htm")
    public String goHome(Model m){
        UserDAO ud=new UserDAO();
            int sales = ud.getSales();
            m.addAttribute("ai", sales);
            int purchase = ud.getPurchase();
            m.addAttribute("pi", purchase);
            int expense = ud.getExpense();
            m.addAttribute("ex", expense);
            int cost = ud.getCostOfGoodSold();
            m.addAttribute("qi", cost);
            int receivable = ud.getReceivable();
            m.addAttribute("re", receivable);
            return "template";
    }
    @RequestMapping("sReport.htm")
    public String createReport(@ModelAttribute("sales") Sales sr,Model m){
        SalesReportDAO sd=new SalesReportDAO();
        List<Sales> li=new ArrayList();
        li=sd.doReport(sr);
        if(li.size()>0){
         m.addAttribute("ai",li);
        //String m1=sd.getMonth();
       // m.addAttribute("mi", m1);
        return "viewSalesReport";
        }else{
            return "error";
        }
    }
    
    public static void main(String[] args) {
        SalesReportDAO sd=new SalesReportDAO();
        List<SalesReport> li=new ArrayList();
        
        //li=sd.doReport();
        
        System.out.println(li);
    }
    
    
    
    
    @RequestMapping("dReport.htm")
    public String createDateReport(@ModelAttribute("salesReportByDate") Sales sr,Model m){//THIS IS FOR Viewing data according to selected date-- JSP PAGE
        SalesReportByDateDAO sd=new SalesReportByDateDAO();
        List<Sales> li=new ArrayList<>();
        li=sd.reportDate(sr);
        if(li.size()>0){
            m.addAttribute("ji", li);
        String x=sd.showDate1();
        m.addAttribute("xi", x);
        String q=sd.showDate2();
        m.addAttribute("qi", q);
        return "viewSalesReportByDate";
        }else{
            return "error";
        }
        
    }
    @RequestMapping("spdf.htm")
    public String createpdfReport(@ModelAttribute("sales") Sales sr, Model m){//THIS IS FOR  PDF BETWEEN TWO DATE.
        SalesReportByDateDAO sd=new SalesReportByDateDAO();
        sd.pdf(sr.getFromdate(),sr.getTodate());
        return "printPdf";
        
    }
    @RequestMapping("vsr.htm")
    public String createpdfMonth(@ModelAttribute("salesReportDAO") SalesReportDAO sr, Model m){//THIS FOR CRETATING PDF-Monthly;
        SalesReportDAO sd=new SalesReportDAO();
        sd.pdf2();
        return "printPdf";
    }
    @RequestMapping("dailypdf.htm")
    public String createpdfDaily(@ModelAttribute("sales") Sales sa,Model m){//jsp page-for viewing today's sales information
        TodaySalesReport tdr=new TodaySalesReport();
        List<Sales> li=new ArrayList<>();
        li=tdr.todayPdfReport();
        if(li.size()>0){
            m.addAttribute("ai",li);
        return "viewTodaySalesReport";
        }else{
            return "error";
        }
    }
    
    @RequestMapping ("dailyPdfReport.htm")
    public String creDailyReport(@ModelAttribute("todaySalesReport") TodaySalesReport ts, Model m){//creting pdf file 
        ts.pdf3();
        return "printPdf";
    }
    
    @RequestMapping("supDetails.htm")
    public String detailsOfSupplier(@ModelAttribute("supplier") Supplier s,Model m){//for Supplier Personal details
        SupplierDAO sd=new SupplierDAO();
        List<SupplierDetails> li=new ArrayList();
        li=sd.detailsOfSupplier(s);
        m.addAttribute("di", li);
        String sk=sd.showSupplierId();
        m.addAttribute("ski", sk);
        return "viewSupplierDetails";
        
    }
    
    @RequestMapping("cusDetails.htm")
    public String detailsOfCustomer(@ModelAttribute("customer") Customer c,Model m){
        CustomerDAO cd=new CustomerDAO();
        List<CustomerDetails> li=new ArrayList();
        li=cd.detailsOfCustomer(c);
        m.addAttribute("si",li);
        return "viewCustomerDetails";
    }
    
    @RequestMapping("purchaseMonthly.htm")
    public String MonthlyPurchaseReport(@ModelAttribute("purchaseReportMonthDAO") PurchaseReportMonthDAO pd,Model m){
        List<PurchaseReportMonth> li=new ArrayList();
       li= pd.doMonthlyPurchaseReport();
       m.addAttribute("ji", li);
        return "viewMonthlyProductReport";
    }
}
