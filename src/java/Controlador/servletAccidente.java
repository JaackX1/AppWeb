/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Accidente;
import DAO.AccidenteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class servletAccidente extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletAccidente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletAccidente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        try {
            
            HttpSession sesion = request.getSession();
            String sesionUser = sesion.getAttribute("username").toString();
            
            String Acc_observacion = request.getParameter("txtdescripcion");
            String Acc_fecha = request.getParameter("txtfecha");
            String Acc_hora = request.getParameter("txthora");
            String Acc_resolucion = "En proceso";
           
            Accidente sce = new Accidente(0, Acc_observacion, Acc_fecha, Acc_hora, Acc_resolucion);
           
            if(new AccidenteDAO().agregarAccidente(sce)){
                request.setAttribute("msj", "Reporte registrado");
                request.getRequestDispatcher("CL_ReportarAccidente.jsp").forward(request, response);
            } else {
                request.setAttribute("err", "Reporte no registrado");
                request.getRequestDispatcher("CL_ReportarAccidente.jsp").forward(request, response);
                
            }
            
 
        } catch (Exception e) {
            request.setAttribute("err", "Reporte no registrado" + e.getMessage());
            request.getRequestDispatcher("CL_ReportarAccidente.jsp").forward(request, response);
        }

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
