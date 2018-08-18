<%-- 
    Document   : test
    Created on : Jun 9, 2018, 3:44:31 PM
    Author     : Rezaul sabuj
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
        <select>
            <c:forEach items="${pid}" var="s">
                <option>${s}</option>
            </c:forEach>
        </select>
         </div>
        <div class="form-group" style="padding-left: 100px">
                            <label class="control-label col-sm-4" for="pwd">School:</label>
                            <div class="col-sm-5">          
                                <input list="browsers" type="text" class="form-control" id="pwd" placeholder="Enter School Name:" name="school">
                                <datalist id="browsers">
                                    <c:forEach items="${pid}" var="a">
                                    <option value="${a}">
                                    </c:forEach>
                                    
                                </datalist>
                            </div>
                        </div>
    </body>
</html>
