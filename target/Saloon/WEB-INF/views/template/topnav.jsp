<%@ page import="java.util.List"%>
<%@ page import="com.i2d23.saloon.beans.Article"%>
<%@ page import="com.i2d23.saloon.beans.Technology"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDao"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDaoImp"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="org.springframework.web.servlet.support.RequestContextUtils"%>
<div class="w3-container w3-topnav  w3-white" style="padding-top: 3%">
	<style>
.topnav-icon-square {
	width: 102px;
	height: 102px;
}
</style>
	<%
		ApplicationContext context = RequestContextUtils.getWebApplicationContext(request);
		TechnologyDao technologyDao = (TechnologyDao) context.getBean("technologyDaoImp");
		List<Technology> technologyList = technologyDao.list();
	%>
	<%
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
	%>


	<hr>
</div>
