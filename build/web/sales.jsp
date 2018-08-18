<%-- 
    Document   : sales
    Created on : Jun 10, 2018, 11:05:26 PM
    Author     : Rezaul sabuj
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="ajs/angular.min.js" type="text/javascript"></script>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="ajs/app.js" type="text/javascript"></script>
    </head>

    <body style=" background-color: steelblue">
    <body>
        <div class="container">
            <hr>

            <h2>Select Product for selling</h2>
            <span class="clearfix"></span>
            <hr>
            
            <div class="row" style=" background-color: #1b6d85">
                <div class="col-sm-4">
                    
                </div>
                <div class="col-sm-4">

                   

                 
                    <form>
                        <select class="form-control bg-primary" name="cmbDept" onchange="this.form.submit();">
                            <option value="0">Select product id</option>
                            <%
                                try {
                                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/informationsystem", "root", "apcl123456");
                                    PreparedStatement pstmt = con.prepareStatement("select distinct productId,serial from product");
                                    ResultSet rs = pstmt.executeQuery();
                                    while (rs.next()) {
                            %>
                            <option value="<%=rs.getString("serial")%>"><%=rs.getString("productId")%></option>
                            <%
                                    }
                                    con.close();
                                    rs.close();
                                } catch (Exception e) {
                                    e.printStackTrace();

                                }

                            %>
                        </select>
              </form>
                
                        <br>

                   

                        


                        <form class="form-horizontal" action="temporary.htm">


                        <%                    try {
                                Class.forName("com.mysql.jdbc.Driver").newInstance();
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/informationsystem", "root", "apcl123456");
                                PreparedStatement pstmt = con.prepareStatement("select * from product where serial=" + Integer.parseInt(request.getParameter("cmbDept")));
                                ResultSet rs = pstmt.executeQuery();
                                while (rs.next()) {
                        %>
                        <table>
                        <div class="form-group">
                            <label class="control-label col-sm-5">Product Id:</label>
                            <div class="col-sm-7">
                                <input type="text" class="form-control"  name="id" value="<%=rs.getString("productId")%>"   placeholder="Enter email">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5">Product Name:</label>
                            <div class="col-sm-7">
                                <input type="text" class="form-control" value="<%=rs.getString("productName")%>" name="name" placeholder="Enter email">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5">Model</label>
                            <div class="col-sm-7">
                                <input type="text" class="form-control" value="<%=rs.getString("model")%>" name="model" placeholder="Enter fullname">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5">Stock </label>
                            <div class="col-sm-7">
                                <input type="text" class="form-control" value="<%=rs.getString("stock")%>"  id="stock">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5">sales Per(unit)</label>
                            <div class="col-sm-7">
                                <input type="text" class="form-control" value="<%=rs.getString("salesPerUnit")%>" name="unitPrice" id="s1" placeholder="Enter fullname">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5">Quantity</label>
                            <div class="col-sm-7">
                                <input type="text" class="form-control" placeholder="Enter fullname" name="quantity" id="q1" onkeyup="f1()">
                             
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5">Total</label>
                            <div class="col-sm-7">
                                <input type="text" class="form-control" placeholder="Enter fullname" id="result" name="total">
                                                             

                            </div>
                        </div>
                       

                        <div class="form-group">
                            <div class="col-sm-offset-6 col-sm-6">
                                <button type="submit" class="btn btn-success" ng-click="save()" data-dismiss="modal" >Save</button>
                            </div>
                        </div>
                        </table>

                        <%
                                }
                                rs.close();
                                con.close();

                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }


                        %>

                    </form> 
                        
                </div>

        </div>
  </div>


                        <script>
                            function f1(){
                            var a=parseInt(document.getElementById("s1").value);
                            var st=parseInt(document.getElementById("stock").value);
                            var b=parseInt(document.getElementById("q1").value);
                            var s=st-b;
                            
                            if(s<0){
                                window.alert("Stock is not available");
                            }else{
                                var ab=a*b;
                             document.getElementById("result").value=ab;
                            }
                            
                            
                        }
                        
                        </script>
       
    </body>
</html>
</body>
</html>
