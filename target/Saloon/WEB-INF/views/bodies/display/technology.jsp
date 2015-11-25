<%@ page import="java.util.List"%>
<%@ page import="com.i2d23.saloon.beans.Article"%>
<%@ page import="com.i2d23.saloon.beans.Technology"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDao"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDaoImp"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="org.springframework.web.servlet.support.RequestContextUtils"%>
	
<%
	Technology technology = (Technology)request.getAttribute("technology");
	
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
		if(technology!=null)
		for(Article a:technology.getArticles()){
			out.println("<section class=\"w3-container w3-padding-32\">");
			out.println("<a href=\"http://"+request.getServerName()+":"+ request.getServerPort()+request.getContextPath()+"/article/"+a.getTitle()+"\">");
			out.println("<h3 class=\"w3-orange\">");
			out.println(a.getTitle());
			out.println("</h3></a>");
			out.println("<pre>");
			out.print(a.getContent());
			out.println("</pre>");
			out.println("</section>");
		}
	%>
</article>