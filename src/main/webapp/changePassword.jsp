<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密碼</title>
</head>
<body>
	<form action="changePassword.do" method="post">
		變更會員登入密碼<br> 舊密碼:<input name='password' Type='password' size='20' value="${param.password}"><br>
		<div style="color: red; font-size: 60%">${ErrorMsg.password}</div>
		新密碼:<input name='newPassword' Type='password' size='20' value="${param.newPassword}"><br>
		<div style="color: red; font-size: 60%">${ErrorMsg.newPassword}</div>
		新密碼確認:<input name='checkPassword' Type='password' size='20' value="${param.checkPassword}"><br>
		<div style="color: red; font-size: 60%">${ErrorMsg.checkPassword}</div>
		<input Type="submit" value="確認變更">
	</form>

</body>
</html>