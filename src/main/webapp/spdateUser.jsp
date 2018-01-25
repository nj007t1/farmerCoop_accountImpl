<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>編輯會員資料</title>
</head>
<body>
	<form action="" method="POST">
		編輯會員<br> 
		名稱:<input name="email" type="text" size="20" value="${param.email}">
		<div style="color:red;font-size:60%">${ErrorMsg.email}</div>
		更改密碼:<input name="password" type="password" size="20" value="${param.password}">
		<div style="color:red;font-size:60%">${ErrorMsg.password}</div>
		確認密碼:<input name="againpassword" type="password" size="20" value="${param.againpassword}">
		<div style="color:red;font-size:60%">${ErrorMsg.againpasseord}</div>	
	</form>
</body>
</html>