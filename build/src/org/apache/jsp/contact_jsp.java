package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("        <!--DEFAULT INFO-->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <!--ESTILOS CSS-->\n");
      out.write("        <link href=\"CSS/contacto.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--BODY NAVBAR-->\n");
      out.write("        ");
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
      out.write("            <a href=\"index.jsp\" class=\"nav-branding\">NMA</a>\n");
      out.write("            <li class=\"logo\"><a href=\"index.jsp\"><img src=\"RESOURCE/logo.png\" alt=\"\"></a></li>\n");
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
      out.write("                    <a href=\"#\" class=\"nav-link\">Nosotros</a>\n");
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
      out.write("                    <a href=\"servletCuentas\" class=\"nav-link\">Mi Perfil</a>\n");
      out.write("                </li>\n");
      out.write("                </c:if>\n");
      out.write("                \n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"servletCuentas\" class=\"nav-link\">Mi Perfil</a>\n");
      out.write("                </li>\n");
      out.write("                </c:if>\n");
      out.write("                \n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"servletCuentas\" class=\"nav-link\">Mi perfil</a>\n");
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
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usernameCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </c:if>\n");
      out.write("                        \n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <div class=\"alert alert-warning\">Bienvenido Administrador ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usernameNPer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usernameAPer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                    </c:if>\n");
      out.write("                        \n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <div class=\"alert alert-warning\">Bienvenido Profesional ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usernameNPer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usernameAPer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
      out.write("\n");
      out.write("        <hr style=\"margin: 55px auto;\", color=\"ffffff\">\n");
      out.write("        \n");
      out.write("        <!--BODY CONTENIDO-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h1>contact us</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h4 style=\"text-align:center\">We'd love to hear from you!</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row input-container\">\n");
      out.write("                <div class=\"col-xs-12\">\n");
      out.write("                    <div class=\"styled-input wide\">\n");
      out.write("                        <input type=\"text\" required />\n");
      out.write("                        <label>Name</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                    <div class=\"styled-input\">\n");
      out.write("                        <input type=\"text\" required />\n");
      out.write("                        <label>Email</label> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                    <div class=\"styled-input\" style=\"float:right;\">\n");
      out.write("                        <input type=\"text\" required />\n");
      out.write("                        <label>Phone Number</label> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12\">\n");
      out.write("                    <div class=\"styled-input wide\">\n");
      out.write("                        <textarea required></textarea>\n");
      out.write("                        <label>Message</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12\">\n");
      out.write("                    <div class=\"btn-lrg submit-btn\">Send Message</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--BODY FOOTER-->\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Raleway&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            footer .wave{\n");
      out.write("                background: url('RESOURCE/wave.png')\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <hr style=\"margin: 200px auto;\" color=\"ffffff\">\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"waves\">\n");
      out.write("                <div class=\"wave\" id=\"wave1\"></div>\n");
      out.write("                <div class=\"wave\" id=\"wave2\"></div>\n");
      out.write("                <div class=\"wave\" id=\"wave3\"></div>\n");
      out.write("                <div class=\"wave\" id=\"wave4\"></div>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"icons_social\">\n");
      out.write("                <li><a href=\"#\">\n");
      out.write("                        <ion-icon name=\"logo-facebook\"></ion-icon>\n");
      out.write("                    </a></li>\n");
      out.write("                <li><a href=\"#\">\n");
      out.write("                        <ion-icon name=\"logo-twitter\"></ion-icon>\n");
      out.write("                    </a></li>\n");
      out.write("                <li><a href=\"#\">\n");
      out.write("                        <ion-icon name=\"logo-youtube\"></ion-icon>\n");
      out.write("                    </a></li>\n");
      out.write("                <li><a href=\"#\">\n");
      out.write("                        <ion-icon name=\"logo-whatsapp\"></ion-icon>\n");
      out.write("                    </a></li>\n");
      out.write("                <li><a href=\"#\">\n");
      out.write("                        <ion-icon name=\"logo-instagram\"></ion-icon>\n");
      out.write("                    </a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"menufooter\">\n");
      out.write("                <li><a href=\"#\">Inicio</a></li>\n");
      out.write("                <li><a href=\"#\">Nosotros</a></li>\n");
      out.write("                <li><a href=\"#\">Servicios</a></li>\n");
      out.write("                <li><a href=\"#\">Contactanos</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <p>@2022 No más accidentes | Todos los derechos reservados</p>\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
