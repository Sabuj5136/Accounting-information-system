<%-- 
    Document   : addExpense
    Created on : Jun 25, 2018, 6:05:06 PM
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
    <body style="background-color: #67b168">
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

                <h2>Input Expense</h2>
                <span class="clearfix"></span>
                <hr  style="border-color: darkslateblue">
            </div>

            <div style="background-color: #67b168">
                <div class=" col-sm-offset-3 col-sm-6">
                    <form class="form-horizontal" action="addExpense.htm">
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Expense Name:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder=" Enter expense name:" name="expenseName">
                                <form:errors path="customer.name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">voucherNo:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Enter Voucher no" name="voucherNo">
                                
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Amount:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Enter amount" name="amount">
                                 
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
            <script>
                function mm(){
                    window.alert("<%=ss.showCustomerId()%>");
                }
            </script>
    </body>
</html>


