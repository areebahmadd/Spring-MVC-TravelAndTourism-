<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@include file="HomePageHeaderAdmin.jsp"%>
<!DOCTYPE html>
<html  lang="en">

<style>
<
link
href
="<c
:url
 
value
="/resources/css/updateCustiomer
.css
"
/
>
"
rel
="stylesheet"
>
</style>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
</head>
<body>
	<br>
	<br>
	<br>
	<h1 >Update Hotel --- ${hotel.name }</h1>
	<h3>Hotel id : ${hotel.id }</h3>
	<div class="add-tour">
		<form action="${pageContext.request.contextPath }/updatedHotel"
			method="post">
			<input type="hidden" name="id" value="${hotel.id }"><br>
			    Name<input type="text" class="input-box" name="name"
				value="${hotel.name }" required><br> 
				Place<input
				type="text" class="input-box" name="place"
				value="${hotel.place }" required><br>
			    UserName<input type="text" class="input-box" name="pricePerDay"
				value="${hotel.pricePerDay }" required><br>
			<button type="submit" class="fas fa-check-circle">Update</button>
		</form>
		<br>
	</div>
</body>
</html>