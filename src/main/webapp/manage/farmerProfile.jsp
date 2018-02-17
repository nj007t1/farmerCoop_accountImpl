<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="member" class="login.MemberDAO" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link href="../CSS/bootstrap3.3.5.css" rel="stylesheet">

<link
	href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.9/summernote.css"
	rel="stylesheet">
<title>Document</title>
</head>
<body>
	<jsp:include page="/fragment/top.jsp" />
	<h1>農名簡介</h1>

	<form action="../farmerProfileServlet.do" method="post">
		<textarea id="summernote" name="farmerProfile">
			${LoginOK.farmerProfile}
		</textarea>
		<input type='submit' value='存檔'>
	</form>
		
	<script src="../JS/jquery3.2.1.js"></script>
	<script src="../JS/bootstrap3.3.5.js"></script>
	<script src="../JS/summernote0.8.9.js"></script>
	<script src="../JS/FarmerProfile.js"></script>
</body>
</html>