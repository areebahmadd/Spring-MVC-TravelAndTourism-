<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@include file="HomePageHeader.jsp"%>
<!DOCTYPE html>
<html lang="eng">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"
	integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w=="
	crossorigin="anonymous" />
<head>
<meta charset="ISO-8859-1">
<title>Places</title>
<link href="<c:url value="/resources/css/displayHotel.css" />"
	rel="stylesheet">

</head>
<body>
	<br/><br/><br/><h1 >These are the Added Hotels</h1>
	<br>
	<br>
	<br>
	<table>
	<caption>hotels</caption>
		<thead>
			<tr>
				<th scope="col">Hotel Id</th>
				<th scope="col">Name</th>
				<th scope="col">Place</th>
				<th scope="col">Price Per Day</th>
			</tr>
			<c:forEach items="${hotels }" var="hotels">
				<tr>
					<th id="">${hotels.id}</th>
					<th id="">${hotels.name}</th>
					<th id="">${hotels.place}</th>
					<th id="">${hotels.pricePerDay}</th>
					<th id="">
					</th>
				</tr>
			</c:forEach>
		</thead>
	</table>
</body>
</html>