<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image:url('orderPlaced.jpg');
background-repeat:no-repeat;
}
</style>
</head>
<body>
<h3>Order Successfully placed</h3>
<form action="${pageContext.request.contextPath}/commerce?">
<button>Continue shopping</button>
</form>
</body>
</html>