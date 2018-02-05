<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>編輯會員資料</title>
</head>
<body>
	<jsp:include page="/fragment/top.jsp" />
	<form action="" method="POST">
<<<<<<< HEAD:src/main/webapp/updateUser.jsp
		編輯會員<br> 姓:<input name="lastname" type="text" size="5"
			value="${param.lastname}">
		<div style="color: red; font-size: 60%"></div>
		名:<input name="name" type="text" size="15" value="${param.name}">
		<div style="color: red; font-size: 60%"></div>
		電子信箱:<input name="email" type="text" size="20" value="${param.email}">
		<div style="color: red; font-size: 60%">${ErrorMsg.email}</div>
=======
		編輯農民會員<br>
		姓氏:<input name="lastname" type="text" size="5" value="${param.lastname}">
		<div style="color:red;font-size:60%"></div> 
		名字:<input name="name" type="text" size="15" value="${param.name}">
		<div style="color:red;font-size:60%"></div>
		農民地址:<input name="farmerAddress" type="text" value="${param.farmerAddress}">
		
>>>>>>> cf11da6e7a44030bcb4102e6778a03c2e74d6e9b:src/main/webapp/updateFarmer.jsp
	</form>
</body>
</html>