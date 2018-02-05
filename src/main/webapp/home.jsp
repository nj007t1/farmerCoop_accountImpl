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
<<<<<<< HEAD
	<jsp:include page="/fragment/top.jsp" />
=======
	<c:choose>
		<c:when test="${empty LoginOK}">
			<a href="login.jsp">登入</a>

		</c:when>
		<c:otherwise>	
				<a href="changePassword.jsp">修改密碼</a>
				<a href="loginOut.jsp">登出</a>
		</c:otherwise>
	</c:choose>
	
	<a href="signin.jsp">註冊</a>
>>>>>>> cf11da6e7a44030bcb4102e6778a03c2e74d6e9b
	<h1>這是首頁</h1>
	
</body>
</html>
