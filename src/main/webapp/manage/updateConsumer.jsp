<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消費者會員修改</title>
</head>
<body>
	<jsp:include page="/fragment/top.jsp" />
	<form action="../updateConsumer.do" method="post">
		<h1>編輯消費者會員</h1><br>
		<label>電子信箱:${LoginOK.userEmail}</label><br>
		 姓氏:<input name="userLastName" type="text" size="5" 
		 value="${LoginOK.userLastName}${param.userLastName}">
		<div style="color: red; font-size: 60%">${errorMsg.userLastName}</div>
		名字:<input name="userFirstName" type="text" size="15" 
		value="${LoginOK.userFirstName}${param.userFirstName}">
		<div style="color: red; font-size: 60%">${errorMsg.userFirstName}</div>
		聯絡地址:<br> 
		
			<select>
		
			<c:forEach var="list" items="${zipList}">
				<option value="${list.zipCountyName}">${list.zipCountyName}</option>
			</c:forEach>

		</select>
		
		<select name=zipCode size="1">
			<c:forEach var="list" items="${zipList}">
				<option value="${list.zipCode}">${list.zipCode}${list.zipTownName}</option>
			</c:forEach>
		</select> 
		<input name="userAddress" type="text" value="${LoginOK.userAddress}${param.userAddress}"><br>
		<div style="color:red;font-size: 60%">${errorMsg.userAddress}</div>
		手機:<input name="userMobile" type="text" 
		value="${LoginOK.userMobile}${param.userMobile}"><br>
		<div style="color:red;font-size: 60%">${errorMsg.userMobile}</div>
		電話:<input name="userTel" type="text" 
		value="${LoginOK.userTel}${param.userTel}"><br>
		<div style="color:red;font-size: 60%">${errorMsg.userTel}</div>
		分機:<input name="userTelExt" type="text" value="${LoginOK.userTelExt}${param.userTelExt}"><br>

		<input type="submit" value="確認修改"> <input type="reset"
			value="重新輸入">
	</form>
	<script>
		var test1 = '${LoginOK.userTel}';
		var test2 = '${LoginOK.userTelExt}';
	</script>
</body>
</html>