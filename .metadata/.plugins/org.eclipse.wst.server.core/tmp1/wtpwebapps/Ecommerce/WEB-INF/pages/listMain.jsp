<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
/* .top{

width:100%;
height:100px;

background-color:yellow;
color:black;

text-align:center;

} */
</style>
</head>
<body>
	
		<%-- <table>

			
				<tr>
					<c:forEach items="${list1}" var="list1">
					<td>
					
						<div>
						<img src="data:image/jpg;base64,${list1.base64}" />
						</div>
						<div>
							<a
								href="${pageContext.request.contextPath}/commerce2/${list1.prod_list}">
									<c:out value="${list1.prod_list}">
									</c:out>
							</a>
						</div>
						<div>
							<c:out value="${list1.prize}">${list1.prize}</c:out>
						</div>
						<div>
							<form action="${pageContext.request.contextPath}/commerce/${list1.prod_list}" method="get">
								<button>Add to Cart</button>
							</form>
						</div>
					</td>
				</c:forEach>
				</tr> 
				
			
		</table> --%>
		
		<div style="width: 100%">

			
					<c:forEach items="${list1}" var="list1">
					
					<div style="width: 25%; float: left;">
					    <div>
					    <c:out value="${list1.prod_id}">${list1.prod_id}</c:out>
					    </div> 
						<div>
						<img style="width: 100%;" src="data:image/jpg;base64,${list1.base64}" />
						</div>
						<div>
							<a
								href="${pageContext.request.contextPath}/commerce2/${list1.prod_list}">
									<c:out value="${list1.prod_list}">${list1.prod_list}
									</c:out>
							</a>
						</div>
						<div>
							<c:out value="${list1.prize}">${list1.prize}</c:out>
						</div>
						<div>
							<form action="${pageContext.request.contextPath}/final1/${list1.prod_id}">
								<button>Add to Cart</button>
							</form>
						</div>
					</div>
					
				</c:forEach>
				</div>
				<%-- <c:forEach items="${list1}" var="list1">
					<div style="width: 25%; float: left;">
					
						<div>
						<img style="width: 100%;" src="data:image/jpg;base64,${list1.base64}" />
						</div>
						<div>
							<a
								href="${pageContext.request.contextPath}/commerce2/${list1.prod_list}">
									<c:out value="${list1.prod_list}">
									</c:out>
							</a>
						</div>
						<div>
							<c:out value="${list1.prize}">${list1.prize}</c:out>
						</div>
						<div>
							<form action="${pageContext.request.contextPath}/commerce/${list1.prod_list}" method="get">
								<button>Add to Cart</button>
							</form>
						</div>
					</div>
				</c:forEach>
				
				
				<c:forEach items="${list1}" var="list1">
					<div style="width: 25%; float: left;">
					
						<div>
						<img style="width: 100%;" src="data:image/jpg;base64,${list1.base64}" />
						</div>
						<div>
							<a
								href="${pageContext.request.contextPath}/commerce2/${list1.prod_list}">
									<c:out value="${list1.prod_list}">
									</c:out>
							</a>
						</div>
						<div>
							<c:out value="${list1.prize}">${list1.prize}</c:out>
						</div>
						<div>
							<form action="${pageContext.request.contextPath}/commerce/${list1.prod_list}" method="get">
								<button>Add to Cart</button>
							</form>
						</div>
					</div>
				</c:forEach>
				
				
				<c:forEach items="${list1}" var="list1">
					<div style="width: 25%; float: left;">
					
						<div>
						<img style="width: 100%;" src="data:image/jpg;base64,${list1.base64}" />
						</div>
						<div>
							<a
								href="${pageContext.request.contextPath}/commerce2/${list1.prod_list}">
									<c:out value="${list1.prod_list}">
									</c:out>
							</a>
						</div>
						<div>
							<c:out value="${list1.prize}">${list1.prize}</c:out>
						</div>
						<div>
							<form action="${pageContext.request.contextPath}/commerce/${list1.prod_list}" method="get">
								<button>Add to Cart</button>
							</form>
						</div>
					</div>
				</c:forEach>
				
			
		</div>
	</div> --%>



</body>
</html>