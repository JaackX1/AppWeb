/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.AsesoriaDAO;
import DAO.PagoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ws.WsLogin;
import ws.WsLogin_Service;
import ws2.WsPaypal_Service;
import ws2.WsPaypal;

/**
 *
 * @author User
 */
@WebServlet(name = "servletPaypal", urlPatterns = {"/servletPaypal"})
public class servletPaypal extends HttpServlet {

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
            out.println("<title>Servlet servletPaypal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletPaypal at " + request.getContextPath() + "</h1>");
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
            
            AsesoriaDAO adao = new AsesoriaDAO();
            
            
            //id pago
            int id_pago = new AsesoriaDAO().obtenerIdPago(sesionUser);
            //monto total
            int monto_total = new AsesoriaDAO().obtenerPrecioPago(sesionUser);
            
            //fecha pago
            String fecha_pago = new PagoDAO().RescatarFechaPago(id_pago);
            
            //fecha hoy
            String fecha_hoy = new PagoDAO().ObtenerFechaHoy();
            
            //fecha nueva
            String fecha_nueva = new PagoDAO().sumarMeses(fecha_pago, 1);
            
            String correo = request.getParameter("txtPaypalCorreo");
            String contrasenia = request.getParameter("txtPaypalPass");
            
            WsPaypal_Service servicio = new WsPaypal_Service();
            WsPaypal cliente = servicio.getWsPaypalPort();
            
            boolean tipo = cliente.validacion(correo, contrasenia);
            
            if(tipo==true){
                if(new PagoDAO().registrarHistorialPago(fecha_hoy,fecha_nueva,id_pago,monto_total)){
                    request.setAttribute("msj","Pago Realizado");
                    request.getRequestDispatcher("paypal.jsp").forward(request, response);
                }else{
                    request.setAttribute("err","Error al registrar Historial pago");
                    request.getRequestDispatcher("paypal.jsp").forward(request, response);
                }
            }else{
                request.setAttribute("err","Cuenta de paypal no existente");
                request.getRequestDispatcher("paypal.jsp").forward(request, response);
            }            
        } catch (Exception e) {

            
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
