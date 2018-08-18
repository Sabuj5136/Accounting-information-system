<%-- 
    Document   : addNewCustomer
    Created on : Jun 9, 2018, 6:11:27 PM
    Author     : Rezaul sabuj
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.exam.customer.CustomerDAO" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body style="background-color: #686868;">
        <div class="container">
            <div style="height: 120px; background-color: #333">
                <div class="collapse navbar-collapse" id="myNavbar">
                    <center>
                        <h2 style="color: whitesmoke; padding-top: 20px">Rangs Electronics Ltd.</h2>
                        <h4 style="color: whitesmoke;">Email:Rangs45@gmail.com</h4>

                    </center>
                </div>


            </div>
            <div>
                <hr style="border-color: #002752">

                <h2>Add new Customer</h2>
                <span class="clearfix"></span>
                <hr  style="border-color: #002752">
            </div>

            <div style="background-color: #1c7430">
                <div class=" col-sm-offset-3 col-sm-6">
                    <form class="form-horizontal" action="saveNewCustomer.htm">
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Customer name:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Customer name:" name="name">
                                <form:errors path="customer.name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Customer Phone:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Customer Phone" name="phone">
                                <form:errors path="customer.phone"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">CompanyName:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Customer Company name" name="companyName">
                                  <form:errors path="customer.companyName"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-offset-5 col-sm-7">
                                <button type="submit" class="btn btn-danger" onclick="mm()">Submit</button>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
            <script>
                function mm(){
                    window.alert("<%=ss.showCustomerId()%>");
                }
            </script>
    </body>
</html>


