<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@include file="HomePageHeaderAdmin.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="eng">
<style><%@include file="/WEB-INF/css/AddTour.css"%></style>
<head>
<link rel="stylesheet" href="AddTour.css">
<title>Insert title here</title>
</head>
<body>
<div class="add-tour">
		<h1>Add Tour Package</h1>
		<form action="saveTour" method="post" >
			City<input type="text" class="input-box" name="city" placeholder="Enter City"  required><br>
			Place<input type="text" class="input-box" name="place" placeholder="Enter Place"   required><br>
			Tour Name<input type="text" class="input-box"  name="tourname" placeholder="Enter Tour name"  required><br>
			Tour Price<input   type="number" class="input-box"  name="tourprice" placeholder= "Enter Tour Price" min="1000" required><br>
			<button type="submit" class="add-tour-btn">Add Tour To Database</button>
		</form>

</div>
</body>
</html>