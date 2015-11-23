<article>

<jsp:useBean  id="technology" class="com.i2d23.saloon.beans.Technology" scope="session"></jsp:useBean>
<jsp:setProperty name="technology" property="*"/> 

<form method="POST" action="<%=request.getContextPath()%>/upload/success/technology">
    <input type="submit" value="Confirm Upload">
</form>
	
	
</article>