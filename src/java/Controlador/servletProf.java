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
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(name = "servletProf", urlPatterns = {"/servletProf"})
public class servletProf extends HttpServlet {

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
        //LLAMAR LA SESION Y ALMACENARLA EN SESION
        HttpSession sesion = request.getSession();
        //TRANSFORMAR DATOS DE LA SESION
        String sesionUser = sesion.getAttribute("username").toString();
        int sesionTipo = Integer.parseInt(sesion.getAttribute("tipo").toString());

        
        ClienteDAO cdao = new ClienteDAO();
        ContratoDAO conDAO = new ContratoDAO();
        VisitasDAO vdao = new VisitasDAO();
        PersonaDAO pdao = new PersonaDAO();
        
        switch (accion) {
            case "AVisitas":
                break;
                
            case "revisarCliente":
                List<Cliente> cl = cdao.listarProfCont(sesionUser);
                request.setAttribute("cliente", cl);
                request.getRequestDispatcher("PR_RevisarCliente.jsp").forward(request, response);
                break;
                
            case "revisarCliente2":
                String idc = request.getParameter("idc");
                List<Cliente> cli = cdao.listarInfo(idc);
                List<Contrato> cont = conDAO.listarInfo(idc);
                
                request.setAttribute("cliente1", cli);
                request.setAttribute("contrato1", cont);
                request.getRequestDispatcher("PR_RevisarCliente2.jsp").forward(request, response);
                break;
            case "Planificar":
                List<Cliente> clPlanificar = cdao.listarProfCont(sesionUser);
                request.setAttribute("cliente", clPlanificar);
                request.getRequestDispatcher("PR_PlanificarVisita.jsp").forward(request, response);
                break;
            case "Planificar2":
                String idp2 = request.getParameter("idc");
                request.setAttribute("rutCliente", idp2);
                request.getRequestDispatcher("PR_PlanificarVisita2.jsp").forward(request, response);
                break;
            case "CrearChecklist":
                List<Cliente> clChecklist = cdao.listarProfCont(sesionUser);
                request.setAttribute("cliente", clChecklist);
                request.getRequestDispatcher("PR_CrearChecklist.jsp").forward(request, response);
                break;
            case "CrearChecklist2":
                String idcc2 = request.getParameter("idc");
                //metodo listar aqui
                List<Visitas> vChecklist = vdao.listarContrat(idcc2);
                request.setAttribute("visitas", vChecklist);
                request.getRequestDispatcher("PR_CrearChecklist2.jsp").forward(request, response);
                break;
            case "CrearChecklist3":
                String idcc3 = request.getParameter("idc");

                request.setAttribute("idVisita", idcc3);
                request.getRequestDispatcher("PR_CrearChecklist3.jsp").forward(request, response);
                break;
            case "CrearChecklist4":
                String ob1 = request.getParameter("idc");
                String ob2 = request.getParameter("obs2");
                String ob3 = request.getParameter("obs3");
                String ob4 = request.getParameter("obs4");
                String ob5 = request.getParameter("obs5");
                String ob6 = request.getParameter("obs6");
                
                String idcc4 = request.getParameter("idc");
                break;
                
            case "ResponderChecklist":
                List<Cliente> clRCheck = cdao.listarProfCont(sesionUser);
                
                request.setAttribute("checklists", clRCheck);
                request.getRequestDispatcher("PR_responderChecklist.jsp").forward(request, response);
                break;
                
            case "ResponderChecklist2":
                String idrc2 = request.getParameter("idc");
                List<respCheck> rpCheck = vdao.listarChecklist(idrc2);
                request.setAttribute("checklist", rpCheck);
                request.getRequestDispatcher("PR_responderChecklist2.jsp").forward(request, response);
                break;
                
            case "ResponderChecklist3":
                String rutRC3 = request.getParameter("idc");
                String idRC3 = request.getParameter("idc2");
                
                int idd = Integer.parseInt(idRC3);
                //METODO PARA MOSTRAR OBSERVACIONES Y MEJORAS, CON CHECKLIST
                
                List<ObsMej> omCheck = vdao.RespChecklist(idd);

                request.setAttribute("checklist", omCheck);
                request.setAttribute("rut_empr", rutRC3);
                request.getRequestDispatcher("PR_responderChecklist33.jsp").forward(request, response);
                break;
            case "ActualizarSeguimiento":
                String idAS = request.getParameter("idc");
                
                List<VisitaProf> las = vdao.listarRunAsignado(idAS);
                

                
                request.setAttribute("visitasProf", las);
                request.getRequestDispatcher("PR_ActSeguimiento.jsp").forward(request, response);
                break;
                
            case "ActualizarSeguimiento2":
                String idAS2 = request.getParameter("idc");
                
                List<Visitas> las2 = vdao.listarVisitaId(idAS2);
                
                int estadoCheck = 0;
                for (int x = 0; x < las2.size(); x++) {
                  Visitas p = las2.get(x);
                  if (p.getId_estado()==1) {estadoCheck = 1;}
                  if (p.getId_estado()==2) {estadoCheck = 2;}
                  if (p.getId_estado()==3) {estadoCheck = 3;}
                  if (p.getId_estado()==4) {estadoCheck = 4;}
                }
                request.setAttribute("estadoCheck", estadoCheck);
                
                request.setAttribute("visita", las2);
                request.getRequestDispatcher("PR_ActSeguimiento2.jsp").forward(request, response);
                break;
                
            case "VerActividades":
                List<Persona> pbp = pdao.listarInfo(sesionUser);
                request.setAttribute("personaInfo", pbp);
                request.getRequestDispatcher("PR_VerActividades.jsp").forward(request, response);
                break;
                
            case "VerActividadesCapacitaciones":
                List<Capacitaciones> lcpc = conDAO.listarCapacitacionesProf(sesionUser);
                request.setAttribute("capacitacionesProf", lcpc);
                
                List<Persona> lcpi = pdao.listarInfo(sesionUser);
                request.setAttribute("personaInfo", lcpi);
                
                request.setAttribute("idTableProf", 2);
                request.getRequestDispatcher("PR_VerActividades2.jsp").forward(request, response);  
                break;
            case "VerActividadesVisitas":
                
                List<VisitaProf> lvcp = vdao.listarRunAsignado(sesionUser);
                request.setAttribute("visitasProf", lvcp);
                
                List<Persona> lvpi = pdao.listarInfo(sesionUser);
                request.setAttribute("personaInfo", lvpi);
                
                request.setAttribute("idTableProf", 1);
                request.getRequestDispatcher("PR_VerActividades2.jsp").forward(request, response);
                break;  
                
            case "listarAsesoriaProf":
                List<Asesorias> lapc = conDAO.listarAsesoriaProf(sesionUser);
                request.setAttribute("asesoriasProf", lapc);
                
                List<Persona> lapi = pdao.listarInfo(sesionUser);
                request.setAttribute("personaInfo", lapi);
                
                request.setAttribute("idTableProf", 3);
                request.getRequestDispatcher("PR_VerActividades2.jsp").forward(request, response);  
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
                request.getRequestDispatcher("PR_VerActividades3.jsp").forward(request, response);
                break;
            case "VerCapacitacion":
                //Ver actividades Part 4 : CLIENTES ✓
                String idvc = request.getParameter("idc");
                
                //listar info de la capacitacion
                List<Capacitaciones> vc = conDAO.listarCapacitacionesUnico(idvc);
                request.setAttribute("datosCapacitacion", vc);
                
                List<Cliente> vcc = cdao.listarIdVisita(idvc);
                request.setAttribute("datosCliente", vcc);
                
                request.getRequestDispatcher("PR_VerCapacitacion.jsp").forward(request, response);
                break;
            case "VerAsesoria":
                //Ver actividades Part 4 : CLIENTES ✓
                String idva = request.getParameter("idc");
                
                //listar info de la asesoria
                List<Asesorias> va = conDAO.listarAsesoriasUnico(idva);
                request.setAttribute("datosAsesoria", va);
                
                //info del cliente
                List<Cliente> vac = cdao.listarIdVisita(idva);
                request.setAttribute("datosCliente", vac);
                
                request.getRequestDispatcher("PR_VerAsesoria.jsp").forward(request, response);
                break;
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
