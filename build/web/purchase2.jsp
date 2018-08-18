<%-- 
    Document   : purchase2
    Created on : Jun 9, 2018, 11:12:17 PM
    Author     : Rezaul sabuj
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body >
        <div class="container"  style="background-color: #9fcdff;">

            <div>
                <hr style="border-color: #002752">

                <h2>Purchase Product</h2>
                <span class="clearfix"></span>
                <hr  style="border-color: #002752">
            </div>

            <div style="background-color: #1c7430">
                <div class=" col-sm-offset-3 col-sm-6">
                    <form class="form-horizontal" action="savePurchase.htm">
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Product Id:</label>
                            <div class="col-sm-9">
                                <select class="form-control" name="productId">
                                    <c:forEach items="${pid}" var="s">
                                        <option >${s}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Supplier Id:</label>
                            <div class="col-sm-9">
                                <select class="form-control" name="supplierId">
                                    <c:forEach items="${sid}" var="s">
                                        <option>${s}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Quantity:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control"  placeholder="Customer Phone" name="quantity" id="q">
                               

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Cost Per unit:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control"  placeholder="Customer Company name" name="costPerUnit" id="c" onkeyup="f1()">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Total Cost Price:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control"  placeholder="Customer Company name" name="totalCostPrice" id="t">

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Transport Cost</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control"  placeholder="Customer Company name" name="transportCost" id="tc">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Other Cost:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control"  placeholder="Customer Company name" name="otherCost" id="oc" onkeyup="f2()">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Total Product Cost:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control"  placeholder="Customer Company name" name="totalProductCost" id="tp">

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Sales Per unit:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control"  placeholder="Customer Company name" name="salesPerUnit" id="spu">

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Payment:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="payment" placeholder="Customer Company name" name="payment" onkeyup="f3()">
                             
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Payable:</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="payable" placeholder="Customer Company name" name="payable">
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
                function f1() {
                    var q1 = parseInt(document.getElementById("q").value);
                    var c1 = parseInt(document.getElementById("c").value);
                    var t1 = q1 * c1;
                    document.getElementById("t").value = t1;
                }

                function f2() {
                    var a = parseInt(document.getElementById("t").value);
                    var b = parseInt(document.getElementById("tc").value);
                    var c = parseInt(document.getElementById("oc").value);
                    var result = a + b + c;
                    document.getElementById("tp").value = result;
                }

                function f3() {
                    var a = parseInt(document.getElementById("t").value);
                    var b = parseInt(document.getElementById("payment").value);
                    var result = a - b;
                    document.getElementById("payable").value = result;


                }
            </script>

    </body>

</html>


