package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class sales_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"ajs/angular.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"ajs/app.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\" background-color: steelblue\">\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <h2>Select Product for selling</h2>\n");
      out.write("            <span class=\"clearfix\"></span>\n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("            <div class=\"row\" style=\" background-color: #1b6d85\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                 \n");
      out.write("                    <form>\n");
      out.write("                        <select class=\"form-control bg-primary\" name=\"cmbDept\" onchange=\"this.form.submit();\">\n");
      out.write("                            <option value=\"0\">Select product id</option>\n");
      out.write("                            ");

                                try {
                                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/informationsystem", "root", "apcl123456");
                                    PreparedStatement pstmt = con.prepareStatement("select distinct productId,serial from product");
                                    ResultSet rs = pstmt.executeQuery();
                                    while (rs.next()) {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString("serial"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("productId"));
      out.write("</option>\n");
      out.write("                            ");

                                    }
                                    con.close();
                                    rs.close();
                                } catch (Exception e) {
                                    e.printStackTrace();

                                }

                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("              </form>\n");
      out.write("                \n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form class=\"form-horizontal\" action=\"temporary.htm\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
                    try {
                                Class.forName("com.mysql.jdbc.Driver").newInstance();
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/informationsystem", "root", "apcl123456");
                                PreparedStatement pstmt = con.prepareStatement("select * from product where serial=" + Integer.parseInt(request.getParameter("cmbDept")));
                                ResultSet rs = pstmt.executeQuery();
                                while (rs.next()) {
                        
      out.write("\n");
      out.write("                        <table>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-5\">Product Id:</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\"  name=\"id\" value=\"");
      out.print(rs.getString("productId"));
      out.write("\"   placeholder=\"Enter email\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-5\">Product Name:</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString("productName"));
      out.write("\" name=\"name\" placeholder=\"Enter email\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-5\">Model</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString("model"));
      out.write("\" name=\"model\" placeholder=\"Enter fullname\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-5\">Stock </label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString("stock"));
      out.write("\"  id=\"stock\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-5\">sales Per(unit)</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString("salesPerUnit"));
      out.write("\" name=\"unitPrice\" id=\"s1\" placeholder=\"Enter fullname\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-5\">Quantity</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Enter fullname\" name=\"quantity\" id=\"q1\" onkeyup=\"f1()\">\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-5\">Total</label>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Enter fullname\" id=\"result\" name=\"total\">\n");
      out.write("                                                             \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-sm-offset-6 col-sm-6\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\" ng-click=\"save()\" data-dismiss=\"modal\" >Save</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        ");

                                }
                                rs.close();
                                con.close();

                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }


                        
      out.write("\n");
      out.write("\n");
      out.write("                    </form> \n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            function f1(){\n");
      out.write("                            var a=parseInt(document.getElementById(\"s1\").value);\n");
      out.write("                            var st=parseInt(document.getElementById(\"stock\").value);\n");
      out.write("                            var b=parseInt(document.getElementById(\"q1\").value);\n");
      out.write("                            var s=st-b;\n");
      out.write("                            \n");
      out.write("                            if(s<0){\n");
      out.write("                                window.alert(\"Stock is not available\");\n");
      out.write("                            }else{\n");
      out.write("                                var ab=a*b;\n");
      out.write("                             document.getElementById(\"result\").value=ab;\n");
      out.write("                            }\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                        </script>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
