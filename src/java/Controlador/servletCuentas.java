/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Cliente;
import Clases.Persona;
import DAO.ClienteDAO;
import DAO.PersonaDAO;
import DAO.RubroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nicolas
 */
@WebServlet(name = "servletCuentas", urlPatterns = {"/servletCuentas"})
public class servletCuentas extends HttpServlet {

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        //ESTO ERA DE PRUEBAS
        switch (accion){
            case "cuenta":
        {
            boolean cuentaActiva;
            HttpSession session = request.getSession();
        }
            
            default:
                break;
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
        //LLAMAR LA SESION Y ALMACENARLA EN SESION
        HttpSession sesion = request.getSession();
        
        //TRANSFORMAR DATOS DE LA SESION
        String sesionUser = sesion.getAttribute("username").toString();
        int sesionTipo = Integer.parseInt(sesion.getAttribute("tipo").toString());
        
        //LLAMAR CLASES Y DAO
        ClienteDAO cdao = new ClienteDAO();
        
        Persona per = new Persona();
        PersonaDAO pdao = new PersonaDAO();
        
        RubroDAO rdao = new RubroDAO();
        
        
        String RubroDesc = rdao.RubroID(sesionTipo);

            
        //CONDICION SEGUN EL TIPO DE USUARIO
        if (sesionTipo == 1 ){
            List<Cliente> cla = cdao.listarInfo(sesionUser);
            request.setAttribute("cuentaActiva", cla);
            request.setAttribute("rubroDesc", RubroDesc);
            request.getRequestDispatcher("CL_PerfilCliente.jsp").forward(request, response);
            //response.sendRedirect("CL_PerfilCliente.jsp");
        }
        if (sesionTipo == 2 ){
            List<Persona> pper = pdao.listarInfo(sesionUser);
            request.setAttribute("cuentaActiva", pper);
            request.getRequestDispatcher("AD_PerfilAdmin.jsp").forward(request, response);
            //response.sendRedirect("CL_PerfilCliente.jsp");
        }
        if (sesionTipo == 3 ){
            List<Persona> pper = pdao.listarInfo(sesionUser);
            request.setAttribute("cuentaActiva", pper);
            request.getRequestDispatcher("PR_PerfilProfesional.jsp").forward(request, response);
            //response.sendRedirect("CL_PerfilCliente.jsp");
        }
        } catch (SQLException ex) {
            
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
        processRequest(request, response);
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
