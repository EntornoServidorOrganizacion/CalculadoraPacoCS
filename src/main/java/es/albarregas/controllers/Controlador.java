/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.beans.CalculadoraDatos;
import es.albarregas.exceptions.ExcepcionDividirPorCero;
import es.albarregas.models.Divisor;
import es.albarregas.models.Multiplicador;
import es.albarregas.models.Restador;
import es.albarregas.models.Sumador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paco
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        /**
         * Error diciendo que estamos intentando acceder sin pasar por el
         * formulario de entrada. Añadir enlace en el archivo de error.jsp
         */
        request.setAttribute("error", "Estás intentando acceder de forma errónea a la calculadora, por favor vuelva al menú principal");
        request.getRequestDispatcher("JSP/error.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        CalculadoraDatos cal = new CalculadoraDatos();//instanciada la clase CalculadoraDatos

        String url;

        //instanciadas las clases correspondientes a los métodos de las operaciones
        Multiplicador mul = new Multiplicador();
        Divisor div = new Divisor();
        Sumador sum = new Sumador();
        Restador res = new Restador();

        //obtener valores de los operandos, vienen como String y hay que pasarlos a integer o double si así estubieran definidos
        int ope1 = Integer.parseInt(request.getParameter("operando1"));
        int ope2 = Integer.parseInt(request.getParameter("operando2"));
        cal.setOperando1(ope1);
        cal.setOperando2(ope2);

        try {
            if (request.getParameter("operacion") != null) {
                if (request.getParameter("operacion").equals("Sumar")) {
                    cal.setResultado(sum.Sumar(ope1, ope2));
                    cal.setSignoOperacion("+");
                } else if (request.getParameter("operacion").equals("Restar")) {
                    cal.setResultado(res.Restar(ope1, ope2));
                    cal.setSignoOperacion("-");
                } else if (request.getParameter("operacion").equals("Multiplicar")) {
                    cal.setResultado(mul.Multiplicar(ope1, ope2));
                    cal.setSignoOperacion("*");
                } else if (request.getParameter("operacion").equals("Dividir")) {
                    cal.setResultado(div.Dividir(ope1, ope2));
                    cal.setSignoOperacion("/");

                }
            }

            request.setAttribute("resultado", cal);
            url = "JSP/resultado.jsp";

        /*} catch (NumberFormatException ex) {
            url = "JSP/error.jsp";
            request.setAttribute("error", "Debes introducir valores numéricos");*/
        } catch (ExcepcionDividirPorCero ex) {
            url = "JSP/error.jsp";
            request.setAttribute("error", ex.toString());
        }
        
        request.getRequestDispatcher(url).forward(request,response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
