<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>WELCOME..!
<c:out value="${username}">${username}</c:out></h4>
<a href="${pageContext.request.contextPath}/commerce?">
<button>Continue Shopping</button></a>
</body>
</html>