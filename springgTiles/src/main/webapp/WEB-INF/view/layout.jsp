<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    
"http://www.w3.org/TR/html4/loose.dtd">    
<html>
<head>
<meta charset="ISO-8859-1">
<title>
<tiles:insertAttribute name="title"/></title>
</head>
<body>
<div style="text-align: center;background-color: skyblue;padding: 50px"><tiles:insertAttribute name="header"/></div>
<div>
<tiles:insertAttribute name="menu"/></div>
<div style="padding-left: 400px"><tiles:insertAttribute name="body"/></div>
</div>
<div style="background-color: skyblue; padding: 50px"><tiles:insertAttribute name="footer"/></div>

</body>
</html>