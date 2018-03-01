<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.*,login.ZipCodeBean,login.ZipCodeDAO"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>編輯會員資料</title>
</head>
<body>
	<jsp:include page="/fragment/top.jsp" />
	<%-- 	<jsp:useBean id="LoginOK" class="login.MemberBean" scope="session"/> --%>

	<form action="updateFarmer.do" method="POST">
		<h1>編輯農夫會員資料</h1>
		<br>
		<label>電子信箱:${LoginOK.userEmail}</label><br>
		 姓氏:<input name="farmerLastName" type="text" size="5"
			value="${LoginOK.userLastName}${param.farmerLastName}">
		<div style="color: red; font-size: 60%">${errorMsg.farmerLastName}</div>
		名字:<input name="farmerFirstName" type="text" size="15"
			value="${LoginOK.userFirstName}${param.farmerFirstName}">
		<div style="color: red; font-size: 60%">${errorMsg.farmerFirstName}</div>

		
		
		
		農民聯絡地址:<br> 
		
		
		<select size="1">
			<c:forEach var="city" items="${cities}">
				<option value="${city}">${city}</option>
			</c:forEach>
		</select> 
		
		<select name=zipCode>
			<c:forEach var="list" items="${zipList}">
				<option value="${list.zipCode}">${list.zipCode}${list.zipTownName}</option>
			</c:forEach>
		</select> 
		
		
	
		
		<input name="farmerAddress" type="text"
			value="${LoginOK.farmerAddress}${param.farmerAddress}"><br>
		<div style="color: red; font-size: 60%">${errorMsg.farmerAddress}</div>
		農民手機:<input name="farmerMobile" type="text"
			value="${LoginOK.farmerMobile}${param.farmerMobile}"><br>
		<div style="color: red; font-size: 60%">${errorMsg.farmerMobile}</div>
		農民電話:<input name="farmerTel" type="text"
			value="${LoginOK.farmerTel}${param.farmerTel}"><br>
		<div style="color: red; font-size: 60%">${errorMsg.farmerTel}</div>
		農民分機:<input name="farmerTelExt" type="text"
			value="${LoginOK.farmerTelExt}${param.farmerTelExt}"><br>
		<div style="color: red; font-size: 60%">${errorMsg.farmerTelExt}</div>

		<br> <input type="submit" value="確認修改"> <input
			type="reset" value="重新輸入">
	</form>

</body>
</html>