<%-- 
    Document   : reg
    Created on : Jun 8, 2018, 11:12:15 PM
    Author     : Rezaul sabuj
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" style="height: 660px">
            <div style="height: 120px; background-color: #1c7430">
                <div class="collapse navbar-collapse" id="myNavbar">
                    <center>
                <h2 style="color: whitesmoke; padding: 20px">Accounting Information System</h2>
                
                
                </center>
                    </div>
                
            </div>
            <div class="p-3 mb-2 bg-info text-danger">

                <fieldset class="fieldset">
                    <legend>User Registration</legend>

                    <form class="form-horizontal" action="save.htm">

                        <div class="form-group">
                            <label class="control-label col-sm-2" for="pwd">User id:</label>
                            <div class="col-sm-5">          
                                <input type="text" class="form-control" id="pwd" placeholder="Enter Admin id" name="id">
                                 <form:errors path="user.id"/>

                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="pwd">Name:</label>
                            <div class="col-sm-5">          
                                <input type="text" class="form-control" id="pwd" placeholder="Enter Password" name="name">
                                 <form:errors path="user.name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="pwd">Email:</label>
                            <div class="col-sm-5">          
                                <input type="text" class="form-control" id="pwd" placeholder="Enter Password" name="email">
                                 <form:errors path="user.email"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="pwd">password:</label>
                            <div class="col-sm-5">          
                                <input type="text" class="form-control" id="pwd" placeholder="Enter Password" name="password">
                                 <form:errors path="user.password"/>
                            </div>
                        </div>
                        
                        <div class="form-group">        
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-success">Submit</button>
                            </div>
                        </div>
                       
                    </form>
                </fieldset>
            </div>
            
        </div>
    </body>
</html>
