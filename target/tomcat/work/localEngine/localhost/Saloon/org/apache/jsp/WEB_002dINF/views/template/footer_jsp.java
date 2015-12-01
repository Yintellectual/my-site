package org.apache.jsp.WEB_002dINF.views.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\t<footer class=\"w3-container w3-teal\">\r\n");
      out.write("\t\t<h5>Ê²Ã´&#32852;&#31995;&#26041;&#24335;</h5>\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<di>intellectual.y@gmail.com </di>\r\n");
      out.write("\t\t\t<dd>&#27492;&#37038;&#31665;&#19982;qq&#32465;&#23450;</dd>\r\n");
      out.write("\t\t\t<di>13022064834</di>\r\n");
      out.write("\t\t\t<dd>&#27492;&#25163;&#26426;&#19982;&#24494;&#20449;&#32465;&#23450;</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("    <p>\r\n");
      out.write("        <b class=\"w3-small\">2d23.com - &#19996;&#26041;&#27700;&#26408;</b>\r\n");
      out.write("        ( All rights Reserved)\r\n");
      out.write("    </p>\r\n");
      out.write("\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
