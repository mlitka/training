<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src="/resources/jquery/js/jquery-2.1.4.min.js"></script>
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<!--<h2 align="center">Login</h2>
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
	</div>-->
	<div class="container">

      <form class="form-signin" action="/login" method="post">
        <h2 class="form-signin-heading">Please log in</h2>
        <label for="inputUsername" class="sr-only">Username</label>
        <input type="text" id="inputUsername" name="username" class="form-control" placeholder="Username" required="" autofocus="">
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required="">
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
        <c:if test="${loginFailed==true}"><h3><font color="red"><strong>Login failed.</strong></font></h3></c:if>
       
        <a href="/register"> <button class="btn btn-lg btn-primary btn-block" type="button" formaction="/register">Register now!</button></a>
      </form>

    </div>

</body>
</html>
