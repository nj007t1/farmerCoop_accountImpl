<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>申請帳號成功</title>
</head>
<body>
<<<<<<< HEAD
	<jsp:include page="/fragment/top.jsp" />
	<h1>恭喜您成為會員</h1>
	<h2>電子信箱${MemberBean.email}的資料申請成功</h2>
	<br>

	<a href="home.jsp">回首頁</a>
=======
<h1>恭喜您成為會員</h1>
<h2>電子信箱${userBean.userEmail}的資料申請成功</h2><br>

<a href="home.jsp">回首頁</a>
>>>>>>> cf11da6e7a44030bcb4102e6778a03c2e74d6e9b
</body>
</html>