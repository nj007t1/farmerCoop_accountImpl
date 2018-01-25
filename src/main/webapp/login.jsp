<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登入</title>
</head>
<body>
	<fieldset>
		<legend>登入會員</legend>
		<form action="login.do"  method="POST">
		<span>E-mail</span>
		<input type="text" name="userMail">
		<font color='red' size='-1'>${errorMasgKey.mailEmptyError}</font><p/>
		
		<span>Password</span>
		<input type="password" name="userPassword">
		<font color='red' size='-1'>${errorMasgKey.passwordEmptyError}</font><p/>
		<input type='checkbox'>記住密碼
		<input type="submit" value="登入">
		<font color='red' size='-1'>${errorMasgKey.loginError}</font>
		</form>
	</fieldset>
</body>
</html>