<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>This is managerlogin.jsp</title>
</head>
<body>
	<form action="/foodSales/user/checkManagerLogin" method="post">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input id="id" name="id" type="text"></td>
			</tr>
			<tr>
				<td>密 码:</td>
				<td><input id="password" name="password" type="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录"></td>
				<td><input type="button" value="注册"
					onclick="window.location.href='/foodSales/jsp/managerRegist.jsp'"></td>
			</tr>

		</table>
	</form>
</body>
</html>