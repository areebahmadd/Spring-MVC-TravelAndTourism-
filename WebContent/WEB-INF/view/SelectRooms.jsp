<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@include file="HomePageHeader.jsp"%>
<!DOCTYPE html>
<html lang="en">
<style><%@include file="/WEB-INF/css/guide.css"%></style>
<head>
<meta charset="ISO-8859-1">
<title>Hotel</title>

</head>
<body>
	<div class= "add-tour">
	
		<h1>Select Rooms</h1> 
		<h2 >Hotel name   ---- ${hotel.name }</h2>
		<h2 >Location     ---- ${hotel.place }</h2>
		<h2 >Price PerDay ---- ${hotel.pricePerDay }</h2>
		
		<form  action="${pageContext.request.contextPath }/calculateRoom" method="post">
			Select No. of Rooms <input type= "number" class="input-box"  name="noOfRooms" placeholder= "Select No. of Rooms" min="1" max="10" required><br>
			<button type="submit" class="sign-up-btn">Add</button>
		</form>
	</div>
</body>
</html>