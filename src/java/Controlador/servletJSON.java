/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Visitas;
import Clases.Visitass;
import DAO.VisitasDAO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
 * @author User
 */
@WebServlet(name = "servletJSON", urlPatterns = {"/servletJSON"})
public class servletJSON extends HttpServlet {

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
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Page":
                
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
        
        //LLAMAR LA SESION Y ALMACENARLA EN SESION
        HttpSession sesion = request.getSession();
        //TRANSFORMAR DATOS DE LA SESION
        String sesionUser = sesion.getAttribute("username").toString();
        
        List call = new VisitasDAO().listarRun(sesionUser);
          
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        gson1.toJson(call);
        String jsonString1 = gson1.toJson(call);
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        //request.getRequestDispatcher("PR_PlanificarVisita.jsp").forward(request, response);
        response.getWriter().write(jsonString1);
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
            String title = request.getParameter("titlee");
            String descripcion = request.getParameter("descripcionn");
            String RutCliente = request.getParameter("rutClient");
            String start1 = request.getParameter("sstart");
            String end1 = request.getParameter("eend");
            
            //pasar formato de fecha escrita a dd/mm/yyyy
            String start2 = new VisitasDAO().transFecha(start1);
            String end2 = new VisitasDAO().transFecha(end1);
            
            //pasar a formato de date en util
            SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
            Date date1=formatter1.parse(start2);
            Date date2=formatter1.parse(end2);
            
            //definir formato de date en sql
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            //formatear date util a sql
            String formattedDate = simpleDateFormat.format(date1);
            String formattedDate2 = simpleDateFormat.format(date2);
            
            //verificar que sea date de sql
            java.sql.Date date11 = java.sql.Date.valueOf(formattedDate);
            java.sql.Date date22 = java.sql.Date.valueOf(formattedDate2);
            
            //LLAMAR LA SESION Y ALMACENARLA EN SESION
            HttpSession sesion = request.getSession();
            //TRANSFORMAR DATOS DE LA SESION
            String sesionUser = sesion.getAttribute("username").toString();
            
            
            //Visitas visita = new Visitas(2, title, descripcion,date11 ,date22,1);
            Visitass visita = new Visitass(2, title, descripcion,date11 ,date22,1,sesionUser,RutCliente);
            
            if(new VisitasDAO().agregarVisita2(visita)){
                request.setAttribute("msj","Visita Creada");
                request.getRequestDispatcher("PR_PlanificarVisita.jsp").forward(request, response); 
            }
            else{
                request.setAttribute("msj","Visita NO Creada");
                request.getRequestDispatcher("PR_PlanificarVisita.jsp").forward(request, response); 
            }
        } catch (ParseException ex) {
            Logger.getLogger(servletJSON.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(servletJSON.class.getName()).log(Level.SEVERE, null, ex);
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
