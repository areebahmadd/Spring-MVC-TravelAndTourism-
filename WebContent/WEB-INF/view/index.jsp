<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html  lang="en">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous" />
<link href="<c:url value="/resources/css/HomeTourist.css" />" >
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to view</h1>
<br><br><br>
<table>
<caption>tourist action</caption>
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Mobile Number</th>
            <th scope="col">Action</th>
           </tr>
           
         <c:forEach items ="${customers }" var="customer">  
           <tr>
               <th scope="row">${customer.custId}  </th>
               <th scope="row">${customer.name} </th>
               <th scope="row">${customer.email} </th>
               <th scope="row">${customer.mobilenumber} </th>
               <th scope="row"> 

					<a href = "updateCustomer/${customer.custId}" class = "fas fa-user-edit" style ="font-size: 25px;" ></a>
               		<a href = "deleteCustomer/${customer.custId}" class = "fas fa-user-slash rediconcolor" style ="font-size: 25px;" ></a>
               
               </th>
           </tr>
          </c:forEach>
          </thead>
</table>
<div class="container">
<a href="addCustomer" class ="fas fa-user-plus">Add Customer</a>
</div>
</body>
</html>