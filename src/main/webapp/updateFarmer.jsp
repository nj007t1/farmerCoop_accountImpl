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
		編輯農民會員<br>
		姓氏:<input name="lastname" type="text" size="5" value="${param.lastname}">
		<div style="color:red;font-size:60%"></div> 
		名字:<input name="name" type="text" size="15" value="${param.name}">
		<div style="color:red;font-size:60%"></div>
		農民地址:<input name="farmerAddress" type="text" value="${param.farmerAddress}">
		
	</form>
</body>
</html>