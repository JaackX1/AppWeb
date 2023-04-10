/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.*;
import DAO.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "servletAdmin", urlPatterns = {"/servletAdmin"})
public class servletAdmin extends HttpServlet {

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
        
        ClienteDAO cdao = new ClienteDAO(); 
        PersonaDAO pdao = new PersonaDAO();
        VisitasDAO vdao = new VisitasDAO();
        ContratoDAO ctdao = new ContratoDAO();
        
        switch (accion) {
            case "listarClientes":
                //Ver actividades Part 1 : CLIENTES
                List<Cliente> cliente = cdao.listarContrat();
                request.setAttribute("cliente", cliente);
                request.getRequestDispatcher("AD_VerActividades2.jsp").forward(request, response);
                break;
            case "listarProfesionales":
                //Ver actividades Part 1 : PROFESIONALES
                List<Persona> profesional = pdao.listarAll();
                request.setAttribute("profesional", profesional);
                request.getRequestDispatcher("AD_VerActividades2.jsp").forward(request, response);
                break;
            case "BuscarCliente":
                //Ver actividades Part 2 : CLIENTES
                String idc = request.getParameter("idc");
                List<Cliente> cbc = cdao.listarInfo(idc);
                request.setAttribute("clienteInfo", cbc);
                request.getRequestDispatcher("AD_VerActividades3.jsp").forward(request, response);
                break;
                
            case "BuscarProfesional":
                //Ver actividades Part 2 : PROFESIONALES
                String idp = request.getParameter("idc");
                 
                List<Persona> pbp = pdao.listarInfo(idp);
                request.setAttribute("personaInfo", pbp);
                request.getRequestDispatcher("AD_VerActividades3.jsp").forward(request, response);
                
                break;
            case "listarVisitasCliente":
                //Ver actividades Part 3 : CLIENTES
                String idlvc = request.getParameter("idc");
                
                List<Visitas> lvcv = vdao.listarContrat(idlvc);
                request.setAttribute("visitas", lvcv);
                
                List<Cliente> lvci = cdao.listarInfo(idlvc);
                request.setAttribute("clienteInfo", lvci);
                
                request.setAttribute("idTable", 1);
                request.getRequestDispatcher("AD_VerActividades4.jsp").forward(request, response);
                break;
            case "listarCapacitacionCliente":
                //Ver actividades Part 3 : CLIENTES
                String idlcc = request.getParameter("idc");
                
                List<Contrato> lccc = ctdao.listarCapacitaciones(idlcc);
                request.setAttribute("capacitaciones", lccc);
                
                List<Cliente> lcci = cdao.listarInfo(idlcc);
                request.setAttribute("clienteInfo", lcci);
                
                request.setAttribute("idTable", 2);
                request.getRequestDispatcher("AD_VerActividades4.jsp").forward(request, response);    

                break;
            case "listarAsesoriaCliente":
                //Ver actividades Part 3 : CLIENTES
                String idlac = request.getParameter("idc");
                
                List<Contrato> lcac = ctdao.listarAsesorias(idlac);
                request.setAttribute("asesorias", lcac);
                
                List<Cliente> laci = cdao.listarInfo(idlac);
                request.setAttribute("clienteInfo", laci);
                
                request.setAttribute("idTable", 3);
                request.getRequestDispatcher("AD_VerActividades4.jsp").forward(request, response);                
                break;
                
            case "listarVisitasProf":
                //Ver actividades Part 3 : PROFESIONALES
                String idlvp = request.getParameter("idc");
                
                List<VisitaProf> lvcp = vdao.listarRunAsignado(idlvp);
                request.setAttribute("visitasProf", lvcp);
                
                List<Persona> lvpi = pdao.listarInfo(idlvp);
                request.setAttribute("personaInfo", lvpi);
                
                request.setAttribute("idTableProf", 1);
                request.getRequestDispatcher("AD_VerActividades4.jsp").forward(request, response);
                
                
                break;            
            
            case "listarCapacitacionProf":
                //Ver actividades Part 3 : PROFESIONALES
                String idlcp = request.getParameter("idc");
                
                List<Capacitaciones> lcpc = ctdao.listarCapacitacionesProf(idlcp);
                request.setAttribute("capacitacionesProf", lcpc);
                
                List<Persona> lcpi = pdao.listarInfo(idlcp);
                request.setAttribute("personaInfo", lcpi);
                
                request.setAttribute("idTableProf", 2);
                request.getRequestDispatcher("AD_VerActividades4.jsp").forward(request, response);  
                break;
            case "listarAsesoriaProf":
                //Ver actividades Part 3 : PROFESIONALES
                String idlap = request.getParameter("idc");
                
                List<Asesorias> lapc = ctdao.listarAsesoriaProf(idlap);
                request.setAttribute("asesoriasProf", lapc);
                
                List<Persona> lapi = pdao.listarInfo(idlap);
                request.setAttribute("personaInfo", lapi);
                
                request.setAttribute("idTableProf", 3);
                request.getRequestDispatcher("AD_VerActividades4.jsp").forward(request, response);  
                break;

                
            case "VerVisita":
                //Ver actividades Part 4 : CLIENTES ✓
                String idvv = request.getParameter("idc");
                
                //listar info de la visita
                List<Visitas> vv = vdao.listarVisitaId(idvv);
                request.setAttribute("datosVisita", vv);
                
                //observaciones mejoras respuesta
                int idvvi = Integer.parseInt(idvv);
                List<ObsMejResp> omrv = vdao.ObsMejRespChecklist(idvvi);
                
                request.setAttribute("obsmejresp", omrv);
                
                int resp1 = 0;
                int resp2 = 0;
                int resp3 = 0;
                int resp4 = 0;
                int resp5 = 0;
                int resp6 = 0;
                
                for (int x = 0; x < omrv.size(); x++) {
                  ObsMejResp p = omrv.get(x);
                  if (p.getRep1()==1) {resp1 = 1;}
                  if (p.getRep2()==1) {resp2 = 1;}
                  if (p.getRep3()==1) {resp3 = 1;}
                  if (p.getRep4()==1) {resp4 = 1;}
                  if (p.getRep5()==1) {resp5 = 1;}
                  if (p.getRep6()==1) {resp6 = 1;}
                }
                request.setAttribute("check1", resp1);
                request.setAttribute("check2", resp2);
                request.setAttribute("check3", resp3);
                request.setAttribute("check4", resp4);
                request.setAttribute("check5", resp5);
                request.setAttribute("check6", resp6);
                
                //request.setAttribute("clienteInfo", lvci);
                request.getRequestDispatcher("AD_VerActividades5.jsp").forward(request, response);
                break;
            case "VerCapacitacion":
                //Ver actividades Part 4 : CLIENTES ✓
                String idvc = request.getParameter("idc");
                
                //listar info de la capacitacion
                List<Capacitaciones> vc = ctdao.listarCapacitacionesUnico(idvc);
                request.setAttribute("datosCapacitacion", vc);
                
                List<Cliente> vcc = cdao.listarIdVisita(idvc);
                request.setAttribute("datosCliente", vcc);
                
                request.getRequestDispatcher("AD_VerCapacitacion.jsp").forward(request, response);
                break;
            case "VerAsesoria":
                //Ver actividades Part 4 : CLIENTES ✓
                String idva = request.getParameter("idc");
                
                //listar info de la asesoria
                List<Asesorias> va = ctdao.listarAsesoriasUnico(idva);
                request.setAttribute("datosAsesoria", va);
                
                //info del cliente
                List<Cliente> vac = cdao.listarIdVisita(idva);
                request.setAttribute("datosCliente", vac);
                
                request.getRequestDispatcher("AD_VerAsesoria.jsp").forward(request, response);
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
