/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.VisitasDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.Calendar;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(name = "aaaa", urlPatterns = {"/aaaa"})
public class aaaa extends HttpServlet {

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
            out.println("<title>Servlet aaaa</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet aaaa at " + request.getContextPath() + "</h1>");
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
        
        


        

        
        
        
        //contrato
        String id_contrato = "1";
        request.setAttribute("id_contrato", id_contrato);
        
        String id_asesoria = "null";
        request.setAttribute("id_asesoria", id_asesoria);
        
        String id_plan = "3";
        request.setAttribute("id_plan", id_plan);
        
        String id_capacitacion = "3";
        request.setAttribute("id_capacitacion", id_capacitacion);
        
        HttpSession sesion = request.getSession();
        String sesionUser = sesion.getAttribute("username").toString();
        request.setAttribute("sesionUser", sesionUser);
        
        String id_orden_pago1 = "1";
        request.setAttribute("id_orden_pago1", id_orden_pago1);
        
        String firma = "sin firmar";
        request.setAttribute("firma", firma);
        
        
        Date fecha_hoy = new Date();
        Date fecha_fin = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(fecha_hoy);
        c.add(Calendar.DATE, 30);
        fecha_fin = c.getTime();
        
        request.setAttribute("fecha_inicio", fecha_hoy);
        request.setAttribute("fecha_fin", fecha_fin);
        
        String id_visita = "null";
        request.setAttribute("id_visita", id_visita);
        
        //pago
        String id_pago = "1";
        request.setAttribute("id_pago", id_pago);
        request.setAttribute("fecha_fin_pago", fecha_fin);
        
        String monto_pago = "37373";
        request.setAttribute("monto_pago", monto_pago);
        
        //orden pago
        String id_orden_pago = "1";
        request.setAttribute("id_orden_pago", id_orden_pago);
        
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
        //contrato
        String id_contrato = "1";
        request.setAttribute("id_contrato", id_contrato);
        
        String id_asesoria = "null";
        request.setAttribute("id_asesoria", id_asesoria);
        
        String id_plan = "3";
        request.setAttribute("id_plan", id_plan);
        
        String id_capacitacion = "3";
        request.setAttribute("id_capacitacion", id_capacitacion);
        
        HttpSession sesion = request.getSession();
        String sesionUser = sesion.getAttribute("username").toString();
        request.setAttribute("sesionUser", sesionUser);
        
        String id_orden_pago1 = "1";
        request.setAttribute("id_orden_pago1", id_orden_pago1);
        
        String firma = "sin firmar";
        request.setAttribute("firma", firma);
        
        
        Date fecha_hoy = new Date();
        Date fecha_fin = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(fecha_hoy);
        c.add(Calendar.DATE, 30);
        fecha_fin = c.getTime();
        
        String fechaa_hoyy = fecha_hoy.toString();
        String fechaa_finn = fecha_fin.toString();
        
        String fechaa_hoyy1 = new VisitasDAO().transFecha2(fechaa_hoyy);
        String fechaa_finn1 = new VisitasDAO().transFecha2(fechaa_finn);
        
        request.setAttribute("fecha_inicio", fechaa_hoyy1);
        request.setAttribute("fecha_fin", fechaa_finn1);
        
        String id_visita = "null";
        request.setAttribute("id_visita", id_visita);
        
        //pago
        String id_pago = "1";
        request.setAttribute("id_pago", id_pago);
        request.setAttribute("fecha_fin_pago", fechaa_finn1);
        
        String monto_pago = "37373";
        request.setAttribute("monto_pago", monto_pago);
        
        //orden pago
        String id_orden_pago = "1";
        request.setAttribute("id_orden_pago", id_orden_pago);
        
        request.getRequestDispatcher("pruebasaa.jsp").forward(request, response);
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
