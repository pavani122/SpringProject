<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image:url("added.png");
background-repeat:no-repeat;
}
</style>
</head>
<body>
<h2>Added to cart</h2>
<c:out value="${count1}">${count1}</c:out>

</body>
</html>