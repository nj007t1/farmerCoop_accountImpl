<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消費者會員修改</title>
</head>
<body>
<form action="" method="post"></form>
		編輯消費者會員<br>
		姓氏:<input name="userLastName" type="text" size="5" value="${param.userLastName}">
		<div style="color:red;font-size:60%"></div> 
		名字:<input name="userName" type="text" size="15" value="${param.userName}">
		<div style="color:red;font-size:60%"></div>
		郵遞區號
		地址:<input name="userAddress" type="text" value="${param.userAddress}"><br>
		手機:<input name="userMobile" type="text" value="${param.userMobile}"><br>
		電話:<input name="userTel" type="text" value="${param.userTel}"><br>
		分機:<input name="userTelExt" type="text" value="${param.userTelExt}"><br>
		
		<input type="submit" value="確認修改">
	    <input type="reset" value="重新輸入">
		
</body>
</html>