<%-- 
    Document   : TestBeanStudent
    Created on : Oct 9, 2017, 11:52:29 AM
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
        <h1>This is my test for the TestBeans</h1>
        
        <jsp:useBean id="student" class="MyPackage.BeanTest1">
            <jsp:setProperty name="student" property="roll" value="1"/>
             <jsp:setProperty name="student" property="snm" value="Keith Downing"/>
              <jsp:setProperty name="student" property="city" value="Indiana"/>
        </jsp:useBean>
        
        <hr/>
        <h2>Student Roll: <jsp:getProperty name="student" property="roll"/></h2>
        <h2>Student Name: <jsp:getProperty name="student" property="snm"/></h2>
        <h2>Student City: <jsp:getProperty name="student" property="city"/></h2>

        <hr/>
        
    </body>
</html>
