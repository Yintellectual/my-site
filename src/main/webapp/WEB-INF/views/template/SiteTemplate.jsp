<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!Doctype html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<tiles:insertAttribute name="cssfilecommon" />
</head> 
<body>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="topnav" />
	<div class="w3-container">
	<style>
		h3 {}
		pre {}
	</style>
	<tiles:insertAttribute name="body" />
	</div>
	
	<tiles:insertAttribute name="footer" />
</body>