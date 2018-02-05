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
		編輯農夫會員<br> 姓氏:<input name="farmerLastName" type="text" size="5"
			value="${param.farmerLastName}">
		<div style="color: red; font-size: 60%"></div>
		名字:<input name="farmerName" type="text" size="15" value="${param.farmerName}">
		<div style="color: red; font-size: 60%"></div>
		郵遞區號 
		農民地址:<input name="farmerAddress" type="text"
			value="${param.farmerAddress}"><br> 農民手機:<input
			name="farmerMobile" type="text" value="${param.farmerMobile}"><br>
		農民電話:<input name="farmerTel" type="text" value="${param.farmerTel}"><br>
		農民分機:<input name="farmerTelExt" type="text"
			value="${param.farmerTelExt}"><br> 銀行代碼:<input
			name="bankCode" type="text" value="${param.bankCode}"><br>
		銀行帳號:<input name="bankAccount" type="text"
			value="${param.bankAccount}"><br> 農民簡介:<br>
		<textarea name="introduction" rows="5" cols="20"></textarea>
		<br> <input type="submit" value="確認修改"> <input
			type="reset" value="重新輸入">


	</form>
</body>
</html>