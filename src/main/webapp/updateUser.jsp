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
		姓:<input name="lastname" type="text" size="5" value="${param.lastname}">
		<div style="color:red;font-size:60%"></div> 
		名:<input name="name" type="text" size="15" value="${param.name}">
		<div style="color:red;font-size:60%"></div>
		電子信箱:<input name="email" type="text" size="20" value="${param.email}">
		<div style="color:red;font-size:60%">${ErrorMsg.email}</div>
	</form>
</body>
</html>