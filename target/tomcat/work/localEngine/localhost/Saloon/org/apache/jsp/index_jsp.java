package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!Doctype html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write(" \r\n");
      out.write("  <style>\r\n");
      out.write("    li{display:inline}\r\n");
      out.write("  </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("<header class=\"w3-container w3-teal \">\r\n");
      out.write("  <h1><span>&#19996;&#26041;&#27700;&#26408;</span>\r\n");
      out.write("    <span class=\"w3-medium\">Java &#31508;&#35760;</span>\r\n");
      out.write("  </h1>\r\n");
      out.write("</header>\r\n");
      out.write("    <div class=\"w3-container w3-topnav w3-padding-4 w3-theme-l3\"> \r\n");
      out.write("      <ul class=\"w3-ul\">\r\n");
      out.write("        <li>Java Core</li>\r\n");
      out.write("        <li>Spring MVC</li>\r\n");
      out.write("        <li>View Technology</li>\r\n");
      out.write("        <li>Tools &#38; Environments</li>\r\n");
      out.write("        <li>Art of Coding</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("<article>\r\n");
      out.write("<section class=\"w3-container\"> \r\n");
      out.write("    <div class=\"w3-container w3-margin-32 w3-green\">\r\n");
      out.write("<h2>JSP &#38; Tiles</h2>\r\n");
      out.write("\r\n");
      out.write("      <p>The power of Tiles comes from its composite design pattern. Here is the <a href=\"http://www.techzoo.org/spring-framework/spring-mvc-tiles-3-integration-tutorial.html\">tutorial</a>.</p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"w3-container w3-margin-32 w3-red\">\r\n");
      out.write("<h2>HTML5 &#38; CSS3</h2>\r\n");
      out.write("\r\n");
      out.write("<p>Tutorials and References can be found in <a href=\"www.w3school.com\">w3school.com</a>.  If you are interested in the history of HTML family, here is the small funny artile <a href=\"http://www.thymeleaf.org/doc/fromhtmltohtmlviahtml.html\">from html to html via html</a></p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <div class=\"w3-container w3-margin-32 w3-green\">\r\n");
      out.write("<h2>Spring <abbr title=\"Model View Controller\">MVC</abbr> Framework</h2>\r\n");
      out.write("\r\n");
      out.write("<p>There are many frameworks for web application. I choose the most popular one to ease the learning curve. <abbr title=\"Model View Controller\">MVC</abbr> is the main stream model for web applications. Spring MVC provides a single dispatcher to manage controllers, which waits for the requests to manipulates model objects and to pass them to ViewResolvers. The Spring MVC is quite open to different view technologies. Different view technologies have different ViewResolver</p> \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    <div class=\"w3-container w3-margin-32 w3-red\">\r\n");
      out.write("<h2>GitHub</h2>\r\n");
      out.write("\r\n");
      out.write("<p>Although I just use github as online backup repository, I can feel its power inside.</p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"w3-container w3-margin-32 w3-green\">\r\n");
      out.write("<h2>Maven</h2>\r\n");
      out.write("\r\n");
      out.write("<p>Maven is so useful that I almost have it to do everything from managing dependency, compiling, packaging to running the tomcat server. Note that I don't use Maven do testing, well, because I'm still trying to figure out how Junit works.</p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("   <div class=\"w3-container w3-margin-32 w3-red\">\r\n");
      out.write("<h2>Server Administration</h2>\r\n");
      out.write("\r\n");
      out.write("     <p>I have no choice but to learn something about server administration, but unix/linux is cool. </p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("</article>\r\n");
      out.write("    \r\n");
      out.write("<article>\r\n");
      out.write("</article>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<footer class=\"w3-container w3-teal\">\r\n");
      out.write("  <h5>Ê²Ã´&#32852;&#31995;&#26041;&#24335;</h5>\r\n");
      out.write("  <dl >\r\n");
      out.write("    <di>intellectual.y@gmail.com </di>\r\n");
      out.write("    <dd>&#27492;&#37038;&#31665;&#19982;qq&#32465;&#23450;</dd>\r\n");
      out.write("    <di>13022064834</di>\r\n");
      out.write("    <dd>&#27492;&#25163;&#26426;&#19982;&#24494;&#20449;&#32465;&#23450;</dd>\r\n");
      out.write("  </dl>\r\n");
      out.write("    \r\n");
      out.write("</footer>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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
