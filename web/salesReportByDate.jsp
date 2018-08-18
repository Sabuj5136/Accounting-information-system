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

                <h2>View Sales Information and Create Report By date</h2>
                <span class="clearfix"></span>
                <hr  style="border-color: #002752">
            </div>

            <div style="background-color: #1c7430">
                <div class=" col-sm-offset-3 col-sm-6">
                    <form class="form-horizontal" action="dReport.htm">
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">From:</label>
                            <div class="col-sm-9">
                                <input type="date" name="fromdate"/>
                            </div>
                        </div>
                        
                        
                        <div class="form-group">
                             <label for="inputPassword3" class="col-sm-3 control-label">To:</label>
                            <div class="col-sm-9">
                                <input type="date" name="todate"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-offset-5 col-sm-7">
                                <input type="submit" value="Submit" class="btn btn-danger"/>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
            <script>
                
            </script>

    </body>

</html>






