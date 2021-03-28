<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="HomePageHeader.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@include file="HomePageHeaderAdmin.jsp"%>
<!DOCTYPE html>
<html lang="en">
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
	<h1>Update Place --- ${place.name }</h1>
	<h3>Place id : ${place.id }</h3>
	<div class="add-tour">
		<form action="${pageContext.request.contextPath }/updatedPlace"
			method="post">
			<input type="hidden" name="id" value="${place.id }"><br>
			    Name<input type="text" class="input-box" name="name"
				value="${place.name }" required><br> 
				Address<input
				type="text" class="input-box" name="address"
				value="${place.address }" required><br> 
				State<input
				type="text" class="input-box" name="state"
				value="${place.state }" required><br>
			    Country<input type="text" class="input-box" name="country"
				value="${place.country }" required><br>
			<button type="submit" class="fas fa-check-circle">Update</button>
		</form>
		<br>
	</div>
</body>
</html>