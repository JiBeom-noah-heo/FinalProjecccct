<<<<<<< HEAD
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
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="productInsert">
	<table>
		<tr>
			<th>회사</th>
				<td>
					<input type="text" name="p_pc_name" required="required">
				</td>
		</tr>
		<tr>
			<th>사진</th>
				<td>
					<input type="file" name="p_image" required="required">
				</td>
		</tr>
		<tr>
			<th>상품명</th>
				<td>
					<input type="text" name="p_name" required="required" autofocus="autofocus">
				</td>
		</tr>
		<tr>
			<th>분류</th>
				<td>
					<input type="text" name="p_category" required="required">
				</td>
		</tr>
		<tr>
			<th>브랜드</th>
				<td>
					<input type="text" name="p_brand" required="required">
				</td>
		</tr>
		<tr>		
			<th>사이즈</th>
				<td>
					<input type="text" name="p_size" required="required">
				</td>
		</tr>
		<tr>
			<th>할인</th>
				<td>
					있음<input type="radio" name="p_discount" value="Y" required="required">
					없음<input type="radio" name="p_discount" value="N" required="required">
				</td>
		</tr>
		<tr>
			<th>할인률</th>
				<td>
					<input type="text" name="p_discountrate">
				</td>
		</tr>
		<tr>
			<th>수량</th>
				<td>
					<input type="number" name="p_quantity">
				</td>
		</tr>
		<tr>
			<th colspan="2"><input type="submit"></th>
		</tr>
	</table>
</form>
</body>
>>>>>>> branch 'master' of https://github.com/JiBeom-noah-heo/FinalProjecccct.git
</html>