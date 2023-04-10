/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Solicitud_Credenciales;
import DAO.Solicitud_CredencialesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "servletAgregar", urlPatterns = {"/servletAgregar"})
public class servletAgregar extends HttpServlet {

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
            out.println("<title>Servlet servletAgregar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletAgregar at " + request.getContextPath() + "</h1>");
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
        try {
            //caaotyrar los atributos del libro que viene de los txt
          
        } catch (Exception e) {
        }
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
            //captturaar los atributos del libro que viene de los txtt
            String rut_empresa = request.getParameter("txtRutempresa");
            String nombre_empresa = request.getParameter("txtNombreEmpresa");
            String direccion = request.getParameter("txtDireccion");
            int telefono_emp = Integer.parseInt(request.getParameter("txtTelefono"));
            String correo = request.getParameter("txtCorreo");
            int id_rubro = Integer.parseInt(request.getParameter("format"));            
            int id_clase = 1;

            
            Solicitud_Credenciales sce = new Solicitud_Credenciales(rut_empresa,nombre_empresa,direccion,telefono_emp,correo,id_rubro,id_clase);
            
            if(new Solicitud_CredencialesDAO().agregarSolicitud_Credenciales(sce)){
                    request.setAttribute("msj","Credenciales enviadas");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                request.setAttribute("err", "Credenciales no enviadas");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            
        } catch (Exception e) {
            request.setAttribute("err", "Credenciales no enviadas"+e.getMessage());
            request.getRequestDispatcher("login.jsp").forward(request, response);
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
