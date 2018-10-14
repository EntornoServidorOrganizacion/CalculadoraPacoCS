<%-- 
    Document   : resultado
    Created on : 11 oct. 2018, 13:42:41
    Author     : paco
--%>

<%@page import="es.albarregas.beans.CalculadoraDatos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="../CSS/estilo.css">
    </head>

    <body>
        <%@ include file = "../INC/imagenLateral.jsp" %>

        <form class="right">
            <h1>CALCULATOR</h1>

            <fieldset>
                <%
                    CalculadoraDatos cal=(CalculadoraDatos)request.getAttribute("resultado");
                %>

                <p>El resultado de <%=cal.getOperando1()%> <%=cal.getSignoOperacion()%> <%=cal.getOperando2()%> es: </p><br/>
                <p><strong id="firulais"><%=cal.getResultado()%></strong></p><br/>
                <a href="<%=request.getContextPath()%>">Menú</a>

            </fieldset>

        </form>
    </body>
</html>
