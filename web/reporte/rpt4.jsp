<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.*"%>
<%@page import="Conexion.Database"%>
<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
           //variables a utilizar
            Database db = new Database();
            Connection con;
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUs(),
                    db.getPas()
            );
        File jasperFile = new File(application.getRealPath("reporte/rpt4.jasper"));    
        Map parametro = new HashMap();
        //parametro.put("parametro1","aqui va el valor");
        byte[] bytes = JasperRunManager.runReportToPdf(jasperFile.getPath(), 
                                                        null,con);
        response.setContentType("application/pdf");
        response.setContentLength(bytes.length);
        
        ServletOutputStream output = response.getOutputStream();
        response.getOutputStream();
        output.write(bytes,0,bytes.length);
        output.flush();
        output.close();

       %>
    </body>
</html>