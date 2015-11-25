<%@ page import="java.util.List"%>
<%@ page import="com.i2d23.saloon.beans.Article"%>
<%@ page import="com.i2d23.saloon.beans.Technology"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDao"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDaoImp"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="org.springframework.web.servlet.support.RequestContextUtils"%>

<jsp:useBean id="article" class="com.i2d23.saloon.beans.Article"
	scope="session"></jsp:useBean>

<article>
	<form method="POST"
		action="<%=request.getContextPath()%>/upload/success/article">
		<input type="submit" value="Confirm Upload">

		<%
			ApplicationContext context = RequestContextUtils.getWebApplicationContext(request);
			TechnologyDao technologyDao = (TechnologyDao) context.getBean("technologyDaoImp");
			List<Technology> technologyList = technologyDao.list();
		%>
		<%
			Technology technology=null;
			for (Technology t : technologyList) {
				//out.println(request.getParameter("technology"));
				//out.println(request.getParameter("technology").getClass());
				if (t.getId() == Integer.parseInt((String) request.getParameter("technology")))
					technology = t;
			}
			if (technology == null)
				out.println("Error technology does not exist");
		%>
		<%
			article.setTechnology(technology);
			technology.addArticle(article);
			article.setTitle(request.getParameter("title"));
			article.setContent(request.getParameter("content"));
		%>

		<%
			out.println(article.getTechnology().getName());
			out.println(article.getTitle());
			out.println(article.getContent());
		%>
	</form>


</article>