<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${empty LoginOK}">
		<a href="${pageContext.request.contextPath}/login.jsp">登入</a>
	</c:when>
	<c:otherwise>
		<a href="${pageContext.request.contextPath}/loginOut.jsp">登出</a>
		<a href="${pageContext.request.contextPath}/manage/changePassword.jsp">修改密碼</a>
	</c:otherwise>
</c:choose>

<a href="${pageContext.request.contextPath}/signin.jsp">註冊</a>
<a href="${pageContext.request.contextPath}/manage/loginHome.jsp">需要登入才能預覽</a>