/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
@WebServlet(name = "servletAccident", urlPatterns = {"/servletAccident"})
public class servletAccident extends HttpServlet {

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
            out.println("<title>Servlet servletAccident</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletAccident at " + request.getContextPath() + "</h1>");
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
            String[] chkResp = null;
            
            if(request.getParameterValues("chkResp") != null){
                chkResp = request.getParameterValues("chkResp");
            }else{
                request.setAttribute("result","100");
                request.getRequestDispatcher("AD_VerActividades5.jsp").forward(request, response); 
            }
            
            int id_obs = Integer.parseInt(request.getParameter("id_obs"));
            
            String obs1 = request.getParameter("obs11");
            String obs2 = request.getParameter("obs12");
            String obs3 = request.getParameter("obs13");
            String obs4 = request.getParameter("obs14");
            String obs5 = request.getParameter("obs15");
            String obs6 = request.getParameter("obs16");
            
            int call = 0;
            float percent = 100;
            
            if(obs1 != null){call = call+1;}
            if(obs2 != null){call = call+1;}
            if(obs3 != null){call = call+1;}
            if(obs4 != null){call = call+1;}
            if(obs5 != null){call = call+1;}
            if(obs6 != null){call = call+1;} 
            
            int call2 = 0;
            
            for(int i=0;i<chkResp.length;i++){
                call2 = call2+1;
            }
            
            //call saca la cantidad de check que hay
            //call2 es la cantidad de check que estan marcados
            //call3 es el inverso a call2
            int call3 = call-call2;
            
            float result = percent/call;
            
            float result1 = result*call3;
            
            request.setAttribute("result",result1);
            request.getRequestDispatcher("AD_VerActividades5.jsp").forward(request, response); 
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
