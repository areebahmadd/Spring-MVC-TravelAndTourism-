<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@include file="HomePageHeaderAdmin.jsp"%>
<!DOCTYPE html>
<html lang="en">
<style><%@include file="/WEB-INF/css/guide.css"%></style>
<head>
<meta charset="ISO-8859-1">
<title>Guide</title>

</head>
<body>
	<div class="add-tour">
		<h1>Add Guide</h1> 
		<form  action="saveGuide" method="post">
			Name<input type="text" class="input-box" placeholder="Enter Name"  name="name" required><br>
			Mobile No<input type="number" class="input-box"  name="mobileno" placeholder= "Enter mobile number" min="0" required><br>
			Email-ID<input type="text" class="input-box" placeholder="Enter Email Id"  name="emailid" required><br>
			Place<input type="text" class="input-box" placeholder="Enter Place"  name="place" required><br>
			Aadhaar<input type="number" class="input-box" placeholder="Enter Aadhar No"  name="aadharno" min="1000" required><br>
			<button type="submit" class="sign-up-btn">Add</button>
		</form>
	</div>
</body>
</html>