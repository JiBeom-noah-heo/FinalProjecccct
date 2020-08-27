<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head>
<body onload="init();">
<script>
var sell_price;
var amount;

function add () {
	hm = document.form.amount;
	sum = document.form.sum;
	hm.value ++ ;

	sum.value = parseInt(hm.value) * sell_price;
}

function init () {
	sell_price = document.form.sell_price.value;
	amount = document.form.amount.value;
	document.form.sum.value = sell_price;
	change();
}

function del () {
	hm = document.form.amount;
	sum = document.form.sum;
		if (hm.value > 1) {
			hm.value -- ;
			sum.value = parseInt(hm.value) * sell_price;
		}
}

function change () {
	hm = document.form.amount;
	sum = document.form.sum;

		if (hm.value < 0) {
			hm.value = 0;
		}
	sum.value = parseInt(hm.value) * sell_price;
}  
</script>
<form name="form" method="get">
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
			<td><input type="hidden" name="sell_price" value="${basket.ba_price }">
				<input type="text" name="amount" value="1" size="3" onchange="change();">
				<input type="button" value=" + " onclick="add();"><input type="button" value=" - " onclick="del();">
			<td><input type="text" name="sum" size="11" readonly></td>
		</tr>
	</c:forEach>	
</c:if>
</table>
</form>
</body>
</html>