<ul class="w3-ul">
	<style>
		li{display:block}
	</style>
	<jsp:useBean id="technology" class="com.i2d23.saloon.beans.Technology" scope="session"/>
	<li><%=technology.getName() %></li>
</ul>