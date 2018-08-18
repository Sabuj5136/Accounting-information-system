package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editSupplier_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      com.exam.supplier.SupplierDAO ss = null;
      synchronized (request) {
        ss = (com.exam.supplier.SupplierDAO) _jspx_page_context.getAttribute("ss", PageContext.REQUEST_SCOPE);
        if (ss == null){
          ss = new com.exam.supplier.SupplierDAO();
          _jspx_page_context.setAttribute("ss", ss, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: whitesmoke;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div style=\"height: 120px; background-color: #333\">\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <center>\n");
      out.write("                        <h2 style=\"color: whitesmoke; padding-top: 20px\">Rangs Electronics Ltd.</h2>\n");
      out.write("                        <h4 style=\"color: whitesmoke;\">Email:Rangs45@gmail.com</h4>\n");
      out.write("\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <hr style=\"border-color: #002752\">\n");
      out.write("           \n");
      out.write("            <h2>Add new Supplier</h2>\n");
      out.write("            <span class=\"clearfix\"></span>\n");
      out.write("            <hr  style=\"border-color: #002752\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div style=\"background-color: #1c7430\">\n");
      out.write("                <div class=\" col-sm-offset-3 col-sm-6\">\n");
      out.write("                    <form class=\"form-horizontal\" action=\"saveNewSupplier.htm\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Supplier name:</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Supplier name\" name=\"name\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Supplier Phone:</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Supplier Phone\" name=\"phone\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">CompanyName:</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Supplier Company name\" name=\"companyName\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-sm-offset-5 col-sm-7\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-danger\" onclick=\"m1()\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"background-color: darkcyan\" style=\"height: 15px\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"p-3 mb-2 bg-info text-white\" style=\"height: 100px; border: 2px #ccc solid\">\n");
      out.write("                <p style=\"padding: 25px\">Rangs Ltd Company, All rights reserved.</p>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
