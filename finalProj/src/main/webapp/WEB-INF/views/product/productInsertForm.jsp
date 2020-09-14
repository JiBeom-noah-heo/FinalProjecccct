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
<h2>상품 등록</h2>
<form enctype="multipart/form-data">
<table border="1">
	<tr>
	<th>상품번호</th>
	<td><input type="text" name="p_num" value="${product.p_num }"></td>
	</tr>
	<tr>
	<th>상품명</th>
	<td><input type="text" name="p_name" value="${product.p_name }"></td>
	</tr>
	<tr>
	<td>1차 카테고리</td>
	<td>
	<select name="category">
		<option value="male">남성</option>
		<option value="female">여성</option>
	</select>
	</td>
	</tr>
	<tr>
	<td>2차 카테고리</td>
	<td>
	<select name="category">
		<option value="top">상의</option>
		<option value="bottom">하의</option>
	</select>
	</td>
	</tr>
	<tr>
	<th>가격</th>
	<td><input type="text" name="p_price" value="${product.p_price }"></td>
	</tr>
	<tr>
	<th>상품명</th>
	<td><input type="text" name="p_name" id="p_name"></td>
	</tr>
	<tr>
	<th>상품명</th>
	<td><input type="text" name="p_name" id="p_name"></td>
	</tr>
	<tr>
	<th>상품명</th>
	<td><input type="text" name="p_name" id="p_name"></td>
	</tr>
	<tr>
	<td></td>
	<td><input type="file" name="p_image" id="p_image">
	</td>
	</tr>
</table>

</form>
</body>
</html>