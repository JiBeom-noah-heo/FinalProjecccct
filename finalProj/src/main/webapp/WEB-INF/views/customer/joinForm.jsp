<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/finalProj/js/jquery.js"></script>
<script type="text/javascript">
	function idChk() {
		if (!frm.c_id.value) { 
			alert("아이디 입력");
			frm.c_id.focus();
			return false;			
		}
		$.post('idChk','id='+frm.c_id.value, function(data) {
			$('#disp').html(data);
		});
	}
	function chk() {
		if (frm.c_password.value != frm.c_password2.value) {
			alert("암호와 암호 확인이 다릅니다");
			frm.c_password.focus();
			frm.c_password.value="";
			return false;
		}
	} 
</script></head><body>
<div class="container" align="center">
<form action="join" method="post" name="frm" 
	onsubmit="return chk()">
	<table class="table table-bordered">
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name="c_id" required="required" 
				autofocus="autofocus">
				<input type="button" onclick="idChk()"
				value="중복체크">	
				<span id="disp" class="err"></span>
			</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>
				<input type="password" name="c_password" 
				required="required"></td>
		</tr>
		<tr>
			<td>비밀번호 확인</td>
			<td>
				<input type="password" name="c_password2" 
				required="required"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td>
				<input type="text" name="c_name" 
				required="required">
			</td>
		</tr>
		<tr>
			<td>성별</td>
			<td> 
				<input type='checkbox' name='c_gender' value='female'>여성
	  			<input type='checkbox' name='c_gender' value='male'>남성
	  		</td>
	  	</tr>
		<tr>
			<td>주소</td>
			<td>
				<input type="text" name="c_address" required="required">
			</td>
		</tr>
		<tr>
			<td>우편번호</td>
			<td>
				<input type="text" name="c_zip" required="required">
			</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>
				<input type="email" name="c_email" required="required">
			</td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td>
				<input type="tel" name="c_tel" required="required">
			</td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" >
			</th>
		</tr>
	</table>
</form>
<a href="loginForm" class="btn btn-default">로그인</a>
</div>
</body>
</html>