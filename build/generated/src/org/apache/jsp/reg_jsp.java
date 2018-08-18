package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_errors_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_errors_path_nobody.release();
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
      out.write("    <body>\n");
      out.write("        <div class=\"container\" style=\"height: 660px\">\n");
      out.write("            <div style=\"height: 120px; background-color: #1c7430\">\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <center>\n");
      out.write("                <h2 style=\"color: whitesmoke; padding: 20px\">Accounting Information System</h2>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </center>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"p-3 mb-2 bg-info text-danger\">\n");
      out.write("\n");
      out.write("                <fieldset class=\"fieldset\">\n");
      out.write("                    <legend>User Registration</legend>\n");
      out.write("\n");
      out.write("                    <form class=\"form-horizontal\" action=\"save.htm\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"pwd\">User id:</label>\n");
      out.write("                            <div class=\"col-sm-5\">          \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Admin id\" name=\"id\">\n");
      out.write("                                 ");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
      _jspx_th_form_errors_0.setParent(null);
      _jspx_th_form_errors_0.setPath("user.id");
      int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
        if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_errors_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_errors_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_errors_0.doFinally();
        _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_0);
      }
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"pwd\">Name:</label>\n");
      out.write("                            <div class=\"col-sm-5\">          \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Password\" name=\"name\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"pwd\">Email:</label>\n");
      out.write("                            <div class=\"col-sm-5\">          \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Password\" name=\"email\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"pwd\">password:</label>\n");
      out.write("                            <div class=\"col-sm-5\">          \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter Password\" name=\"password\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">        \n");
      out.write("                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                    </form>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
