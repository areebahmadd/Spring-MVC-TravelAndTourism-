<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@include file="HomePageHeaderAdmin.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home Page Admin</title>
<link href="<c:url value="/resources/css/NewHome.css" />"
	rel="stylesheet">
</head>
<body>
	<br/><br/><br/><br/>
	<h1 >Welcome Admin</h1><br/>
	<form action="addhotel">
		<button class="input-box" type="submit">
			<a href='<c:url value='/addhotel'></c:url>' class="">Add Hotel</a>
		</button>
	</form>

	<form action="addGuide">
		<button class="input-box" type="submit">
			<a href='<c:url value='/addGuide'></c:url>' class="">Add Guide</a>
		</button>
	</form>
	
	<form action="newTour">
		<button class="input-box" type="submit">
			<a href='<c:url value='/newTour'></c:url>' class="">Add Tour Package</a>
		</button>
	</form>
	
	<form method="get" action="displayHotels">
		<button class="input-box" type="submit">View Hotels</button>
	</form>
	
	<form method="get" action="displayGuides">
		<button class="input-box" type="submit">View Guides</button>
	</form>
	
	<form method="get" action="TourPackageAdmin">
		<button class="input-box" type="submit">View Tour Package</button>
	</form>
</body>
</html>