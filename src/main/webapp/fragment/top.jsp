<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${empty LoginOK}">
		<a href="login.jsp">登入</a>
	</c:when>
	<c:otherwise>
		<a href="loginOut.jsp">登出</a>
	</c:otherwise>
</c:choose>

<a href="signin.jsp">註冊</a>
<a href="<c:url value='manage/loginHome.jsp' />">需要登入才能預覽</a>