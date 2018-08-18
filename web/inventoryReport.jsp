<%-- 
    Document   : inventoryReport
    Created on : Jul 5, 2018, 12:44:37 AM
    Author     : Rezaul sabuj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
   <style>
            .navbar {
                margin-bottom: 0;
                border-radius: 0;
            }


            footer {
                background-color: #f2f2f2;
                padding: 25px;
            }
            .dropbtn {
                background-color: darkcyan;
                color: white;
                padding: 17px;
                padding-left: 20px;
                font-size: 16px;
                border: none;
            }

            .dropdown {
                position: relative;
                display: inline-block;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f1f1f1;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
            }

            .dropdown-content a:hover {background-color: #ddd}

            .dropdown:hover .dropdown-content {
                display: block;
            }

            .dropdown:hover .dropbtn {
                background-color: #3e8e41;
            }
            .fieldset {
                border: 2px solid #ccc;
                padding: 10px;
            }
        </style>
    </head>
    <body>

        <div class="container" style="height: 650px">
            
            <div style="height: 100px; background-color: darkcyan">
                <ul class="nav navbar-nav navbar-right" style="padding-right: 18px">
                            <li><a style="color: white" href="login.jsp"><span class="glyphicon glyphicon-log-in"></span>Sign In</a></li>
                        </ul>
                <center>
                    <h3 style="color: whitesmoke; padding: 20px">Lagacy Electronics Bangladesh Ltd</h3>
                    <h4 style="color: whitesmoke;">Report archive</h4>
                </center>
                
            </div>
            <div class="p-3 mb-2 bg-info text-white">

                <fieldset class="fieldset" >
                    <legend>Search</legend>
                    <div class="dropdown"  style="padding-left: 280px; padding-bottom: 30px">
                        <form class="form-horizontal" action="searchind.htm">
                             <button class="dropbtn">Date wise Report</button>
                        </form>
                    </div>
                    
                    <div class="dropdown" style="padding-left: 40px">
                        <form class="form-horizontal" action="searchSchool.htm">
                             <button class="dropbtn">Product wise Report</button>
                        </form>
                    </div>
                    
                    <div class="dropdown" style="padding-left: 40px">
                        <form class="form-horizontal" action="doViewInformationAdInfo.htm">
                             <button class="dropbtn">View Information</button>
                        </form>
                    </div>
                    

                </fieldset>
            </div>
            <div class="background-color: darkcyan" style="height: 15px">

            </div>
            <div class="p-3 mb-2 bg-info text-white" style="height: 100px; border: 2px #ccc solid">
                <p style="padding: 25px">©2005-2018 Lagacy Ltd, All rights reserved.</p>
            </div>

        </div>

    </body>
</html>