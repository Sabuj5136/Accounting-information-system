<%-- 
    Document   : viewAllSupplier
    Created on : Jun 20, 2018, 8:42:57 PM
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
                 <ul class="nav navbar-nav navbar-right" style="padding-right: 18px">
                            <li><a style="color: white" href="homeInfo.htm"><span class="glyphicon glyphicon-blackboard"></span>Go Home</a></li>
                        </ul>
                <center>
                    <h3 style="color: whitesmoke; padding: 20px">All Supplier Information</h3>
                </center>
            </div>
           
            <div class="p-3 mb-2 bg-info text-white">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Supplier Id</th>
                            <th>Name</th>
                            <th>Phone</th>
                            <th>Company Name</th>
                            <th>Net Payable</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${ai}" var="a">
                            <tr>
                                <th scope="row">${a.supplierId}</th>
                                <td>${a.name}</td>
                                <td>${a.phone}</td>
                                <td>${a.companyName}</td>
                                <td>${a.payable}</td>
                                <td><a href="upSupplier.htm?supplierId=${a.supplierId}&name=${a.name}&phone=${a.phone}&companyName=${a.companyName}">Edit</a></td>
                                <td><a href="">Delete</a></td>
                                <td> <a href="supDetails.htm?supplierId=${a.supplierId}">Details</a></td>
                                
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
