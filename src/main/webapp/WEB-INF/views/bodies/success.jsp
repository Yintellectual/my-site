<ul class="w3-ul">
	<style>
		li{display:block}
	</style>
	<jsp:useBean id="post" class="com.i2d23.saloon.beans.Post" scope="session"/>
	<jsp:setProperty property="*" name="post"/>
	
	<li><%=request.getAttribute("success") %></li>
	<li><%=post.getName() %></li>
	<li><%=post.getEmail() %></li>
	<li><%=post.getMessage() %></li>
</ul>