<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${result>0}">
	<script type="text/javascript">
		alert("등록 성공");
		location.href="home";
	</script>
</c:if>
<c:if test="${result==0}">
	<script type="text/javascript">
		alert("실패");
		history.go(-1);
	</script>
</c:if>
=======
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

>>>>>>> refs/heads/kiku
</body>
</html>