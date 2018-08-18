package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inventoryReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("   <style>\n");
      out.write("            .navbar {\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                border-radius: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            footer {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("                padding: 25px;\n");
      out.write("            }\n");
      out.write("            .dropbtn {\n");
      out.write("                background-color: darkcyan;\n");
      out.write("                color: white;\n");
      out.write("                padding: 17px;\n");
      out.write("                padding-left: 20px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown {\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                min-width: 160px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a:hover {background-color: #ddd}\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropbtn {\n");
      out.write("                background-color: #3e8e41;\n");
      out.write("            }\n");
      out.write("            .fieldset {\n");
      out.write("                border: 2px solid #ccc;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"height: 650px\">\n");
      out.write("            \n");
      out.write("            <div style=\"height: 100px; background-color: darkcyan\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\" style=\"padding-right: 18px\">\n");
      out.write("                            <li><a style=\"color: white\" href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span>Sign In</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                <center>\n");
      out.write("                    <h3 style=\"color: whitesmoke; padding: 20px\">Rangs Electronics Bangladesh Ltd</h3>\n");
      out.write("                    <h4 style=\"color: whitesmoke;\">Report archive</h4>\n");
      out.write("                </center>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"p-3 mb-2 bg-info text-white\">\n");
      out.write("\n");
      out.write("                <fieldset class=\"fieldset\" >\n");
      out.write("                    <legend>Search</legend>\n");
      out.write("                    <div class=\"dropdown\"  style=\"padding-left: 280px; padding-bottom: 30px\">\n");
      out.write("                        <form class=\"form-horizontal\" action=\"searchind.htm\">\n");
      out.write("                             <button class=\"dropbtn\">Date wise Report</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"dropdown\" style=\"padding-left: 40px\">\n");
      out.write("                        <form class=\"form-horizontal\" action=\"searchSchool.htm\">\n");
      out.write("                             <button class=\"dropbtn\">Product wise Report</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"dropdown\" style=\"padding-left: 40px\">\n");
      out.write("                        <form class=\"form-horizontal\" action=\"doViewInformationAdInfo.htm\">\n");
      out.write("                             <button class=\"dropbtn\">View Information</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"background-color: darkcyan\" style=\"height: 15px\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"p-3 mb-2 bg-info text-white\" style=\"height: 100px; border: 2px #ccc solid\">\n");
      out.write("                <p style=\"padding: 25px\">©2005-2018 Ministry of Education, All rights reserved.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
}
