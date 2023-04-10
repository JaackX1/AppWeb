/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Cliente;
import Clases.Persona;
import DAO.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.Log_InDAO;
import DAO.PersonaDAO;
import ws.*;

/**
 *
 * @author User
 */
@WebServlet(name = "servletLogin", urlPatterns = {"/servletLogin"})
public class servletLogin extends HttpServlet {

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
            out.println("<title>Servlet servletLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletLogin at " + request.getContextPath() + "</h1>");
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
        request.getSession().invalidate();//ELIMINANDO LAS VARIABLES DE LA SESION
        response.sendRedirect("index.jsp");
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
            //Capturar credenciales
            String user = request.getParameter("txtusuario");
            String password = request.getParameter("txtpassword");

            //Le enttreggamos las credenciales al ws
            //Instanciamos ell cliente del ws
            WsLogin_Service servicio = new WsLogin_Service();
            WsLogin cliente = servicio.getWsLoginPort();
            
            int tipo = cliente.login(user, password);
            
            Cliente cl = new Cliente();
            ClienteDAO cdao = new ClienteDAO();
            cl = cdao.listarIdInfo(user);
            
            Persona per = new Persona();
            PersonaDAO ppdao = new PersonaDAO();
            
            per = ppdao.listarIdInfo(user);
            
            String nombPER = per.getPER_P_NOMBRE();
            String apPER = per.getPER_P_APELLIDO();
            
            String nombEMP = cl.getEMPR_NOMBRE();
            
            //verificamos si inicia sesion
            if(tipo > 0) {
                if(tipo == 4){
                    //verificar si es un contador
                    request.setAttribute("err","Cuenta de Contador");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
                else{
                    //crear una varriable de sesión para el usuario y su tipo
                    request.getSession().setAttribute("tipo",tipo);
                    request.getSession().setAttribute("username", user);
                    request.getSession().setAttribute("usernameCliente", nombEMP);
                    request.getSession().setAttribute("usernameNPer", nombPER);
                    request.getSession().setAttribute("usernameAPer", apPER);
                    request.getRequestDispatcher("index.jsp").forward(request, response);                    
                }

                
            } else {
                request.setAttribute("err","Credenciales incorrectas");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            
        } catch (Exception e) {
            request.setAttribute("err","Credenciales incorrectas"+e.getMessage());
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
