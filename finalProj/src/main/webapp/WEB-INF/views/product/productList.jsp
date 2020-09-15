<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="product" items="${list}">
<table>
	<tr>
		<td><img alt="대박" src="resources/upload/${product.p_image}" height="150px" width="150px"></td>
	</tr>
	<tr>
		<td><a href="productDetail?name=${product.p_name}">${product.p_name}</a></td>
	</tr>
</table>
<br>
</c:forEach>
</body>


</html>