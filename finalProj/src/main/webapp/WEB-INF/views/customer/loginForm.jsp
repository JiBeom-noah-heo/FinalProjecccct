<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title></head><body>
<div class="container">
<form action="login">
	<table class="table table-hover">
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name="c_id" required="required" autofocus="autofocus">
			</td>
		</tr>
		<tr>
			<td>암호</td>
			<td>
				<input type="password" name="c_password"required="required">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit">
			</td>
		</tr>
	</table>
</form>
</div>
</body>
</html>