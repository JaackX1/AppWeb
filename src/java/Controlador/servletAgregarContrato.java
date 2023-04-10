/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Contrato;
import DAO.AsesoriaDAO;
import DAO.ContratoDAO;
import DAO.PagoDAO;
import DAO.PlanesDAO;
import DAO.VisitasDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "servletAgregarContrato", urlPatterns = {"/servletAgregarContrato"})
public class servletAgregarContrato extends HttpServlet {

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
            out.println("<title>Servlet servletAgregarContrato</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletAgregarContrato at " + request.getContextPath() + "</h1>");
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
            //captturaar los atributos del libro que viene de los txtt
            String PagoDE_fecha = request.getParameter("fecha_fin_pago");
            
            String Pago_fecha = new ContratoDAO().transFecha(PagoDE_fecha);
            double Pago_monto = Double.parseDouble(request.getParameter("totalpagarr"));

            int pago_monto2;
            pago_monto2 = (int) Pago_monto;

            int Id_plan = Integer.parseInt(request.getParameter("ididi"));
            String Rut = request.getParameter("sesionUser");
            String Cont_firma_cliente = request.getParameter("firma");
            String fecha_inicio = request.getParameter("fecha_inicio_pago");
            String Cont_fecha_inicio = new ContratoDAO().transFecha(fecha_inicio);

            Contrato sce = new Contrato(Pago_fecha, pago_monto2, Id_plan, Rut, Cont_firma_cliente, Cont_fecha_inicio);

            HttpSession sesion = request.getSession();
            String sesionUser = sesion.getAttribute("username").toString();

            AsesoriaDAO adao = new AsesoriaDAO();
            int id_contratito = adao.verificarContrato(sesionUser);
            
            PagoDAO pagDAO = new PagoDAO();
            VisitasDAO vDAO = new VisitasDAO();
            
            
            
            //VERIFICAR QUE TENGA UN CONTRATO
            if (id_contratito > 0) {

                //REALIZAR METODO DAO PARA RECATAR ID PAGO Y OTR DE PAGO MONTO (CONSULTA CON WHERE ID_CONTRATO)
                int rescatarid = new PagoDAO().verificarIdPago(sesionUser);
                int rescatarprecio = new PagoDAO().obtenerPrecioPago(sesionUser);
                //SUMAR EL PRECIO DEL PLAN CON EL PAGO MONTO RESCATADO
                int sumatotal = rescatarprecio + pago_monto2;
                //REALIZAR METODO DAO PARA ACTUALIZAR LLAMANDO AL PROCEDIMIENTO SP_MODIFICAR_PLANC

                if (new PlanesDAO().modificarContratoPlan(id_contratito, sumatotal, rescatarid, Id_plan)) {
                    request.setAttribute("msj", "Credenciales enviadas");
                    request.getRequestDispatcher("contrato.jsp").forward(request, response);
                } else {
                    request.setAttribute("err", "Credenciales no enviadas");
                    request.getRequestDispatcher("contrato.jsp").forward(request, response);
                }

            } else {
                if (new ContratoDAO().agregarContrato(sce)) {
                    request.setAttribute("msj", "Credenciales enviadas");
                    request.getRequestDispatcher("contrato.jsp").forward(request, response);
                } else {
                    request.setAttribute("err", "Credenciales no enviadas");
                    request.getRequestDispatcher("contrato.jsp").forward(request, response);
                }
            }

        } catch (Exception e) {
            request.setAttribute("err", "Credenciales no enviadas" + e.getMessage());
            request.getRequestDispatcher("contrato.jsp").forward(request, response);
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
