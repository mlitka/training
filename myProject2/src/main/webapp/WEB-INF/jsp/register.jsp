<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<script src="/resources/jquery/js/jquery-2.1.4.min.js"></script>
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<strong><h2 align="center" class="form-signin-heading">Sign Up</h2></strong>
	
	<form:form method="post" modelAttribute="registerUserForm" >
		<div align="center" class="container">
		
		<label for="inputUsername" class="sr-only">Username</label>
		<input type="text" id="inputUsername" name="username" class="form-control" placeholder="Username" required="" autofocus="">
		<label for="inputName" class="sr-only">Name</label>
		<input type="text" id="inputName" name="name" class="form-control" placeholder="First name" required="" autofocus="">
		<label for="inputSurname" class="sr-only">Surame</label>
		<input type="text" id="inputSurname" name="surname" class="form-control" placeholder="Last name" required="" autofocus="">
		<label for="inputPassword" class="sr-only">Password</label>
		<input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required="" autofocus="">
		
		<c:if test="${registrationFailed==true}">
		<h4 align="center"><font size="4" color="#884CAA"><strong>Registration failed!</strong></font><br><font size="2" color="#884CAA">Try again.</font></h4>
		<br>
	</c:if>
		<button class="btn btn-lg btn-primary btn-block" type="submit" value="Register">Sign Up</button>
			<!--  table>
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
			</table -->
		</div>
		<div class="container">

      

    </div>


	</form:form>
	

</body>
</html>
