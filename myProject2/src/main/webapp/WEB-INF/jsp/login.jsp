<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
</head>
<body>
	<h2 align="center">Login</h2>
	<div align="center">
		<br />

		<form action="/login" method="post">
			Username:<br> <input type="text" name="username"> <br>
			<br> Password:<br> <input type="password" name="password">
			<br> <br> <input type="submit" value="Login">
		</form>
		<br/>
		<br/>
		<c:if test="${loginFailed==true}"><h3><font color="red"><strong>Login failed.</strong></font></h3></c:if>
		<a href="/register">Register now!</a>
	</div>

</body>
</html>
