<%-- 
    Document   : addNewProduct
    Created on : Jun 9, 2018, 2:28:29 PM
    Author     : Rezaul sabuj
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.exam.product.ProductDAO" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body style="background-color: #985f0d">
        <div class="container">
        <div style="height: 120px; background-color: #048277">
                <div class="collapse navbar-collapse" id="myNavbar">
                    <center>
                        <h2 style="color: whitesmoke; padding-top: 20px">Rangs Electronics Ltd.</h2>
                        <h4 style="color: whitesmoke;">Email:Rangs45@gmail.com</h4>

                    </center>
                </div>
            

            </div>
            <div>
                 <hr>
           
            <h2>Add new Product for inventory</h2>
            <span class="clearfix"></span>
            <hr>
            </div>
            
            <div style="background-color: #1c7430">
                <div class=" col-sm-offset-3 col-sm-6">
                    <form class="form-horizontal" action="saveNewProduct.htm">
                        
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Product name</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="product name" name="productName">
                                <form:errors path="product.productName"/>

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Model</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Product model" name="model">
                                 <form:errors path="product.model"/>

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Product Brand</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="inputPassword3" placeholder="Product brand" name="brand">
                                 <form:errors path="product.brand"/>

                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-5 col-sm-7">
                                <button type="submit" class="btn btn-danger" onclick="m2()">Add Product</button>
                            </div>
                        </div>
                        
                    </form>
                </div>
    </div>
        </div>
        <script>
            function m2(){
                window.alert("<%=ss.getPid()%>");
            }
        </script>
    </body>
</html>
