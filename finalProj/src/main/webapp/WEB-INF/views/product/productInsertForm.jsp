<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="productInsert" method="post"
	enctype="multipart/form-data">
	<div class="container" align="center">
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
					<input type="file" name="file" required="required">
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
	</div>
</form>
</body>
</html>