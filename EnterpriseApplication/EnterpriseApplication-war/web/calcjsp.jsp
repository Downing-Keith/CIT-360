<%-- 
    Document   : calcjsp
    Created on : Nov 3, 2017, 12:20:16 PM
    Author     : Keith Downing
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ADDITION SERVLET</h1>
        <br>
        <form action="calcservlet" method="POST">
            <input type="text" name="t1">
            <input type="text" name="t2">
            <input type="submit" value="ADD">
        </form>
    </body>
</html>
