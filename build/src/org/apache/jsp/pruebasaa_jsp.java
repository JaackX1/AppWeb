package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pruebasaa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <h3>pago</h3>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id_pago}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fecha_fin_pago}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${monto_pago}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <h3>orden</h3>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id_orden_pago}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id_pago}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <h3>Contrato</h3>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id_contrato}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id_asesoria}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id_plan}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id_capacitacion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sesionUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id_orden_pago1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firma}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fecha_inicio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fecha_fin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("        <input type=\"text\" style=\"width: 86%\" class=\"border-2 border-gray-300 p-1 w-full\" name=\"NameC\" id=\"NameC\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id_visita}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
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
