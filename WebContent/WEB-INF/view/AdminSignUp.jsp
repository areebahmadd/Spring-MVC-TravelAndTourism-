<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<link rel="stylesheet" href="admin1.css">
<link href="<c:url value="/resources/css/admin1.css" />"
	rel="stylesheet">
</head>
<body>
	<div class="sign-up-form">
		<h1>SignUp</h1>
		<form:form method="POST" action="validate" modelAttribute="mode">
			<br />
			<br />
			Name <form:input path="name" />
			<form:errors path="name" />
			<br />
			<br />
			Mobile No <form:input path="mobileNo" />
			<form:errors path="mobileNo" />
			<br />
			<br />
			Email Id  <form:input path="email" />
			<form:errors path="email" />
			<br />
			<br />
			User Name  <form:input path="username" />
			<form:errors path="username" />
			<br />
			<br />
			Password  <form:input path="password" />
			<form:errors path="password" />
			<br />
			<br />
			<button type="submit" class="sign-up-btn">Sign Up</button>
			<hr>
		</form:form>
	</div>

</body>
</html>