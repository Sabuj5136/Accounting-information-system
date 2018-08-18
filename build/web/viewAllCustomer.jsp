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
            <div style="height: 100px; background-color: darkcyan">
                <center>
                    <h3 style="color: whitesmoke; padding: 20px">All Customer Information</h3>
                </center>
            </div>
           
            <div class="p-3 mb-2 bg-info text-white">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Customer Id</th>
                            <th>Name</th>
                            <th>Company Name</th>
                            <th>Phone</th>
                            <th>receivable</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${ai}" var="a">
                            <tr>
                                <th scope="row">${a.customerId}</th>
                                <td>${a.name}</td>
                                <td>${a.phone}</td>
                                <td>${a.companyName}</td>
                                <td>${a.receivable}</td>
                                <td><a href="">Delete</a></td>
                                <td><a href="cusDetails.htm?customerId=${a.customerId}">Details</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>
            <div class="background-color: darkcyan" style="height: 15px">

            </div>
            <div class="p-3 mb-2 bg-info text-white" style="height: 100px; border: 2px #ccc solid">
                <p style="padding: 25px">Legacy Ltd Company, All rights reserved.</p>
            </div>

        </div>
    </body>
</body>
</html>
