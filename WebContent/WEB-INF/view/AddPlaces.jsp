<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="HomePageHeaderAdmin.jsp"%>
<!DOCTYPE html>
<html lang="eng">
<head>
<title>Add Place</title>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/admin1.css" />"
	rel="stylesheet">
<link rel="stylesheet" href="Places.css">
</head>
<body>
	<div class="sign-up-form">
		<h1>Add Place</h1>
		<form  action="addedplace" method="post" modelAttribute="plac">
			Name<input type="text" class="input-box" placeholder="Enter Name"  name="name" required><br>
			Address<input type="text" class="input-box" placeholder="Enter Address"  name="address" required><br>
			State<input type="number" class="input-box"  name="state" placeholder= "State" required><br>
			Country<input type="number" class="input-box"  name="country" placeholder= "Country" required><br>
			<button type="submit" class="sign-up-btn">Add</button>
		</form>
	</div>
</body>
</html>