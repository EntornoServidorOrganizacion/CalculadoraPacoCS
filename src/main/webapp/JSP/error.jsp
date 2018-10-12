<%-- 
    Document   : error
    Created on : 11 oct. 2018, 13:33:54
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <p><%=request.getAttribute("error")%></p>
        <a href="<%=request.getContextPath()%>">Menú</a>
    </body>
</html>
