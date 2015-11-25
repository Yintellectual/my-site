

<%@ page import="com.i2d23.saloon.beans.Technology"%>
<jsp:useBean id="technology" class="com.i2d23.saloon.beans.Technology"
	scope="session"></jsp:useBean>

<article>
	<form method="POST"
		action="<%=request.getContextPath()%>/upload/success/technology">
		<input type="submit" value="Confirm Upload">


		<%
			technology.setName(request.getParameter("name"));
			Technology.Image image = new Technology.Image();
			image.setUrl(request.getParameter("url"));
			image.setHeight(Integer.parseInt((String)request.getParameter("height")));
			image.setWidth(Integer.parseInt((String)request.getParameter("width")));
			technology.setImage(image);
		%>
		
		<%
			out.println("<a href="+
					request.getContextPath()
					+"/"+
					technology.getName()
					+" target=\"_self\"> <img class=\"topnav-icon-square\" alt=\""+
					technology.getName()
					+"\" src=\""+
					technology.getImage().getUrl()
					+"\"/> </a>");
		%>
	</form>


</article>