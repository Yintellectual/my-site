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
	
	<div class="ds-thread" data-thread-key="<%=technology.getId() %>" data-title="<%=technology.getName() %>" data-url="<% out.print(
			"http://"+request.getServerName()+":"+ request.getServerPort()+request.getContextPath()+"/technology/"+technology.getName()
			);%>"></div>
<!-- 多说评论框 end -->
<!-- 多说公共JS代码 start (一个网页只需插入一次) -->
<script type="text/javascript">
var duoshuoQuery = {short_name:"2d23"};
	(function() {
		var ds = document.createElement('script');
		ds.type = 'text/javascript';ds.async = true;
		ds.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') + '//static.duoshuo.com/embed.js';
		ds.charset = 'UTF-8';
		(document.getElementsByTagName('head')[0] 
		 || document.getElementsByTagName('body')[0]).appendChild(ds);
	})();
	</script>
</article>