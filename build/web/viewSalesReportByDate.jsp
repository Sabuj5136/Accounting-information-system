<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  
    
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
            <div style="height: 100px; background-color: #1e7e34">
                 <ul class="nav navbar-nav navbar-right" style="padding-right: 18px">
                     <form action="spdf.htm">
                         <input type="submit" class="btn-danger" value="Create pdf"/>
                     </form>
                        </ul>
                <center>
                    <h3 style="color: whitesmoke; padding: 20px">Sales Report</h3>
                    <h4 style="color:white">${xi} to ${qi}</h4>
                </center>
            </div>
           
            <div class="p-3 mb-2 bg-info text-white">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Product id</th>
                            <th>Customer</th>
                            <th>Gross Sales</th>
                            <th>discount</th>
                            <th>Transport Cost</th>
                            <th>net Sales</th>
                            <th>cash payment by customer</th>
                            <th>net Receivable</th>
                            
                        
                            
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${ji}" var="a">
                            <tr>
                                <th>${a.invoiceId}</th>
                                <td>${a.customerName}</td>
                                <td>${a.grossSales}</td>
                                <td>${a.discount}</td>
                                <td>${a.transport}</td>
                                <td>${a.netSales}</td>
                                <td>${a.payment}</td>
                                <td>${a.receivable}</td>
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

