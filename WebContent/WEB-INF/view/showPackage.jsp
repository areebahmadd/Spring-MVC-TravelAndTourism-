<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="HomePageHeader.jsp"%>

<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous" />

<style><%@include file="/WEB-INF/css/HomeTourist.css"%></style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br><br>
<h1 >These are the existing packages  </h1>

<br><br><br>
<table>
<caption>existing packages</caption>
        <thead>
          <tr>
            <th scope="col">City</th>
            <th scope="col" >Place</th>
            <th scope="col">Tour Name</th>
            <th scope="col">Price</th>
            <th scope="col">Tour Guide Details</th>
            <th scope="col">Enroll Me for this package</th>
           </tr>
           
          
         <c:forEach items ="${tourPackages }" var="tourPackage">  
           <tr>
               <th scope="row">${tourPackage.city}  </th>
               <th scope="row">${tourPackage.place} </th>
               <th scope="row">${tourPackage.tourname} </th>
               <th scope="row">${tourPackage.tourprice} </th>
               <th scope="row"><a href = "guideDetail/${tourPackage.tourGuide.getTgid()}" class='fas fa-plus-square'>${tourPackage.tourGuide.getName()} </a></th>
           
				<th scope="row"><a href = "${pageContext.request.contextPath }/enrollCustomer/${tourPackage.packageId }" class = "fas fa-user-edit" style ="font-size: 20px;" ></a> </th>
               		
              
           </tr>
          </c:forEach>
          </thead>
</table>
</body>
</html>