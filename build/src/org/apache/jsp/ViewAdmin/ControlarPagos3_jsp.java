package org.apache.jsp.ViewAdmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ControlarPagos3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin</title>\n");
      out.write("    <link href=\"../CSS/pPro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <link href=\"../CSS/StyleP.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\">\n");
      out.write("\n");
      out.write("    <!--Gooogle Fonts-->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Raleway&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!--Gooogle Fonts-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("\n");
      out.write("    <!--Glightbox\n");
      out.write("    <link href=\"CSS/glightbox.min.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"\n");
      out.write("        integrity=\"sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8=\" crossorigin=\"anonymous\">\n");
      out.write("        </script>\n");
      out.write("    <script>\n");
      out.write("        $(function () {\n");
      out.write("            $(\".toggle\").on(\"click\", function () {\n");
      out.write("                if ($(\".item\").hasClass(\"active\")) {\n");
      out.write("                    $(\".item\").removeClass(\"active\");\n");
      out.write("                } else {\n");
      out.write("                    $(\".item\").addClass(\"active\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        footer .wave{\n");
      out.write("            background: url('../RESOURCE/wave.png')\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <a href=\"#\" class=\"nav-branding\"></a>\n");
      out.write("            <li class=\"logo\"><a href=\"#\"><img src=\"../RESOURCE/logo.png\" alt=\"\"></a></li>\n");
      out.write("          \n");
      out.write("            <ul class=\"nav-menu\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"nav-link\">Inicio</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link\">Servicios</a>\n");
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
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("      \n");
      out.write("                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div class=\"hamburger\">\n");
      out.write("                <span class=\"bar\"></span>\n");
      out.write("                <span class=\"bar\"></span>\n");
      out.write("                <span class=\"bar\"></span>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"../JS/script.js\" type=\"text/javascript\"></script>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <hr style=\"margin: 55px auto;\" color=\"ffffff\">\n");
      out.write("\n");
      out.write("    <!--Glightbox-->\n");
      out.write("    <script src=\"../JS/glightbox.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script>\n");
      out.write("        const glightbox = GLightbox({\n");
      out.write("            selector: '.glightbox'\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"main-body\">\n");
      out.write("          <div class=\"row gutters-sm\">\n");
      out.write("            <div class=\"col-md-4 mb-3\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"d-flex flex-column align-items-center text-center\">\n");
      out.write("                      <img src=\"../images/user.png\" alt=\"\" class=\"rounded-circle\" width=\"150\">\n");
      out.write("                    <div class=\"mt-3\">\n");
      out.write("                      <h4>Nombre1 Apellido1</h4>\n");
      out.write("                      <p class=\"text-secondary mb-1\">Administrador</p>\n");
      out.write("                      <button class=\"btn btn-success\">Editar</button>\n");
      out.write("                      <button class=\"btn btn-outline-danger\">Logout</button>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"card mt-3\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"d-flex flex-column align-items-center text-center\">\n");
      out.write("                      <img src=\"../images/Logo_PNG.png\" alt=\"\" class=\"rounded-circle\" width=\"150\">\n");
      out.write("                    <div class=\"mt-3\">\n");
      out.write("                      <h4>NMA</h4>\n");
      out.write("                      <p class=\"text-secondary mb-1\">No mas accidentes</p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("              <div class=\"card mb-3\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h6 class=\"mb-0\" style=\"text-align: center\">CONTROLAR PAGOS DE CLIENTES</h6>\n");
      out.write("                  <hr>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                      <h6 class=\"mb-0\">Rut</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                      205582510\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <hr>  \n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                      <h6 class=\"mb-0\">Nombre</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                      StarLink\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <hr>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                      <h6 class=\"mb-0\">Direccion</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                      los cantantes 2013\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <hr>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                      <h6 class=\"mb-0\">Telefono</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                      9 8735 3963\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                      <h6 class=\"mb-0\">Correo</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                      cliente@gmail.com\n");
      out.write("                    </div>\n");
      out.write("                  </div>              \n");
      out.write("                  <hr>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <a class=\"btn btn-success\" href=\"ControlarPagos.jsp\">volver</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                  <hr>\n");
      out.write("                  <!--<button class=\"btn btn-success\">Guardar</button>-->\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("                <div class=\"card mb-3\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                      <div class=\"col\">\n");
      out.write("                          <strong>Estado</strong>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        <strong>Fecha Pago</strong>\n");
      out.write("                      </div>  \n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        <strong>Id Pago</strong>\n");
      out.write("                      </div>  \n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        \n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                        <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        Pendiente\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        30/9/2022\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        U198273zz\n");
      out.write("                      </div>                        \n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        <button class=\"btn btn-success\">Notificar</button>\n");
      out.write("                      </div>                        \n");
      out.write("                    </div>\n");
      out.write("                        <hr>\n");
      out.write("                        \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        Pendiente\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        30/9/2022\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        U198273zz\n");
      out.write("                      </div>                        \n");
      out.write("                      <div class=\"col\">\n");
      out.write("                        <button class=\"btn btn-success\">Notificar</button>\n");
      out.write("                      </div>                        \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <hr style=\"margin: 200px auto;\" color=\"ffffff\">\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"waves\">\n");
      out.write("            <div class=\"wave\" id=\"wave1\"></div>\n");
      out.write("            <div class=\"wave\" id=\"wave2\"></div>\n");
      out.write("            <div class=\"wave\" id=\"wave3\"></div>\n");
      out.write("            <div class=\"wave\" id=\"wave4\"></div>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"icons_social\">\n");
      out.write("            <li><a href=\"#\">\n");
      out.write("                    <ion-icon name=\"logo-facebook\"></ion-icon>\n");
      out.write("                </a></li>\n");
      out.write("            <li><a href=\"#\">\n");
      out.write("                    <ion-icon name=\"logo-twitter\"></ion-icon>\n");
      out.write("                </a></li>\n");
      out.write("            <li><a href=\"#\">\n");
      out.write("                    <ion-icon name=\"logo-youtube\"></ion-icon>\n");
      out.write("                </a></li>\n");
      out.write("            <li><a href=\"#\">\n");
      out.write("                    <ion-icon name=\"logo-whatsapp\"></ion-icon>\n");
      out.write("                </a></li>\n");
      out.write("            <li><a href=\"#\">\n");
      out.write("                    <ion-icon name=\"logo-instagram\"></ion-icon>\n");
      out.write("                </a></li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"menufooter\">\n");
      out.write("            <li><a href=\"#\">Inicio</a></li>\n");
      out.write("            <li><a href=\"#\">Nosotros</a></li>\n");
      out.write("            <li><a href=\"#\">Servicios</a></li>\n");
      out.write("            <li><a href=\"#\">Contactanos</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <p>@2022 No más accidentes | Todos los derechos reservados</p>\n");
      out.write("    </footer>\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("    <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <li class=\"nav-item\">\n");
        out.write("                    <a href=\"#\" class=\"nav-link\">Agregar profesional</a>\n");
        out.write("                </li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <li class=\"nav-item\">\n");
        out.write("                    <a href=\"#\" class=\"nav-link\">Listado Clientes</a>\n");
        out.write("                </li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <li class=\"nav-item\">\n");
        out.write("                    <a href=\"#\" class=\"nav-link\">Reportar accidente</a>\n");
        out.write("                </li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                   \n");
        out.write("                    ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        \n");
        out.write("                    ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        \n");
        out.write("                    ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("                    \n");
        out.write("                    <li class=\"item button\"><a href=\"servletLogin\">Cerrar Sesion</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"alert alert-primary\">Bienvenido Cliente ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"alert alert-warning\">Bienvenido Administrador ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"alert alert-warning\">Bienvenido Profesional ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <li class=\"item button\"><a href=\"login.jsp\">Iniciar Sesion</a></li>\n");
        out.write("                <li class=\"item button secondary\"><a href=\"login.jsp\">Registrarse</a></li>\n");
        out.write("                <li class=\"toggle\"><span class=\"bars\"></span></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }
}
