package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #b1dfbb\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div style=\"height: 120px; background-color: #048277\">\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <center>\n");
      out.write("                        <h2 style=\"color: whitesmoke; padding: 20px\">Accounting Information System</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"p-3 mediatext-justify\" style=\"background-color: #b1dfbb\">\n");
      out.write("\n");
      out.write("                <fieldset class=\"fieldset\">\n");
      out.write("                    <legend>Admin Login</legend>\n");
      out.write("\n");
      out.write("                    <form class=\"form-horizontal\" action=\"login.htm\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"pwd\">User id:</label>\n");
      out.write("                            <div class=\"col-sm-5\">          \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Admin id\" name=\"id\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"pwd\">password:</label>\n");
      out.write("                            <div class=\"col-sm-5\">          \n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Password\" name=\"password\">\n");
      out.write("                              \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">        \n");
      out.write("                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"form-group\">        \n");
      out.write("                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                if You have no Account,Please<a href=\"reg.jsp\"> Click here</a> for Registration.\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</body>\n");
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
