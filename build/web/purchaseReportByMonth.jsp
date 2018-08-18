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

                <h2>View purchase Information and Create Report</h2>
                <span class="clearfix"></span>
                <hr  style="border-color: #002752">
            </div>

            <div style="background-color: #1c7430">
                <div class=" col-sm-offset-3 col-sm-6">
                    <form class="form-horizontal" action="purchaseMonthly.htm">
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-3 control-label">Select Month</label>
                            <div class="col-sm-9">
                             <select class="form-control" name="selectMonth">
                                        <option >January</option>
                                        <option >February</option>
                                        <option >March</option>
                                        <option >April</option>
                                        <option >May</option>
                                        <option >June</option>
                                        <option >July</option>
                                        <option >August</option>
                                        <option >September</option>
                                        <option >October</option>
                                        <option >November</option>
                                        <option >December</option>
                                </select>
                            </div>
                        </div>
                        
                        
                        <div class="form-group">
                             <label for="inputPassword3" class="col-sm-3 control-label">Select Year</label>
                            <div class="col-sm-9">
                             <select class="form-control" name="selectYear">
                                        <option >2019</option>
                                        <option >2018</option>
                                        <option >2017</option>
                                        <option >2016</option>
                                        <option >2015</option>
                                        <option >2014</option>
                                        <option >2013</option>
                                        <option >2012</option>
                                        <option >2011</option>
                                        <option >2010</option>
                                        <option >2009</option>
                                        <option >2008</option>
                                        <option >2007</option>
                                        <option >2006</option>
                                </select>
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
               
            </script>

    </body>

</html>






