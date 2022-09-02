<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {backgroung-image =url('login.jpg');
	background-repeat: no-repeat;
}
</style>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/loginProcess" modelAttribute="user">
		<table align="center">
			<tr>
				<td><form:label path="username">Username:</form:label></td>
				<td><form:input path="username" name="username" id="username"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="password">password:</form:label></td>
				<td><form:input path="password" name="password" id="username"></form:input></td>
			</tr>
			<tr>
				<td><form:button id="login" name="login">Login</form:button>
		</table>
	</form:form>



</body>
</html>