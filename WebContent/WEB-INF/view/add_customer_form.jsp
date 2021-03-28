<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

    
<!DOCTYPE html>
<html lang="eng">
<style><%@include file="/WEB-INF/css/AddCustomer.css"%></style>
<head>
<meta charset="ISO-8859-1">
<title> ${title} </title>
</head>
<body>
<div class="add-tour">
<h1>Tourist Sign-Up</h1>
<form action="CustomerSignUp" method="post">
Name<input   type="text" class="input-box"  name="name" placeholder= "Enter name" required><br>
Email<input   type="text" class="input-box"  name="email" placeholder= "Enter Email" required><br>
MobileNo<input   type="number" class="input-box"  name="mobilenumber" placeholder= "Enter Mobile No" required ><br>
UserName<input   type="text" class="input-box"  name="username" placeholder= "Enter Username" required><br>
Password<input   type="password" class="input-box"  name="password" placeholder= "Enter Password" required><br>
<input type = "submit">
</form>
<br>

</div>
</body>
</html>