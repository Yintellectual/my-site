<%@ page import="java.util.List"%>
<%@ page import="com.i2d23.saloon.beans.Article"%>
<%@ page import="com.i2d23.saloon.beans.Technology"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDao"%>
<%@ page import="com.i2d23.saloon.dao.TechnologyDaoImp"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="org.springframework.web.servlet.support.RequestContextUtils"%>
<style>
input {
	display: block
}
</style>
<article>
	<form method="post"
		action="<%=request.getContextPath()%>/upload/confirm/technology">
		<table class="w3-border w3-bordered w3-striped">
			<tr>
				<td class="w3-padding-16" align="right" >Technology Name:</td>
				<td><input type="text" value="" name="name" /></td>
				
			</tr>
			<tr>
				<td class="w3-padding-16" align="right" >Icon URL:</td>
				<td><input type="text" value="" name="url" /></td>
				
			</tr>
			<tr>
				<td class="w3-padding-16" align="right" >Height:</td>
				<td><input type="text" value="" name="height" />px</td>
			</tr>
			<tr>
				<td class="w3-padding-16" align="right" >Width:</td>
				<td><input type="text" value="" name="width" />px</td>
				
			</tr>
			<tr>
				<td class="w3-padding-16" align="left" ></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>

		
	</form>
</article>