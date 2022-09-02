<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<% 
String name=request.getParameter("name");
%>

<body>
<h1>Welcome, ${name}
<%@ page isELIgnored="false"%>
</h1>
</body>
</html> 