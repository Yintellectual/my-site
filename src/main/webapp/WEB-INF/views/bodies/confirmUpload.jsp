<article>

<jsp:useBean  id="post" class="com.i2d23.saloon.beans.Post" scope="session"></jsp:useBean>
<jsp:setProperty name="post" property="*"/> 

<form method="POST" action="<%=request.getContextPath()%>/success">
    <input type="submit" value="Confirm Upload">
</form>
	
	
</article>