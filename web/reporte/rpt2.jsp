<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.*"%>
<%@page import="Conexion.Database"%>
<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>

            var rut = prompt('Ingrese el # de rut del contrato a buscar : ');
            if (rut === null) {
                window.location.href="AppWeb/AD_PerfilAdmin.jsp";
            } else {
                window.location.href="rpt2.jsp?rut="+rut;
            }





        </script>






    </head>
    <body>
        <%
            if(request.getParameter("rut")!=null){
                String valor = request.getParameter("rut").toString();
                //variables a utilizar
            Database db = new Database();
            Connection con;
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUs(),
                    db.getPas()
            );
            File jasperFile = new File(application.getRealPath("reporte/rpt2.jasper"));
            Map parametro = new HashMap();
            parametro.put("prut",valor);
            byte[] bytes = JasperRunManager.runReportToPdf(jasperFile.getPath(),
                    parametro, con);
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);

            ServletOutputStream output = response.getOutputStream();
            response.getOutputStream();
            output.write(bytes, 0, bytes.length);
            output.flush();
            output.close();
            }
            

        %>
    </body>
</html>
