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
                <center>
                    <h3 style="color: whitesmoke; padding: 20px"> ${ski} Information</h3>
                </center>
            </div>
           
            <div class="p-3 mb-2 bg-info text-white">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ProductId</th>
                            <th>ProductName</th>
                            <th>Quantity</th>
                            <th>Unit Cost</th>
                            <th>TotalCost</th>
                            <th>Payment</th>
                            <th>newPayable</th>
                            <th>PreviousPayable</th>
                            <th>Total Payable</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${di}" var="d">
                            <tr>
                                <th>${d.productId}</th>
                                <td>${d.productName}</td>
                                <td>${d.quantity}</td>
                                <td>${d.unitCostPrice}</td>
                                <td>${d.totalCost}</td>
                                <td>${d.payment}</td>
                                <td>${d.newPayable}</td>
                                <td>${d.previousPayable}</td>
                                <td>${d.totalPayable}</td>
                               
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
