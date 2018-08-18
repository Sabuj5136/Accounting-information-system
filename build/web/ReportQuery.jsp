<%-- 
    Document   : addExpense
    Created on : Jun 25, 2018, 6:05:06 PM
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
    <body style="background-color: #67b168">
        <div class="container">
            <div style="height: 120px; background-color: #333">
                <div class="collapse navbar-collapse" id="myNavbar">
                    <center>
                        <h2 style="color: whitesmoke; padding-top: 20px">Legacy Electronics Ltd.</h2>
                        <h4 style="color: whitesmoke;">Email:legacy45@gmail.com</h4>

                    </center>
                </div>


            </div>
            <div>
                <hr style="border-color: #002752">

                <h2>Create Sales Report By criteria</h2>
                <span class="clearfix"></span>
                <hr  style="border-color: darkslateblue">
            </div>


            <div class="row">
                <center>
                    <div class="col-sm-4">
                        <form action="salesReportByDate.jsp">
                            <input type="submit"  class="btn btn-danger" value="Create Report by date"/>
                        </form>
                    </div>
                    <div class="col-sm-4">
                        <form action="salesReport.jsp">
                            <input type="submit"  class="btn btn-danger" value="Create Report by month"/>
                        </form>
                    </div>
                    <div  class=" col-sm-4">
                        <form action="dailypdf.htm">
                            <input type="submit"  class="btn btn-danger" value="Today's Report"/>
                        </form>
                    </div>
                </center>
            </div>
            

        </div>
       
        <script>

        </script>
    </body>
</html>


