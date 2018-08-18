<%-- 
    Document   : login
    Created on : Jun 8, 2018, 11:11:18 PM
    Author     : Rezaul sabuj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body style="background-color: #b1dfbb">
        <div class="container">
            <div style="height: 120px; background-color: #048277">
                <div class="collapse navbar-collapse" id="myNavbar">
                    <center>
                        <h2 style="color: whitesmoke; padding: 20px">Accounting Information System</h2>


                    </center>
                </div>

            </div>
            <div class="p-3 mediatext-justify" style="background-color: #b1dfbb">

                <fieldset class="fieldset">
                    <legend>Admin Login</legend>

                    <form class="form-horizontal" action="login.htm">

                        <div class="form-group">
                            <label class="control-label col-sm-2" for="pwd">User id:</label>
                            <div class="col-sm-5">          
                                <input type="text" class="form-control" id="pwd" placeholder="Enter Admin id" name="id">
                                
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="pwd">password:</label>
                            <div class="col-sm-5">          
                                <input type="password" class="form-control" id="pwd" placeholder="Enter Password" name="password">
                              

                            </div>
                        </div>

                        <div class="form-group">        
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-success">Submit</button>
                            </div>
                        </div>
                         <div class="form-group">        
                            <div class="col-sm-offset-2 col-sm-10">
                                if You have no Account,Please<a href="reg.jsp"> Click here</a> for Registration.
                            </div>
                        </div>
                    </form>
                </fieldset>
            </div>


        </div>





    </body>
</body>
</html>
