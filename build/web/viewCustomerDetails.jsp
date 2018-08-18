<%-- 
    Document   : viewAllCustomer
    Created on : Jun 21, 2018, 11:07:34 AM
    Author     : Rezaul sabuj
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
  
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
        <style>
            .fieldset {
                border: 2px solid #ccc;
                padding: 10px;
            }
        </style>
    </head>
    <body>
        <div class="container" style="height: 650px">
            <div style="height: 100px; background-color: #1c7430">
                <ul class="nav navbar-nav navbar-right" style="padding-right: 18px">
                            <li><a style="color: white" href="homeInfo.htm"><span class="glyphicon glyphicon-blackboard"></span>Go Home</a></li>
                        </ul>
                <center>
                    <h3 style="color: whitesmoke; padding: 20px">Customer Information</h3>
                </center>
            </div>
           
            <div class="p-3 mb-2 bg-info text-white">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Invoice id</th>
                            <th>total Sales</th>
                            <th>Payment</th>
                            <th>New Receivable</th>
                            <th>Previous Receivable</th>
                            <th>Total Receivable</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${si}" var="a">
                            <tr>
                                <th scope="row">${a.invoiceId}</th>
                                <td>${a.salesValue}</td>
                                <td>${a.payment}</td>
                                <td>${a.newReceivable}</td>
                                <td>${a.previousReceivable}</td>
                                <td>${a.totalReceivable}</td>
                               
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>
            <div class="background-color: darkcyan" style="height: 15px">

            </div>
            <div class="p-3 mb-2 bg-info text-white" style="height: 100px; border: 2px #ccc solid">
                <p style="padding: 25px">Rangs Ltd Company, All rights reserved.</p>
            </div>

        </div>
    </body>
</body>
</html>
