/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ObsMej;
import DAO.VisitasDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "servletChecklist", urlPatterns = {"/servletChecklist"})
public class servletChecklist extends HttpServlet {

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
            out.println("<title>Servlet servletChecklist</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletChecklist at " + request.getContextPath() + "</h1>");
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
            String ob1 = request.getParameter("obs1");
            String ob2 = request.getParameter("obs2");
            String ob3 = request.getParameter("obs3");
            String ob4 = request.getParameter("obs4");
            String ob5 = request.getParameter("obs5");
            String ob6 = request.getParameter("obs6");
            String mej1 = request.getParameter("mej1");
            String mej2 = request.getParameter("mej2");
            String mej3 = request.getParameter("mej3");
            String mej4 = request.getParameter("mej4");
            String mej5 = request.getParameter("mej5");
            String mej6 = request.getParameter("mej6");
            
            String idvisi = request.getParameter("idvisi");
            int idd = Integer.parseInt(idvisi);
            
            
            
            
            ObsMej om = new ObsMej(idd,0,ob1,ob2,ob3,ob4,ob5,ob6,mej1,mej2,mej3,mej4,mej5,mej6);
            
            if(new VisitasDAO().verificarSinCHK(idd)){
                if(new VisitasDAO().agregarObs_Mej(om)){
                    request.setAttribute("msj","CheckList Creado");
                    request.getRequestDispatcher("PR_PlanificarVisita.jsp").forward(request, response);
                }
                else{
                    request.setAttribute("msj","Credenciales NO enviadas");
                    request.getRequestDispatcher("PR_PlanificarVisita.jsp").forward(request, response);
                }
            }else{
                request.setAttribute("msj","Visita ya tiene checklist");
                request.getRequestDispatcher("PR_CrearChecklist.jsp").forward(request, response);
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(servletChecklist.class.getName()).log(Level.SEVERE, null, ex);
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
