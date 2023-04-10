/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Capacitacion;
import Clases.Info;
import DAO.CapacitacionDAO;
import DAO.InfoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "servletCapacitacion", urlPatterns = {"/servletCapacitacion"})
public class servletCapacitacion extends HttpServlet {

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
            out.println("<title>Servlet servletCapacitacion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletCapacitacion at " + request.getContextPath() + "</h1>");
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
            int Id_Capacitacion = Integer.parseInt("1");
            String Profe_a_Cargo = "";
            
            //fechas con formato YYYY-MM-DD
            String fecha_inicio = request.getParameter("FechaHoy");
            String fecha_pago = request.getParameter("Fecha1mes");
            String Cap_Fecha_Ini1 = request.getParameter("inputStartDate");
            String Cap_Fecha_Fin1 = request.getParameter("inputEndDate");
            
            //CAMBIAR FORMATO A dd/MM/yyyy
            String StartDateNEW = new CapacitacionDAO().transFecha(fecha_inicio);
            String EndDateNEW = new CapacitacionDAO().transFecha(fecha_pago);
            String CAP_StartDateNEW = new CapacitacionDAO().transFecha(Cap_Fecha_Ini1);
            String CAP_EndDateNEW = new CapacitacionDAO().transFecha(Cap_Fecha_Fin1);
            
            ///////////////
            String FirmaCliente = "Sin firmar";
            String Estado = "En proceso";
            int Cap_Precio = Integer.parseInt(request.getParameter("inputDinamic"));
            int Id_Area = Integer.parseInt(request.getParameter("format2"));
            CapacitacionDAO cpdao = new CapacitacionDAO();
            
            
            ///FECHAS 
            SimpleDateFormat formatter3 = new SimpleDateFormat("yyyy-MM-dd");

            //WED 12 DIC 00:00 OPT
            Date date = formatter3.parse(Cap_Fecha_Ini1);
            Date date2 = formatter3.parse(Cap_Fecha_Fin1);
            Date dateFecha_Inicio = formatter3.parse(fecha_inicio);
            Date datePago_fecha = formatter3.parse(fecha_pago);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

            String formattedDate = simpleDateFormat.format(date);
            String formattedDate2 = simpleDateFormat.format(date2);
            String formattedDate3 = simpleDateFormat.format(dateFecha_Inicio);
            String formattedDate4 = simpleDateFormat.format(datePago_fecha);

            java.sql.Date date11 = java.sql.Date.valueOf(formattedDate);
            java.sql.Date date22 = java.sql.Date.valueOf(formattedDate2);
            java.sql.Date dateFecha_Inicio2 = java.sql.Date.valueOf(formattedDate3);
            java.sql.Date datePago_fecha2 = java.sql.Date.valueOf(formattedDate4);

            HttpSession sesion = request.getSession();
            String sesionUser = sesion.getAttribute("username").toString();
            request.setAttribute("sesionUser", sesionUser);
            int Id_Contrato = cpdao.obtenerRutCliente(sesionUser);

            Capacitacion sce = new Capacitacion(Id_Capacitacion, Profe_a_Cargo, date11, date22, Estado, Cap_Precio, Id_Area);
            
            if (new CapacitacionDAO().verificarContrato(sesionUser) > 0) {
                InfoDAO iDao = new  InfoDAO();
                List<Info> infoo = iDao.solicitarInfo(sesionUser);
                int preciototal = 0;
                int id_pago = 0;
                int id_cont = 0;

                for (Info inf : infoo) {
                    preciototal = Cap_Precio + inf.getPago_monto();
                    id_pago = inf.getId_pago();
                    id_cont = inf.getId_contrato();
                }
                
                int precioPagoBD = preciototal;//cpdao.obtenerPrecioPago(sesionUser);
                int idPagoBD = id_pago;//cpdao.obtenerIdPago(sesionUser);
                int test = cpdao.obtenerIdPago(sesionUser);
                int test2 = cpdao.obtenerPrecioPago(sesionUser);
                
                
                //AGREGAR ASESORIA Y ASESORIA_FK
                //VINCULAR ASESORIA CON EL CONTRATO (TAMBIEN SE PUEDE HACER AHI MISMO EN EL PROCEDIMIENTO)
                if (new CapacitacionDAO().agregarCapacitacionfk(sce, Id_Capacitacion, id_cont, idPagoBD, preciototal)) {
                    request.setAttribute("msj", "Contrato actualizado");
                    request.getRequestDispatcher("CL_RegistrarCapacitacion.jsp").forward(request, response);
                } else {
                    request.setAttribute("msj", "Cliente con contrato vigente");
                    request.getRequestDispatcher("CL_RegistrarCapacitacion.jsp").forward(request, response);
                }
                
            } else {
                //AGREGAR CONTRATO
                if (new CapacitacionDAO().agregarContratocapfk(sce,fecha_pago,Cap_Precio,sesionUser,FirmaCliente,fecha_inicio,Cap_Fecha_Fin1,StartDateNEW,EndDateNEW,CAP_StartDateNEW,CAP_EndDateNEW)) {
                    request.setAttribute("msj", "Contrato de enviado");
                    request.getRequestDispatcher("CL_RegistrarCapacitacion.jsp").forward(request, response);
                }

                //AGREGAR ASESORIA
                if (new CapacitacionDAO().agregarCapacitacion(sce,sesionUser)) {
                    request.setAttribute("msj", "Contrato de capacitacion enviado");
                    request.getRequestDispatcher("CL_RegistrarCapacitacion.jsp").forward(request, response);
                } else {
                    request.setAttribute("err", "Contrato no enviado");
                    request.getRequestDispatcher("CL_RegistrarCapacitacion.jsp").forward(request, response);
                }
            }

        } catch (Exception e) {
            request.setAttribute("err", "Credenciales no enviadas" + e.getMessage());
            request.getRequestDispatcher("CL_RegistrarCapacitacion.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
