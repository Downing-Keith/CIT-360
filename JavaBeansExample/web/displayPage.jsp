<%-- 
    Document   : displayPage
    Created on : Oct 9, 2017, 6:58:07 PM
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
        <jsp:useBean id="student" scope="request" class="MyPackage.BeanTest1"/>
        USN : <jsp:getProperty name="student" property="usn"/>
        Name : <jsp:getProperty name="student" property="name"/>
        Course : <jsp:getProperty name="student" property="course"/>
    </body>
</html>
