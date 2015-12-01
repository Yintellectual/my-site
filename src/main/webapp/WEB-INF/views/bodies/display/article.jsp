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
	Article article = (Article) request.getAttribute("article");
	session.setAttribute("article", article);
	Technology technology = article.getTechnology();
%>

<article>
	<header style=" background-color: #009688">
		<h1 style="display:inline; color:white">
			<%=technology == null ? "Technology Not Found" : technology.getName()%>
		</h1>

		<form method="post"
			action="<%=request.getContextPath()%>/upload/confirm/changeTechnology" style="float:right">
					<select name="technology" onchange="" style="display:inline">
							<%
								ApplicationContext context = RequestContextUtils.getWebApplicationContext(request);
								TechnologyDao technologyDao = (TechnologyDao) context.getBean("technologyDaoImp");
								List<Technology> technologyList = technologyDao.list();
							%>
							<%
								for (Technology t : technologyList) {
									out.println("<option value=\"" + t.getId() + "\">" + t.getName() + "</option>");
								}
							%>
					</select>
					<input type="submit" value="Change Technology Catagory" style="display:inline"/>
				

		</form>
	</header>


	<%
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
	%>

	<!-- 多说评论框 start -->
	<div class="ds-thread" data-thread-key="<%=article.getId()%>"
		data-title="<%=article.getTitle()%>"
		data-url="<%out.print("http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()
					+ "/article/" + article.getTitle());%>"></div>
	<!-- 多说评论框 end -->
	<!-- 多说公共JS代码 start (一个网页只需插入一次) -->
	<script type="text/javascript">
		var duoshuoQuery = {
			short_name : "2d23"
		};
		(function() {
			var ds = document.createElement('script');
			ds.type = 'text/javascript';
			ds.async = true;
			ds.src = (document.location.protocol == 'https:' ? 'https:'
					: 'http:')
					+ '//static.duoshuo.com/embed.js';
			ds.charset = 'UTF-8';
			(document.getElementsByTagName('head')[0] || document
					.getElementsByTagName('body')[0]).appendChild(ds);
		})();
	</script>
</article>