<%-- 
    Document   : index
    Created on : 10 oct. 2018, 17:19:14
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="CSS/estilo.css">
        <title>CALCULADORA</title>
    </head>
    <body>
        <%@ include file = "../INC/imagenLateral.jsp" %>

        <form action="Controlador" method="post" class="right">
            <h1>CALCULATOR</h1>
            
            <fieldset>
                <div id="introDatos">
                <label>Primer operando:</label><input id="entrada" type="number" name="operando1"/><br/>
                <label>Segundo operando:</label><input id="entrada" type="number" name="operando2"/>
                </div>
                
                Sumar<input id="operandos" name="operacion" value="Sumar" type="radio" checked="checked">  
                Restar<input id="operandos" name="operacion" value="Restar" type="radio">  
                Multiplicar<input id="operandos" name="operacion" value="Multiplicar" type="radio">    
                Dividir<input id="operandos" name="operacion" value="Dividir" type="radio">
                <br/>
                <br/>
                <button type="submit" name="calcular" value="calcular"><span>Calcular</span></button>
                <button type="reset" name="Limpiar" value="Limpiar"><span>Limpiar</span></button>
                
                
            </fieldset>
            
        </form>
    </body>
</html>
