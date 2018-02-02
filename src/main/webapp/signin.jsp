<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>申請帳號</title>
</head>
<body>
	<jsp:include page="/fragment/top.jsp" />
	<form action="SigninServlet.do" method="POST">
		申請帳號 <br> 電子信箱: <input name="email" type="text" size="20"
			value="${param.email}">
		<div style="color: red; font-size: 60%">${ErrorMsg.email}</div>

		<br> 密碼: <input name="pswd" type="password" size="8"
			value="${param.pswd}">

		<div style="color: red; font-size: 60%">${ErrorMsg.password}</div>

		<br> 確認密碼: <input name="againpswd" type="password" size="8"
			value="${param.againpswd}">
		<div style="color: red; font-size: 60%">${ErrorMsg.againpassword}</div>

		<br> <input type="submit" value="確認申請">
	</form>
</body>
</html>