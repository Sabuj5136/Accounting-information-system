<%-- 
    Document   : cashReceiveFromCustomer
    Created on : Jun 26, 2018, 9:15:11 PM
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
    <body style="background-color:">
        <div class="container">
            <div class="row" style="height: 120px; background-color: #333">
                <div class="collapse navbar-collapse" id="myNavbar">
                    <center>
                        <h2 style="color: whitesmoke; padding-top: 20px">Rangs Electronics Ltd.</h2>
                        <h4 style="color: whitesmoke;">Email:Rangs45@gmail.com</h4>
                      

                    </center>
                </div>


            </div>
            <div class="row bg-success">
                <hr style="border-color: #002752">

                <h2>Cash receive from Customer</h2>
                <span class="clearfix"></span>
                <hr  style="border-color: #002752">
            </div>

            <div  class="row bg-success" style="background-color:">
                <div class=" col-sm-offset-3 col-sm-6">
                    <form class="form-horizontal" action="cashReceive.htm">
                         <div class="form-group">
                                <label for="inputPassword3" class="col-sm-3 control-label">Customer Id:</label>
                                <div class="col-sm-9">
                                    <select class="form-control" name="customerId">
                                        <c:forEach items="${cid}" var="s">
                                            <option>${s}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Amount:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Receive amount" name="amount">
                              
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
                            <div class="row">
                <div class="p-3 mb-2 bg-success text-white" style="height: 100px; border: 2px #ccc solid">
                    <p style="padding: 25px">Rangs Ltd Company, All rights reserved.</p>
                </div>
                </div>
                </div>
                <script>
                    function mm() {
                        window.alert("<%=ss.showCustomerId()%>");
                    }
                </script>
                </body>
                </html>


