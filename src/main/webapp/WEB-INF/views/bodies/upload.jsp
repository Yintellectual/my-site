<article>
	<form method="post" action="<%=request.getContextPath()%>/confirmUpload">
	<input type="text" value="Name:" name="name"/>
	<input type="text" value="Email:" name="email"/>
	<input type="textarea" value="Message:" name="message"/>
	<input type="submit" value="submit"/>
	</form>
</article>