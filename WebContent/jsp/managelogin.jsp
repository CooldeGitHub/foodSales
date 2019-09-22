<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>This is login.jsp</title>
</head>
<body>
	<form action="/foodSales/user/checkManagerLogin" method="post">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input id="uname" name="uname" type="text"></td>
            </tr>
            <tr>
                <td>密 码:</td>
                <td><input id="password" name="password" type="password"></td>
            </tr>
            <tr >
                <td><input type="submit" value="买家用户登录"></td>
                <td><input type="button" value="商家登录" 
                	onclick="window.location.href='managelogin'"></td>
                <td><input type="button" value="注册" 
                	onclick="window.location.href='regist'"></td>
            </tr>

        </table>
    </form>
</body>
</html>