<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
	<div>
		<c:forEach items="${list3}" var="list3">
			<div style="width: 25%;float:left;">
				<div>
					<c:out value="${list3.prod_id}">${list3.prod_id}</c:out>
				</div>
				<div>
					<img style="width: 100%;"
						src="data:image/jpg;base64,${list3.base64}" />
				</div>
				<div>
					<c:out value="${list3.prod_list}">${list3.prod_list}</c:out>
				</div>
				<div>
					<c:out value="${list3.prize}">${list3.prize}</c:out>
				</div>
				<div>
				 <c:out value="${list3.quantity}">${list3.quantity}</c:out> 
					 <input type="number" name="quantity"> 
				</div>

			</div>
			
		</c:forEach>
		
	</div>
	<table>
	<tr>
	<th colspan="2">
		<form action="${pageContext.request.contextPath}/place">
			<button>Place Order</button>
		</form>
		</th>
		</tr>
	</table>
</body>
</html>