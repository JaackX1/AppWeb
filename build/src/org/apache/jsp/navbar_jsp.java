package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <a href=\"#\" class=\"nav-branding\"></a>\n");
      out.write("            <li class=\"logo\"><a href=\"#\"><img src=\"RESOURCE/logo.png\" alt=\"\"></a></li>\n");
      out.write("            <ul class=\"nav-menu\">\n");
      out.write("          \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"Controlador?accion=Carrito\" class=\"nav-link\"><i class=\"fas fa-cart-plus\">(<label style=\"color: orange\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>)</i>Carrito</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"nav-link\">Inicio</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"Controlador?accion=home\" class=\"nav-link\">Servicios</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"Planes.jsp\" class=\"nav-link\">Nosotros</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Contactanos</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Mi Perfil</a>\n");
      out.write("                </li>\n");
      out.write("                </c:if>\n");
      out.write("                \n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Mi Perfil</a>\n");
      out.write("                </li>\n");
      out.write("                </c:if>\n");
      out.write("                \n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Mi perfil</a>\n");
      out.write("                </li>\n");
      out.write("                </c:if>\n");
      out.write("                \n");
      out.write("      \n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username!=null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                   \n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <div class=\"alert alert-primary\" >Bienvenido Cliente ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </c:if>\n");
      out.write("                        \n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <div class=\"alert alert-warning\">Bienvenido Administrador ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </c:if>\n");
      out.write("                        \n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <div class=\"alert alert-warning\">Bienvenido Profesional ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </c:if>    \n");
      out.write("                    \n");
      out.write("                    <li class=\"item button\"><a href=\"servletLogin\">Cerrar Sesion</a></li>\n");
      out.write("                </c:if>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username==null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <li class=\"item button\"><a href=\"login.jsp\">Iniciar Sesion</a></li>\n");
      out.write("                <li class=\"item button secondary\"><a href=\"login.jsp\">Registrarse</a></li>\n");
      out.write("                <li class=\"toggle\"><span class=\"bars\"></span></li>\n");
      out.write("                </c:if>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div class=\"hamburger\">\n");
      out.write("                <span class=\"bar\"></span>\n");
      out.write("                <span class=\"bar\"></span>\n");
      out.write("                <span class=\"bar\"></span>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"JS/script.js\" type=\"text/javascript\"></script>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
