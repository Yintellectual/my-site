<%@ page import="java.util.List"%>
<%@ page import="com.i2d23.saloon.beans.Article"%>
<%@ page import="com.i2d23.saloon.beans.Technology"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDao"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDaoImp"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="org.springframework.web.servlet.support.RequestContextUtils"%>

<article>
	<form method="post"
		action="<%=request.getContextPath()%>/upload/confirm/article">
		<table class="w3-border w3-bordered w3-striped">
			<tr>
				<td class="w3-padding-16" align="right">Technology:</td>
				<td><select name="technology" onchange="">
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
				</select></td>
			</tr>
			<tr>
				<td class="w3-padding-16" align="right">Title:</td>
				<td><input type="text" value="" name="title" /></td>
			</tr>
			<tr>
				<td class="w3-padding-16" align="right">Content:</td>
				<td><textarea name="content" ></textarea></td>
			</tr>
			<tr>
				<td class="w3-padding-16" align="right"></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
			
		</table>
		 


	</form>
</article>