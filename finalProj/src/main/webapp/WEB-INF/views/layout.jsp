<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%-- <%@ include file="header.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title"/></title>
</head>
<body>
<div class="container">
	<table class="table table-bordered">
		<tr>
			<td height="50" colspan="2">
			<tiles:insertAttribute name="header"/>
			</td>
		</tr>
		<tr>
			<td height="450" colspan="2">
				<tiles:insertAttribute name="body"/>
			</td>
		</tr>
		<tr>
			<td height="50" colspan="2">
				<tiles:insertAttribute name="footer"/>
		</tr>
	</table>
</div>
</body>
</html>