<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>This is regist.jsp</title>
</head>
<body>
	<h3>注册页面</h3>
	<hr />
	<form action="/foodSales/user/doManagerRegist" method="post">
		<table border="1px">
			<tr height="35px">
				<td width="150px">id:</td>
				<td width="300px"><input type="text" name="id" id="id">
				</td>
			</tr>
			<tr height="35px">
				<td>password:</td>
				<td><input type="text" name="password" id="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" id="regist"
					value="注册" /></td>
			</tr>
		</table>
	</form>
</body>
</html>