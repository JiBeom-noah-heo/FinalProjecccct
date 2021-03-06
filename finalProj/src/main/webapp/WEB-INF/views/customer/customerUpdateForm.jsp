<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<form action="customerUpdate">
	<input type="hidden" name="c_id" value="${customer.c_id}">
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
				<select name="c_grade">
				    <option value="${customer.c_grade}" selected="selected">${customer.c_grade}</option>
				    <option value="family">family</option>
				    <option value="gold">gold</option>
				    <option value="vip">vip</option>
				    <option value="vvip">vvip</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>
				<input type="email" name="c_email" value="${customer.c_email}"
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
			<th>가입일</th>
			<td>
				<input type="date" name="c_regdate" id="datepicker" value="${customer.c_regdate}">
			</td>
		</tr>
		<tr>
			<th colspan="2"><input type="submit"></th>
		</tr>
	</table>
</form>
</body>
</html>