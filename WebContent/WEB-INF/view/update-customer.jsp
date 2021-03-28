<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="HomePageHeader.jsp"%>
    
<!DOCTYPE html>
<html lang="en">
<style><%@include file="/WEB-INF/css/updateCustiomer.css"%></style>
<head>
<meta charset="ISO-8859-1">
<title> ${title} </title>
</head>
<body>
<br><br><br><br>
<h1 >Update Customer --- ${customer.name }</h1>
<h3 >Customer id : ${customer.custId }</h3>
<div class="add-tour">
<form action="${pageContext.request.contextPath }/CustomerSignUp" method="post">
<input type= "hidden"   name="custId" value = "${customer.custId }"><br>
Name<input   type="text" class="input-box"  name="name" value = "${customer.name }" required><br>
Email<input  type="text" class="input-box"  name="email" value = "${customer.email }" required><br>
MobileNo<input type="number" class="input-box"  name="mobilenumber" value = "${customer.mobilenumber }" min="100000" required><br>
UserName<input  type="text" class="input-box"  name="username" value = "${customer.username }" required><br>
<button type = "submit" class="fas fa-check-circle">Update</button>
</form>
<br>
</div>
</body>
</html>