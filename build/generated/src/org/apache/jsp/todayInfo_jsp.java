package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class todayInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .fieldset {\n");
      out.write("                border: 2px solid #ccc;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" style=\"height: 650px\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div style=\"height: 120px; background-color: #333\">\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <center>\n");
      out.write("                            <h2 style=\"color: whitesmoke; padding-top: 20px\">Today's Information</h2>\n");
      out.write("                            <h4 style=\"color: whitesmoke;\">");
      out.print(new Date());
      out.write("</h4>\n");
      out.write("\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"col-sm-3  p-3 mb-2 bg-info text-white\">\n");
      out.write("                        <div class=\"p-3 mb-2 bg-info text-white\">\n");
      out.write("                            <table class=\"table table-striped\">\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Serial no</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">1.</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">2.</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">3.</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">4.</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">5.</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">6.</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">7.</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">8.</th>\n");
      out.write("                                </thead>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 p-3 mb-2 bg-info text-white\">\n");
      out.write("                        <div class=\"p-3 mb-2 bg-info text-white\">\n");
      out.write("                            <table class=\"table table-striped\">\n");
      out.write("\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Account Titles</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Purchase</th>\n");
      out.write("                                </thead>\n");
      out.write("\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Sales</th>\n");
      out.write("                                </thead>\n");
      out.write("\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Expense</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Cost of Good Sold</th>\n");
      out.write("                                </thead>\n");
      out.write("\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Accounts Receivable</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Accounts Payable</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Cash Receive</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">Cash Payment</th>\n");
      out.write("                                </thead>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3  p-3 mb-2 bg-info text-white\">\n");
      out.write("                        <div class=\"p-3 mb-2 bg-info text-white\">\n");
      out.write("                            <table class=\" table table-striped\">\n");
      out.write("\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">amount</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                </thead>\n");
      out.write("\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                </thead>\n");
      out.write("\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${re}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                </thead>\n");
      out.write("                                <thead>\n");
      out.write("                                <th style=\"text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pay}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                </thead>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-offset-4  p-3 mb-2 bg-info text-white\">\n");
      out.write("                        <h3> Today income by selling product ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ti}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("Tk.</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"p-3 mb-2 bg-success text-white\" style=\"height: 100px; border: 2px #ccc solid\">\n");
      out.write("                        <p style=\"padding: 25px\">Rangs Ltd Company, All rights reserved.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
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
