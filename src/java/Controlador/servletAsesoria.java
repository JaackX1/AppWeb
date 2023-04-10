/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Asesoria;
import Clases.Info;
import DAO.AsesoriaDAO;
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
@WebServlet(name = "servletAsesoria", urlPatterns = {"/servletAsesoria"})
public class servletAsesoria extends HttpServlet {

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
            out.println("<title>Servlet servletAsesoria</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletAsesoria at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //capturar los atributos que vienen del los txt de asesoria
            int Id_Asesoria = Integer.parseInt("1");
            String Prof_a_Cargo = "";
            
            //FECHAS FORMATO YYYY-MM-DD
            String fecha_inicio = request.getParameter("FechaHoy");
            String fecha_pago = request.getParameter("Fecha1mes");
            String Ases_Fecha_Ini1 = request.getParameter("inputStartDate");
            String Ases_Fecha_Fin1 = request.getParameter("inputEndDate");
            
            //CAMBIAR FORMATO A DD/MM/YYYY
            String StartDateNEW = new CapacitacionDAO().transFecha(fecha_inicio);
            String EndDateNEW = new CapacitacionDAO().transFecha(fecha_pago);
            String CAP_StartDateNEW = new CapacitacionDAO().transFecha(Ases_Fecha_Ini1);
            String CAP_EndDateNEW = new CapacitacionDAO().transFecha(Ases_Fecha_Fin1);
            
            //DSADA
            String FirmaCliente = "Sin firmar";
            String Estado = "En Proceso";
            int Precio = Integer.parseInt(request.getParameter("inputDinamic"));
            int Area_Id_Area = Integer.parseInt(request.getParameter("format2"));
            AsesoriaDAO asdao = new AsesoriaDAO();
            SimpleDateFormat formatter3 = new SimpleDateFormat("yyyy-MM-dd");

            Date date = formatter3.parse(Ases_Fecha_Ini1);
            Date date2 = formatter3.parse(Ases_Fecha_Fin1);
            Date dateFecha_Inicio = formatter3.parse(fecha_inicio);
            Date datePago_fecha = formatter3.parse(fecha_pago);

            //definir formato de date en sql
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

            //formatear date util a sql
            String formattedDate = simpleDateFormat.format(date);
            String formattedDate2 = simpleDateFormat.format(date2);
            String formattedDate3 = simpleDateFormat.format(dateFecha_Inicio);
            String formattedDate4 = simpleDateFormat.format(datePago_fecha);

            //verificar que sea date de sql
            java.sql.Date date11 = java.sql.Date.valueOf(formattedDate);
            java.sql.Date date22 = java.sql.Date.valueOf(formattedDate2);
            java.sql.Date dateFecha_Inicio2 = java.sql.Date.valueOf(formattedDate3);
            java.sql.Date datePago_fecha2 = java.sql.Date.valueOf(formattedDate4);

            HttpSession sesion = request.getSession();
            String sesionUser = sesion.getAttribute("username").toString();
            request.setAttribute("sesionUser", sesionUser);

            Asesoria sce = new Asesoria(Id_Asesoria, Prof_a_Cargo, date11, date22, Estado, Precio, Area_Id_Area);

            if (new AsesoriaDAO().verificarContrato(sesionUser) > 0) {
                InfoDAO iDao = new InfoDAO();
                List<Info> infoo = iDao.solicitarInfo(sesionUser);
                int preciototal = 0;
                int id_pago = 0;
                int id_cont = 0;

                for (Info inf : infoo) {
                    preciototal = Precio + inf.getPago_monto();
                    id_pago = inf.getId_pago();
                    id_cont = inf.getId_contrato();
                }

                int precioPagoBD = preciototal;//cpdao.obtenerPrecioPago(sesionUser);
                int idPagoBD = id_pago;
                int test = asdao.obtenerIdPago(sesionUser);
                int test2 = asdao.obtenerPrecioPago(sesionUser);

                //AGREGAR ASESORIA Y ASESORIA_FK
                //VINCULAR ASESORIA CON EL CONTRATO (TAMBIEN SE PUEDE HACER AHI MISMO EN EL PROCEDIMIENTO)
                if (new AsesoriaDAO().agregarAsesoriafk(sce, Id_Asesoria, id_cont, idPagoBD, preciototal)) {
                    request.setAttribute("msj", "Contrato Actualizado");
                    request.getRequestDispatcher("Asesoria.jsp").forward(request, response);
                } else {
                    request.setAttribute("msj", "Cliente NO Actualizado");
                    request.getRequestDispatcher("Asesoria.jsp").forward(request, response);
                }

            } else {
                //AGREGAR CONTRATO+
                if (new AsesoriaDAO().agregarContratocfk(sce, fecha_pago, Precio, sesionUser, FirmaCliente, fecha_inicio, Ases_Fecha_Fin1,StartDateNEW,EndDateNEW,CAP_StartDateNEW,CAP_EndDateNEW)) {
                    request.setAttribute("msj", "Contrato enviado");
                    request.getRequestDispatcher("Asesoria.jsp").forward(request, response);
                } else {
                    request.setAttribute("err", "Contrato no enviado");
                    request.getRequestDispatcher("Asesoria.jsp").forward(request, response);
                }

                //AGREGAR ASESORIA
                /*
                if (new AsesoriaDAO().agregarAsesoria(sce, sesionUser)) {
                    request.setAttribute("msj", "Contrato enviado");
                    request.getRequestDispatcher("Asesoria.jsp").forward(request, response);
                } else {
                    request.setAttribute("err", "Contrato no enviado");
                    request.getRequestDispatcher("Asesoria.jsp").forward(request, response);
                }*/

            }

        } catch (Exception e) {
            request.setAttribute("err", "Credenciales no enviadas" + e.getMessage());
            request.getRequestDispatcher("Asesoria.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
