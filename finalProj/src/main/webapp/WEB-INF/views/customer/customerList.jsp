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
<table>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>성별</th>
		<th>주소</th>
		<th>우편번호</th>
		<th>회원등급</th>
		<th>이메일</th>
		<th>전화번호</th>
		<th>가입일</th>
		<th>탈퇴여부</th>
		<th>수정</th>
	<tr>
<c:forEach var="customer" items="${list}">
	<tr>
		<td><a href="customerDetail?c_id=${customer.c_id}" >${customer.c_id}</a></td>
		<td>${customer.c_name}</td>
		<td>${customer.c_gender}</td>
		<td>${customer.c_address}</td>
		<td>${customer.c_zip}</td>
		<td>${customer.c_grade}</td>
		<td>${customer.c_email}</td>
		<td>${customer.c_tel}</td>
		<td>${customer.c_regdate}</td>
		<td>${customer.c_del}</td>
		<td><a href="customerUpdateForm?id=${customer.c_id}">수정</a></td>
	</tr>	
</c:forEach>
</table>
</body>
</html>