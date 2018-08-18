package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addNewCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      com.exam.customer.CustomerDAO ss = null;
      synchronized (request) {
        ss = (com.exam.customer.CustomerDAO) _jspx_page_context.getAttribute("ss", PageContext.REQUEST_SCOPE);
        if (ss == null){
          ss = new com.exam.customer.CustomerDAO();
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
      out.write("    <body style=\"background-color: #686868;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div style=\"height: 120px; background-color: #333\">\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <center>\n");
      out.write("                        <h2 style=\"color: whitesmoke; padding-top: 20px\">Rangs Electronics Ltd.</h2>\n");
      out.write("                        <h4 style=\"color: whitesmoke;\">Email:Rangs45@gmail.com</h4>\n");
      out.write("\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <hr style=\"border-color: #002752\">\n");
      out.write("\n");
      out.write("                <h2>Add new Customer</h2>\n");
      out.write("                <span class=\"clearfix\"></span>\n");
      out.write("                <hr  style=\"border-color: #002752\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div style=\"background-color: #1c7430\">\n");
      out.write("                <div class=\" col-sm-offset-3 col-sm-6\">\n");
      out.write("                    <form class=\"form-horizontal\" action=\"saveNewCustomer.htm\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Customer name:</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Customer name:\" name=\"name\">\n");
      out.write("                                ");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
      _jspx_th_form_errors_0.setParent(null);
      _jspx_th_form_errors_0.setPath("customer.name");
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
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Customer Phone:</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Customer Phone\" name=\"phone\">\n");
      out.write("                                ");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      _jspx_th_form_errors_1.setPageContext(_jspx_page_context);
      _jspx_th_form_errors_1.setParent(null);
      _jspx_th_form_errors_1.setPath("customer.phone");
      int[] _jspx_push_body_count_form_errors_1 = new int[] { 0 };
      try {
        int _jspx_eval_form_errors_1 = _jspx_th_form_errors_1.doStartTag();
        if (_jspx_th_form_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_errors_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_errors_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_errors_1.doFinally();
        _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_1);
      }
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">CompanyName:</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Customer Company name\" name=\"companyName\">\n");
      out.write("                                  ");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      _jspx_th_form_errors_2.setPageContext(_jspx_page_context);
      _jspx_th_form_errors_2.setParent(null);
      _jspx_th_form_errors_2.setPath("customer.companyName");
      int[] _jspx_push_body_count_form_errors_2 = new int[] { 0 };
      try {
        int _jspx_eval_form_errors_2 = _jspx_th_form_errors_2.doStartTag();
        if (_jspx_th_form_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_errors_2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_errors_2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_errors_2.doFinally();
        _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_2);
      }
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-sm-offset-5 col-sm-7\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-danger\" onclick=\"mm()\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("                function mm(){\n");
      out.write("                    window.alert(\"");
      out.print(ss.showCustomerId());
      out.write("\");\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
