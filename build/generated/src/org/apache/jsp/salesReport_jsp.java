package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salesReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body >\n");
      out.write("        <div class=\"container\"  style=\"background-color: #9fcdff;\">\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <hr style=\"border-color: #002752\">\n");
      out.write("\n");
      out.write("                <h2>View Sales Information and Create Report</h2>\n");
      out.write("                <span class=\"clearfix\"></span>\n");
      out.write("                <hr  style=\"border-color: #002752\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div style=\"background-color: #1c7430\">\n");
      out.write("                <div class=\" col-sm-offset-3 col-sm-6\">\n");
      out.write("                    <form class=\"form-horizontal\" action=\"\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Select Month</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                             <select class=\"form-control\" name=\"month\">\n");
      out.write("                                        <option >Today's report</option>\n");
      out.write("                                        <option >January</option>\n");
      out.write("                                        <option >February</option>\n");
      out.write("                                        <option >March</option>\n");
      out.write("                                        <option >April</option>\n");
      out.write("                                        <option >May</option>\n");
      out.write("                                        <option >June</option>\n");
      out.write("                                        <option >July</option>\n");
      out.write("                                        <option >August</option>\n");
      out.write("                                        <option >September</option>\n");
      out.write("                                        <option >October</option>\n");
      out.write("                                        <option >November</option>\n");
      out.write("                                        <option >December</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Payable:</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"payable\" placeholder=\"Customer Company name\" name=\"payable\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-sm-offset-5 col-sm-7\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-danger\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("                function f1() {\n");
      out.write("                    var q1 = parseInt(document.getElementById(\"q\").value);\n");
      out.write("                    var c1 = parseInt(document.getElementById(\"c\").value);\n");
      out.write("                    var t1 = q1 * c1;\n");
      out.write("                    document.getElementById(\"t\").value = t1;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function f2() {\n");
      out.write("                    var a = parseInt(document.getElementById(\"t\").value);\n");
      out.write("                    var b = parseInt(document.getElementById(\"tc\").value);\n");
      out.write("                    var c = parseInt(document.getElementById(\"oc\").value);\n");
      out.write("                    var result = a + b + c;\n");
      out.write("                    document.getElementById(\"tp\").value = result;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function f3() {\n");
      out.write("                    var a = parseInt(document.getElementById(\"t\").value);\n");
      out.write("                    var b = parseInt(document.getElementById(\"payment\").value);\n");
      out.write("                    var result = a - b;\n");
      out.write("                    document.getElementById(\"payable\").value = result;\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
