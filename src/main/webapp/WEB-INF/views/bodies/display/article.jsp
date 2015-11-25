<%@ page import="java.util.List"%>
<%@ page import="com.i2d23.saloon.beans.Article"%>
<%@ page import="com.i2d23.saloon.beans.Technology"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDao"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDaoImp"%>
<%@ page import="com.i2d23.saloon.dao.ArticleDao"%>
<%@ page import="com.i2d23.saloon.dao.ArticleDaoImp"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="org.springframework.web.servlet.support.RequestContextUtils"%>

<%
	Article article = (Article)request.getAttribute("article");
	Technology technology = article.getTechnology();
%>

<article>
	<header>
		<h1 class="w3-teal w3-container">
			<%= technology==null?
				"Technology Not Found":
				technology.getName()
			%>
		</h1>
	</header>
	
	
	<%
		
			out.println("<section class=\"w3-container w3-padding-32\">");
			out.println("<a href=\"http://"+request.getServerName()+":"+ request.getServerPort()+request.getContextPath()+"/article/"+article.getTitle()+"\">");
			out.println("<h3 class=\"w3-orange\">");
			out.println(article.getTitle());
			out.println("</h3></a>");
			out.println("<pre>");
			out.print(article.getContent());
			out.println("</pre>");
			out.println("</section>");

	%>
</article>