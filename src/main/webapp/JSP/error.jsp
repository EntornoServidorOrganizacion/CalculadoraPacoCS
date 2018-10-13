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
        <link rel="stylesheet" type="text/css" href="../CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="../CSS/estilo.css">
        <style>
            
            p{
                color: red;
            }
            
        </style>
    </head>
    <body>
        <%@ include file = "../INC/imagenLateral.jsp" %>

        <form class="right">
            <h1>CALCULATOR</h1>

            <fieldset>

                <p>ERROR: <%=request.getAttribute("error")%></p>
                <a href="<%=request.getContextPath()%>">Menú</a>

            </fieldset>

        </form>
    </body>
</html>
