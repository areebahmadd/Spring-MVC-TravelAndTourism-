<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="<c:url value="/resources/css/adminLogin.css" />"
	rel="stylesheet">
</head>
<body>
	<div class="wrapper"> 
	    <h1>${msg}</h1>
		<h1>Admin Login Page</h1>
		<form action="login">

			User Name<input type="text" name="username" required><br /> Password
			<input type="password" name="password" required><br /> ${error} <input
				type="submit" value="Login">
			<div class="bottom-text">
				<input type="checkbox" name="remember" checked="checked">
				Remember me <a href='<c:url value='/home'></c:url>' class="">Back To Home</a>
			</div>
			<p>
				Don't have an account? <a href='<c:url value='/signup'></c:url>'
					class="">Sign Up</a>
			</p>
		</form>
		<div class="socials">
			<a href="#"><em class="fa fa-facebook"></em></a> <a href="#"><em
				class="fa fa-twitter"></em></a> <a href="#"><em
				class="fa fa-envelope"></em></a> <a href="#"><em
				class="fa fa-linkedin"></em></a>
		</div>
	</div>
	<div id="overlay-area"></div>
</body>
</html>