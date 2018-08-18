<%-- 
    Document   : viewAllExpense
    Created on : Jun 25, 2018, 7:08:14 PM
    Author     : Rezaul sabuj
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                    <h3 style="color: whitesmoke; padding: 20px">Expense detail's</h3>
                </center>
            </div>
           
            <div class="p-3 mb-2 bg-info text-white">
                <table class="table table-striped">
                    <thead>
                        <tr>
                      
                            <th>expense Name</th>
                            <th>voucher no</th>
                            <th>amount</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${ai}" var="a">
                            <tr>
                                 <td>${a.voucherNo}</td>
                                <td>${a.expenseName}</td>
                                <td>${a.amount}</td>
                                <td><a href="">Delete</a></td>
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
