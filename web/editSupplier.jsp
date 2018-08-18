<%-- 
    Document   : editSupplier
    Created on : Jun 20, 2018, 9:05:21 PM
    Author     : Rezaul sabuj
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.exam.supplier.SupplierDAO" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body style="background-color: whitesmoke;">
        <div class="container">
        
            <div>
                <hr style="border-color: #002752">
           
            <h2>Edit Supplier Information</h2>
            <span class="clearfix"></span>
            <hr  style="border-color: #002752">
            </div>
            
            <div style="background-color: #1c7430">
                <div class=" col-sm-offset-3 col-sm-6">
                    <form class="form-horizontal" action="updateSupplier.htm">
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Supplier Id:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" placeholder="Supplier name" name="supplierId" value="${supplier.supplierId}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Supplier name:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Supplier name" name="name" value="${supplier.name}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Supplier Phone:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Supplier Phone" name="phone" value="${supplier.phone}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">CompanyName:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Supplier Company name" name="companyName" value="${supplier.companyName}">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <div class="col-sm-offset-5 col-sm-7">
                                <button type="submit" class="btn btn-danger">Submit</button>
                            </div>
                        </div>
                        
                    </form>
                </div>
               
           
    </div>
       
    
        </div>      
    </body>
</html>

