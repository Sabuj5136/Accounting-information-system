package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #AAA\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\"\n");
      out.write("                 <div style=\"height: 120px; background-color: #002752\">\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                         <ul class=\"nav navbar-nav navbar-right\" style=\"padding-right: 18px\">\n");
      out.write("                            <li><a style=\"color: white\" href=\"homeInfo.htm\"><span class=\"glyphicon glyphicon-blackboard\"></span>Go Home</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <center>\n");
      out.write("                            <h2 style=\"color: whitesmoke; padding-top: 20px\">Rangs Electronics Ltd.</h2>\n");
      out.write("                            <h4 style=\"color: whitesmoke;\">Email:Rangs45@gmail.com</h4>\n");
      out.write("\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <hr>\n");
      out.write("\n");
      out.write("                    <h2>Create Customer Invoice</h2>\n");
      out.write("                    <span class=\"clearfix\"></span>\n");
      out.write("                    <hr>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <form class=\"form-horizontal\" action=\"saveInvoice.htm\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Customer Id:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <select class=\"form-control\" name=\"customerId\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Gross Sales:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Gross Sales\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ti}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  name=\"grossSales\" id=\"total\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Discount:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Discount amount\" name=\"discount\" id=\"discount\" onkeyup=\"f1()\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Transport Cost:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\"  placeholder=\"Transport amount\" id=\"transport\" name=\"transport\"  onkeyup=\"f2()\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">net Sales:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"netAmount\" placeholder=\"net sales amount\" name=\"netSales\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Payment:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"payment\" placeholder=\"Payment amount\" onkeyup=\"f3()\" name=\"payment\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword3\" class=\"col-sm-3 control-label\">Receivable:</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"balance\" placeholder=\"Receivable amount\" name=\"receivable\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-offset-5 col-sm-7\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-danger\">Submit</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <table class=\"table table-striped\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Product id:</th>\n");
      out.write("                                    <th>Product name:</th>\n");
      out.write("                                    <th>Model</th>\n");
      out.write("                                    <th>Unit price(sales)</th>\n");
      out.write("                                    <th>Quantity</th>\n");
      out.write("                                    <th>Total</th>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <form action=\"sales.jsp\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-info\" value=\"sell more Product\"/><span></span>\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-2\">\n");
      out.write("                                <form action=\"cancel.htm\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-info\" value=\"Refresh\"/><span></span>\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("             function f1() {\n");
      out.write("\n");
      out.write("                        var total = parseInt(document.getElementById(\"total\").value);\n");
      out.write("                        var discount = parseInt(document.getElementById(\"discount\").value);\n");
      out.write("                        var netAmount1 = (total - discount);\n");
      out.write("                        document.getElementById(\"netAmount\").value = netAmount1;\n");
      out.write("                    }\n");
      out.write("                    function f2() {\n");
      out.write("                        var total = parseInt(document.getElementById(\"total\").value);\n");
      out.write("                        var discount = parseInt(document.getElementById(\"discount\").value);\n");
      out.write("                        var transport = parseInt(document.getElementById(\"transport\").value);\n");
      out.write("                        var netAmount2 = (total - discount);\n");
      out.write("                        var net = (netAmount2 - transport);\n");
      out.write("                        document.getElementById(\"netAmount\").value = net;\n");
      out.write("                    }\n");
      out.write("                    function f3() {\n");
      out.write("                        var payment = parseInt(document.getElementById(\"payment\").value);\n");
      out.write("                        var netAmount = parseInt(document.getElementById(\"netAmount\").value);\n");
      out.write("                        var netAmount3 = (netAmount - payment);\n");
      out.write("                        document.getElementById(\"balance\").value = netAmount3;\n");
      out.write("                    }\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ai}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("s");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.model}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.unitPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
