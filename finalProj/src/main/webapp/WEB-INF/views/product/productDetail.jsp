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
			${product.p_name}<p>
			${product.p_category}<p>
			${product.p_brand}<p>
			${product.p_size}<p>
			${product.p_discount}<p>
			${product.p_discountrate}<p>
			${product.p_quantity}<p>
			${product.p_like}<p>
			${product.p_regdate}
		</div>

</body>
</html>