package org.apache.jsp.WEB_002dINF.views.bodies.display;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.i2d23.saloon.beans.Article;
import com.i2d23.saloon.beans.Technology;
import com.i2d23.saloon.dao.TechnologyDao;
import com.i2d23.saloon.dao.TechnologyDaoImp;
import com.i2d23.saloon.dao.ArticleDao;
import com.i2d23.saloon.dao.ArticleDaoImp;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

public final class article_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Article article = (Article) request.getAttribute("article");
	session.setAttribute("article", article);
	Technology technology = article.getTechnology();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<article>\r\n");
      out.write("\t<header style=\" background-color: #009688\">\r\n");
      out.write("\t\t<h1 style=\"display:inline; color:white\">\r\n");
      out.write("\t\t\t");
      out.print(technology == null ? "Technology Not Found" : technology.getName());
      out.write("\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<form method=\"post\"\r\n");
      out.write("\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/upload/confirm/changeTechnology\" style=\"float:right\">\r\n");
      out.write("\t\t\t\t\t<select name=\"technology\" onchange=\"\" style=\"display:inline\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								ApplicationContext context = RequestContextUtils.getWebApplicationContext(request);
								TechnologyDao technologyDao = (TechnologyDao) context.getBean("technologyDaoImp");
								List<Technology> technologyList = technologyDao.list();
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								for (Technology t : technologyList) {
									out.println("<option value=\"" + t.getId() + "\">" + t.getName() + "</option>");
								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Change Technology Catagory\" style=\"display:inline\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		out.println("<section class=\"w3-container w3-padding-32\">");
		out.println("<a href=\"http://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath() + "/article/" + article.getTitle() + "\">");
		out.println("<h3 class=\"w3-orange\">");
		out.println(article.getTitle());
		out.println("</h3></a>");
		out.println("<pre>");
		out.print(article.getContent());
		out.println("</pre>");
		out.println("</section>");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- å¤è¯´è¯è®ºæ¡ start -->\r\n");
      out.write("\t<div class=\"ds-thread\" data-thread-key=\"");
      out.print(article.getId());
      out.write("\"\r\n");
      out.write("\t\tdata-title=\"");
      out.print(article.getTitle());
      out.write("\"\r\n");
      out.write("\t\tdata-url=\"");
out.print("http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()
					+ "/article/" + article.getTitle());
      out.write("\"></div>\r\n");
      out.write("\t<!-- å¤è¯´è¯è®ºæ¡ end -->\r\n");
      out.write("\t<!-- å¤è¯´å¬å±JSä»£ç  start (ä¸ä¸ªç½é¡µåªéæå¥ä¸æ¬¡) -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar duoshuoQuery = {\r\n");
      out.write("\t\t\tshort_name : \"2d23\"\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t(function() {\r\n");
      out.write("\t\t\tvar ds = document.createElement('script');\r\n");
      out.write("\t\t\tds.type = 'text/javascript';\r\n");
      out.write("\t\t\tds.async = true;\r\n");
      out.write("\t\t\tds.src = (document.location.protocol == 'https:' ? 'https:'\r\n");
      out.write("\t\t\t\t\t: 'http:')\r\n");
      out.write("\t\t\t\t\t+ '//static.duoshuo.com/embed.js';\r\n");
      out.write("\t\t\tds.charset = 'UTF-8';\r\n");
      out.write("\t\t\t(document.getElementsByTagName('head')[0] || document\r\n");
      out.write("\t\t\t\t\t.getElementsByTagName('body')[0]).appendChild(ds);\r\n");
      out.write("\t\t})();\r\n");
      out.write("\t</script>\r\n");
      out.write("</article>");
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
