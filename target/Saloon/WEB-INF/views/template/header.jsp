<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<header class="w3-container w3-teal ">

	<h1>
		<a target="_blank" href="<%=request.getContextPath()%>/index"><span>&#19996;&#26041;&#27700;&#26408;</span></a>
		<span class="w3-medium">Java &#31508;&#35760; since 3rd
			November 2015</span> 
		<span class="w3-padding" style="float:right" ><a 
			class="w3-small"
			target="_blank" 
			href="<%=request.getContextPath()%>/upload/form/technology">
			&#31449;&#38271;
		</a></span>
		<tiles:insertAttribute name="uploadTechnology" />
		<tiles:insertAttribute name="uploadArticle" />
		
	</h1>
</header>
