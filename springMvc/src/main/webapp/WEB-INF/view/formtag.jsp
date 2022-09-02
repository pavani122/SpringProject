<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>formtag</title>
</head>
<body>
<form:form action="signin" modelAttribute="user">
Name<form:input path="username"/><br><br>
Email<form:input path="useremail"/><br><br>
Password<form:input path="userpassword"/><br><br>
Age<form:input path="age"/><br><br>
Gender
Male<form:radiobutton path="gender" value="male"/>
Female<form:radiobutton path="gender" value="female"/>
<br><br>
<input type="submit" value="login">
<form:errors path="*"></form:errors>
</form:form>
</body>
</html>