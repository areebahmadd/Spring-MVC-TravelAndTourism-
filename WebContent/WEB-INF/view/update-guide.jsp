<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@include file="HomePageHeaderAdmin.jsp"%>
<!DOCTYPE html>
<html  lang="en">
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/signup.css" /> --%>
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
	<br/>
	<br/>
	<br/>
	<br/><br/><h1 >Update Guide --- ${guide.name }</h1>
	<h3 >Guide id : ${guide.tgid }</h3>
	<div class="add-tour">
		<form action="${pageContext.request.contextPath }/updatedGuide"
			method="post">
			<input type="hidden" name="tgid" value="${guide.tgid }"><br>
			    Name<input type="text" class="input-box" name="name"
				value="${guide.name }" required><br> 
				Mobile No<input
				type="text" class="input-box" name="mobileno"
				value="${guide.mobileno }" required><br> 
				Email<input
				type="text" class="input-box" name="emailid"
				value="${guide.emailid }" required><br>
			    Place<input type="text" class="input-box" name="place"
				value="${guide.place }" required><br>
				Aadhar No<input type="text" class="input-box" name="aadharno"
				value="${guide.aadharno }" required><br>
			<button type="submit" class="fas fa-check-circle">Update</button>
		</form>
		<br>
	</div>
</body>
</html>