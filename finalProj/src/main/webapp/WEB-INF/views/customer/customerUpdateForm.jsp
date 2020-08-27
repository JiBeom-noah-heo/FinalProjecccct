<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="customerUpdate">
	<input type="hidden" name="c_id" value="${customer.c_id}">
	<input type="hidden" name="c_password" value="${customer.c_password}">
	<input type="hidden" name="c_gender" value="${customer.c_gender}">
	<input type="hidden" name="c_regdate" value="${customer.c_regdate}">
	<input type="hidden" name="c_del" value="${customer.c_del}">
	<table>
		<tr>
			<th>아이디</th><td>${customer.c_id}</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>
				<input type="text" name="c_name" value="${customer.c_name}"
				required="required">
			</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>
				<input type="text" name="c_address" value="${customer.c_address}"
				required="required">
			</td>
		</tr>
		<tr>
			<th>우편번호</th>
			<td>
				<input type="text" name="c_zip" value="${customer.c_zip}"
				required="required">
			</td>
		</tr>
		<tr>
			<th>회원등급</th>
			<td>
				<input type="text" name="c_grade" value="${customer.c_grade}"
				required="required">
			</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>
				<input type="text" name="c_email" value="${customer.c_email}"
				required="required">
			</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>
				<input type="text" name="c_tel" value="${customer.c_tel}"
				required="required">
			</td>
		</tr>
		<tr>
			<th colspan="2"><input type="submit"></th>
		</tr>
	</table>
</form>
</body>
</html>