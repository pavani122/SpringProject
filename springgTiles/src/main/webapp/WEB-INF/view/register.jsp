<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body style="border: 20px; background-color: silver;">
<form:form action="registered" modelAttribute="person">
Name<form:input path="name"/><br><br>
Email<form:input path="email"/><br><br>
Password<form:input path="password"/><br><br>
Number<form:input path="number"/><br><br>
Age<form:input path="age"/><br><br>
Gender
Male<form:radiobutton path="gender" value="male"/>
Female<form:radiobutton path="gender" value="female"/>
<br><br>
<input type="submit" value="Register">
</form:form>

</body>
</html>