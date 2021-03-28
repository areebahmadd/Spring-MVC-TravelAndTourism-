<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="HomePageHeader.jsp"%>

<!DOCTYPE html>
<html lang="eng">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous" />

<style><%@include file="/WEB-INF/css/HomeTourist.css"%></style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<h1 >It was our pleasure working with you  </h1>
<br><br><br>
<h2 >Tour Details</h2>
<table>
<caption>checkout</caption>
        <thead>
          <tr>
            <th scope="col">City</th>
            <th scope="col">Place</th>
            <th scope="col">Tour Name</th>
            <th scope="col">Tour Guide</th>
            <th scope="col">Tour Guide Aadhar no</th>
            <th scope="col">Tour Guide Mobile no</th>
            <th scope="col">Tourist Name</th>
            <th scope="col">Tourist Email</th>
            <th scope="col">Tourist Mobile Number</th>
            <th scope="col">Tour Price</th>
           </tr>
           
           <tr>
               <th id="">${packageT.city }  </th>
               <th id="">${packageT.place } </th>
               <th id="">${packageT.tourname }  </th>
               <th id="">${packageT.tourGuide.getName()} </th>
               <th id="">${packageT.tourGuide.getAadharno()} </th>
               <th id="">${packageT.tourGuide.getMobileno()} </th>
               <th id="">${packageT.customer.getName()} </th>
               <th id="">${packageT.customer.getEmail()} </th>
               <th id="">${packageT.customer.getMobilenumber()} </th>
               <th id="">${packageT.tourprice }  </th>

          </thead>
</table>
</body>
</html>