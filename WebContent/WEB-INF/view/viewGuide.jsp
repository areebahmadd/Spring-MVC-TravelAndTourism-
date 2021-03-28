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
<h1>We are pleased to introduce our guide  </h1>
<br><br><br>
<table>
<caption>existing guides</caption>
        <thead>
          <tr>
            <th scope="col" >Name</th>
            <th scope="col">Aadhar Card Number</th>
            <th scope="col">Email</th>
            <th scope="col" >Mobile Number</th>
            <th scope="col" >Gives Tour Of</th>
           </tr>
           
         <c:forEach items ="${tourGuides }" var="tourGuide">
           <tr>
               <th scope="row">${tourGuide.name}</th>
               <th scope="row">${tourGuide.aadharno} </th>
               <th scope="row">${tourGuide.emailid} </th>
               <th scope="row">${tourGuide.mobileno} </th>
               <th scope="row">${tourGuide.place} </th>
           </tr>
        <</c:forEach>
          </thead>
</table>
</body>
</html>