<%-- 
    Document   : todayInfo
    Created on : Jun 26, 2018, 4:51:09 PM
    Author     : Rezaul sabuj
--%>

<%@page import="java.util.Date"%>
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
            <div class="container">
                <div style="height: 120px; background-color: #333">
                    <div class="collapse navbar-collapse" id="myNavbar">
                         <ul class="nav navbar-nav navbar-right" style="padding-right: 18px">
                            <li><a style="color: white" href="homeInfo.htm"><span class="glyphicon glyphicon-blackboard"></span>Go Home</a></li>
                        </ul>
                        <center>
                            <h2 style="color: whitesmoke; padding-top: 20px">Today's Information</h2>
                            <h4 style="color: whitesmoke;"><%=new Date()%></h4>

                        </center>
                    </div>


                </div>
                <div>
                    <div class="col-sm-3  p-3 mb-2 bg-info text-white">
                        <div class="p-3 mb-2 bg-info text-white">
                            <table class="table table-striped">
                                <thead>
                                <th style="text-align: center">Serial no</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">1.</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">2.</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">3.</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">4.</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">5.</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">6.</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">7.</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">8.</th>
                                </thead>
                            </table>
                        </div>

                    </div>
                    <div class="col-sm-6 p-3 mb-2 bg-info text-white">
                        <div class="p-3 mb-2 bg-info text-white">
                            <table class="table table-striped">

                                <thead>
                                <th style="text-align: center">Account Titles</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">Purchase</th>
                                </thead>

                                <thead>
                                <th style="text-align: center">Sales</th>
                                </thead>

                                <thead>
                                <th style="text-align: center">Expense</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">Cost of Good Sold</th>
                                </thead>

                                <thead>
                                <th style="text-align: center">Accounts Receivable</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">Accounts Payable</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">Cash Receive</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">Cash Payment</th>
                                </thead>

                            </table>

                        </div>

                    </div>
                    <div class="col-sm-3  p-3 mb-2 bg-info text-white">
                        <div class="p-3 mb-2 bg-info text-white">
                            <table class=" table table-striped">

                                <thead>
                                <th style="text-align: center">amount</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">${pi}</th>
                                </thead>

                                <thead>
                                <th style="text-align: center">${ai}</th>
                                </thead>

                                <thead>
                                <th style="text-align: center">${ex}</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">${qi}</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">${re}</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">${pa}</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">${cr}</th>
                                </thead>
                                <thead>
                                <th style="text-align: center">${pay}</th>
                                </thead>

                            </table>
                        </div>
                    </div>
                </div>
                <div>

                    <div class="col-sm-offset-4  p-3 mb-2 bg-info text-white">
                        <h3> Today income by selling product ${ti}Tk.</h3>
                    </div>

                    <div class="p-3 mb-2 bg-success text-white" style="height: 100px; border: 2px #ccc solid">
                        <p style="padding: 25px">Rangs Ltd Company, All rights reserved.</p>
                    </div>
                </div>

            </div>
    </body>
</body>
</html>
