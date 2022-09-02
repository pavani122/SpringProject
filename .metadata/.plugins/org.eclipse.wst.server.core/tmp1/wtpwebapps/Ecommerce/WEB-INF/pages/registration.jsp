<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image:url('register.jpg');
background-repeat:no-repeat;
}
</style>
</head>
<body>

<form:form action="${pageContext.request.contextPath}/registrate" method="get" modelAttribute="user1">
<table align="center">
<tr>
<td><form:label path="username">Username:</form:label></td>
<td><form:input path="username" id="username" name="username"></form:input></td>
</tr>
<tr>
<td><form:label path="emailId">EmailId:</form:label></td>
<td><form:input path="emailId" id="emailId" name="emailId"></form:input></td>
</tr>
<tr>
<td><form:label path="password">Password:</form:label></td>
<td><form:input path="password" id="password" name="password"></form:input></td>
</tr>
<tr>
<td><form:label path="phonenumber">PhoneNumber</form:label></td>
<td><form:input path="phonenumber" id="phonrnumber" name="phonenumber"></form:input></td>
</tr>
<tr>
<td><form:label path="city">City:</form:label></td>
<td><form:input path="city" id="city" name="city"></form:input></td>
</tr>
<tr>
<td><form:label path="country">Country:</form:label></td>
<td><form:input path="country"/></td>
</tr>
<tr>
<td><form:label path="pincode">Pincode:</form:label></td>
<td><form:input path="pincode" id="pincode" name="pincode"/></td>
</tr>
<tr>
<td><form:button id="register" name="register">Register</form:button></td>
</tr>
</table>
</form:form>
</body>
</html>