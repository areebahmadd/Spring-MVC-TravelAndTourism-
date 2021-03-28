<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@include file="HomePageHeaderAdmin.jsp"%>
<!DOCTYPE html>
<html lang="eng">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"
	integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w=="
	crossorigin="anonymous" />
<head>
<title>Guides</title>
<meta charset="ISO-8859-1">
<title>Places</title>
<link href="<c:url value="/resources/css/display.css" />"
	rel="stylesheet">
</head>
<body>
	<h1>These are the Added Guides</h1>
	<br>
	<br>
	<br>
	<table>
	<caption>added guides</caption>
		<thead>
			<tr>
				<th scope="col">Guide Id</th>
				<th scope="col">Name</th>
				<th scope="col">Mobile No</th>
				<th scope="col">Email</th>
				<th scope="col">Place</th>
				<th scope="col">Aadhar No</th>
			</tr>

			<c:forEach items="${guides }" var="guides">
				<tr>
					<th id="">${guides.tgid}</th>
					<th id="">${guides.name}</th>
					<th id="">${guides.mobileno}</th>
					<th id="">${guides.emailid}</th>
					<th id="">${guides.place}</th>
					<th id="">${guides.aadharno}</th>
					<th id="">
					<a href = "${pageContext.request.contextPath }/updateGuide/${guides.tgid}" class = "fas fa-user-edit" style ="font-size: 25px;" ></a>
               		<a href = "${pageContext.request.contextPath }/deleteGuide/${guides.tgid}" class = "fas fa-user-slash rediconcolor" style ="font-size: 25px;" ></a>
					</th>
				</tr>
			</c:forEach>
		</thead>
	</table>
</body>
</html>