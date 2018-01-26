<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<c:choose>
		<c:when test="${empty LoginOK}">
			<a href="login.jsp">登入</a>
		</c:when>
		<c:otherwise>
			<div class=''>
				<a href="home.jsp"><c:remove var="LoginOK" />登出</a>
			</div>
		</c:otherwise>
	</c:choose>
	
	<a href="signin.jsp">註冊</a>
	<h1>這是首頁</h1>
	<a href="manage/loginHome.jsp">需要登入才能預覽</a>
</body>
</html>
