<%-- 
    Document   : invoice
    Created on : Jun 10, 2018, 9:23:28 PM
    Author     : Rezaul sabuj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body style="background-color: #AAA">
        <div class="container">
            <div class="row"
                 <div style="height: 120px; background-color: #002752">
                    <div class="collapse navbar-collapse" id="myNavbar">
                         <ul class="nav navbar-nav navbar-right" style="padding-right: 18px">
                            <li><a style="color: white" href="homeInfo.htm"><span class="glyphicon glyphicon-blackboard"></span>Go Home</a></li>
                        </ul>
                        <center>
                            <h2 style="color: whitesmoke; padding-top: 20px">Rangs Electronics Ltd.</h2>
                            <h4 style="color: whitesmoke;">Email:Rangs45@gmail.com</h4>

                        </center>
                    </div>


                </div>
                <div>
                    <hr>

                    <h2>Create Customer Invoice</h2>
                    <span class="clearfix"></span>
                    <hr>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <form class="form-horizontal" action="saveInvoice.htm">

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
                                <label for="inputPassword3" class="col-sm-3 control-label">Gross Sales:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control"  placeholder="Gross Sales"  value="${ti}"  name="grossSales" id="total">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-3 control-label">Discount:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control"  placeholder="Discount amount" name="discount" id="discount" onkeyup="f1()">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-3 control-label">Transport Cost:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control"  placeholder="Transport amount" id="transport" name="transport"  onkeyup="f2()">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-3 control-label">net Sales:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="netAmount" placeholder="net sales amount" name="netSales">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-3 control-label">Payment:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="payment" placeholder="Payment amount" onkeyup="f3()" name="payment">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPassword3" class="col-sm-3 control-label">Receivable:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="balance" placeholder="Receivable amount" name="receivable">
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-sm-offset-5 col-sm-7">
                                    <button type="submit" class="btn btn-danger">Submit</button>
                                </div>
                            </div>

                        </form>

                    </div>
                    <div class="col-sm-6">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>Product id:</th>
                                    <th>Product name:</th>
                                    <th>Model</th>
                                    <th>Unit price(sales)</th>
                                    <th>Quantity</th>
                                    <th>Total</th>

                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${ai}" var="s">
                                <tr>
                                    <td>${s.id}</td>
                                    <td>${s.name}</td>
                                    <td>${s.model}</td>
                                    <td>${s.unitPrice}</td>
                                    <td>${s.quantity}</td>
                                    <td>${s.total}</td>
                                </tr>
                            </c:forEach>

                            </tbody>
                        </table>
                        <div class="row">
                            <div class="col-sm-3">
                                <form action="sales.jsp">
                                    <input type="submit" class="btn btn-info" value="sell more Product"/><span></span>

                                </form>
                            </div>
                            <div class="col-sm-2">
                                <form action="cancel.htm">
                                    <input type="submit" class="btn btn-info" value="Refresh"/><span></span>

                                </form>
                            </div>

                        </div>
                    </div>

                </div>
            </div>
        </div>
        <script>
             function f1() {

                        var total = parseInt(document.getElementById("total").value);
                        var discount = parseInt(document.getElementById("discount").value);
                        var netAmount1 = (total - discount);
                        document.getElementById("netAmount").value = netAmount1;
                    }
                    function f2() {
                        var total = parseInt(document.getElementById("total").value);
                        var discount = parseInt(document.getElementById("discount").value);
                        var transport = parseInt(document.getElementById("transport").value);
                        var netAmount2 = (total - discount);
                        var net = (netAmount2 - transport);
                        document.getElementById("netAmount").value = net;
                    }
                    function f3() {
                        var payment = parseInt(document.getElementById("payment").value);
                        var netAmount = parseInt(document.getElementById("netAmount").value);
                        var netAmount3 = (netAmount - payment);
                        document.getElementById("balance").value = netAmount3;
                    }
        </script>
    </body>
</html>
