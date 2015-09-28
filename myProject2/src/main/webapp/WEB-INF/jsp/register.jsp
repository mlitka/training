<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h2 align="center">Registration Form</h2>
	<form:form method="post" modelAttribute="registerUserForm" >
		<div align="center">
			<table>
				<tr>
					<td><form:label path="username">Username</form:label></td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td><form:label path="surname">Surname</form:label></td>
					<td><form:input path="surname" /></td>
				</tr>
				<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:input type="password" path="password" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</div>


	</form:form>
	<c:if test="${registrationFailed==true}">
		<h3 align="center">
			<font color="red"><strong>Registration failed.</strong></font>
		</h3>
	</c:if>

</body>
</html>
