<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<img alt="대박" src="resources/upload/${product.p_image}">
		<div>
			<table>
				<tr><td>제품명</td><td>
					${product.p_name}<p>
				</td></tr>
				<tr><td>분류</td><td>
					${product.p_category}<p>
				</td></tr>
				<tr><td>브랜드</td><td>
					${product.p_brand}<p>
				</td></tr>
				<tr><td>사이즈</td><td>
					${product.p_size}<p>
				</td></tr>
				<tr><td>할인</td><td>
					${product.p_discount}<p>
				</td></tr>
				<tr><td>할인율</td><td>
					${product.p_discountrate}<p>
				</td></tr>
				<tr><td>수량</td><td>
					${product.p_quantity}<p>
				</td></tr>
				<tr><td>좋아요</td><td>
					${product.p_like}<p>
				</td></tr>
				<tr><td>등록일</td><td>
					${product.p_regdate}
				</td></tr>
			</table>
		</div>

</body>
</html>