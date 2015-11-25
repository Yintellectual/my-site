<ul class="w3-ul">
	<style>
		li{display:block}
	</style>
	<jsp:useBean id="article" class="com.i2d23.saloon.beans.Article" scope="session"/>
	<li><%=article.toString() %></li>
</ul>