<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<table>
	<caption>장바구니</caption>
	<tr><th>상품번호</th><th>상품명</th><th>브랜드</th>
		<th>수량</th><th>가격</th>
<c:if test="${empty list}">
	<tr><th colspan="5">장바구니에 상품이 없습니다.</th></tr>
</c:if>
<c:if test="${not empty list}">
	<c:forEach var="basket" items="${list }">
		<tr><td>${basket.ba_num }</td>
			<td><a href="">product.p_name</a></td>
			<td>${basket.ba_brand }</td>
			<td><input type="number" value="${basket.ba_quantity }"></td>
			<td>${basket.ba_price }</td>
		</tr>
	</c:forEach>	
</c:if>				
</table>
</body>
</html>