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

/**
 *
 * @author User
 */
@WebServlet(name = "servletResp", urlPatterns = {"/servletResp"})
public class servletResp extends HttpServlet {

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
            out.println("<title>Servlet servletResp</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletResp at " + request.getContextPath() + "</h1>");
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
            String[] chkResp = request.getParameterValues("chkResp");
            
            int id_obs = Integer.parseInt(request.getParameter("id_obs"));
            
            String chkAll="";
            
            for(int i=0;i<chkResp.length;i++){
                chkAll=chkAll+chkResp[i];
            }

            if(chkAll.length()==1){chkAll=chkAll+"00000";}
            if(chkAll.length()==2){chkAll=chkAll+"0000";}
            if(chkAll.length()==3){chkAll=chkAll+"000";}
            if(chkAll.length()==4){chkAll=chkAll+"00";}
            if(chkAll.length()==5){chkAll=chkAll+"0";}
            
            int chk1 = Integer.parseInt(chkAll.substring(0,1));
            int chk2 = Integer.parseInt(chkAll.substring(1,2));
            int chk3 = Integer.parseInt(chkAll.substring(2,3));
            int chk4 = Integer.parseInt(chkAll.substring(3,4));
            int chk5 = Integer.parseInt(chkAll.substring(4,5));
            int chk6 = Integer.parseInt(chkAll.substring(5,6));
            
            
            VisitasDAO vdao = new VisitasDAO();
            
            int id_resp = vdao.verificarRespuesta(chk1, chk2, chk3, chk4, chk5, chk6);
            
            if(new VisitasDAO().updateResp(id_obs, id_resp)){
                request.setAttribute("msj","Credenciales enviadas");
                request.getRequestDispatcher("index.jsp").forward(request, response); 
            }
            
            
            
            
            
        } catch (Exception e) {
            request.setAttribute("msj","Error");
            request.getRequestDispatcher("index.jsp").forward(request, response); 
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
