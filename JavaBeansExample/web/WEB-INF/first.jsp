<%-- 
    Document   : first
    Created on : Oct 9, 2017, 7:01:30 PM
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
        <jsp:useBean id="stud" scope="request" class="MyPackage.BeanTest1"/>
        <jsp:setProperty name="student" property="+"/>
        <jsp:forward page="displayPage.jsp"/>
    </body>
</html>
