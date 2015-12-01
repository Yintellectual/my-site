package org.apache.jsp.WEB_002dINF.views.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.i2d23.saloon.beans.Article;
import com.i2d23.saloon.beans.Technology;
import com.i2d23.saloon.dao.TechnologyDao;
import com.i2d23.saloon.dao.TechnologyDaoImp;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

public final class topnav_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"w3-container w3-topnav  w3-white\" style=\"padding-top: 3%\">\r\n");
      out.write("\t<style>\r\n");
      out.write(".topnav-icon-square {\r\n");
      out.write("\twidth: 102px;\r\n");
      out.write("\theight: 102px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\t");

		ApplicationContext context = RequestContextUtils.getWebApplicationContext(request);
		TechnologyDao technologyDao = (TechnologyDao) context.getBean("technologyDaoImp");
		List<Technology> technologyList = technologyDao.list();
	
      out.write('\r');
      out.write('\n');
      out.write('	');

		for (Technology technology : technologyList) {
			out.println("<a href="+
					request.getContextPath()
					+"/technology/"+
					technology.getName()
					+" target=\"_self\"> <img class=\"topnav-icon-square\" alt=\""+
					technology.getName()
					+"\" src=\"/images/icons/"+technology.getName()+".png\"onError=\"this.onerror=null;this.src='"+
					technology.getImage().getUrl()
					+"';"
					+"\"/> </a>");
		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("</div>\r\n");
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
