<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<head>
<title>Home</title>
<style><%@include file="/resources/css/HomeAreeb.css"%></style>
</head>
<body>
<br>
	<div class="main">
		<ul>
			<li ><a href="${pageContext.request.contextPath }/adminhome">Home</a></li>
			<li><a href="${pageContext.request.contextPath }/addhotel">Add Hotel</a></li>
			<li><a href="${pageContext.request.contextPath }/newTour">Add Tour Package</a></li>
			<li><a href="${pageContext.request.contextPath }/addGuide">Add Guide</a></li>
			<li><a href="${pageContext.request.contextPath }/displayHotels">View Hotels</a></li>
			<li><a href="${pageContext.request.contextPath }/displayGuides">View Guides</a></li>
			<li><a href="${pageContext.request.contextPath }/TourPackageAdmin">View Tour Packages</a></li>
			<li><a href="${pageContext.request.contextPath }/logout">Logout</a></li>
		</ul>
	</div>

</body>
</html>