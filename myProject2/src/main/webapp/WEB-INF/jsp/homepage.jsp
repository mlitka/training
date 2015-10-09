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
	<!-- <a  href="/logout"><button class="btn btn-lg btn-primary btn-block"
			type="button" formaction="/logout" >
			<font  size="3">Log out</font>
		</button></a> -->
	<h3 align="right" ><a  href="/logout"><font size="3" color="#0EA9D8">Log out	</font></a></h3>
	<h2 align="center" class="form-signin-heading">
		<strong>Pozdrowienia od ${username}</strong>
	</h2>


</body>
</html>