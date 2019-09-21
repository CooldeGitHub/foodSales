<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>This is regist.jsp</title>
</head>
<body>
    <h3>注册页面</h3>
    <hr/>
    <form action="doRegist" method="post">
        <table border="1px">
        	<tr height="35px">
                <td width="150px">用户id:</td>
                <td width="300px">
                    <input type="text" name="uid" id="uid">
                </td>
            </tr>
            <tr height="35px">
                <td width="150px">用户名:</td>
                <td width="300px">
                    <input type="text" name="uname" id="uname">
                </td>
            </tr>
            <tr height="35px">
                <td>密码:</td>
                <td>
                    <input type="text" name="password" id="password">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" id="regist" value="注册"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>