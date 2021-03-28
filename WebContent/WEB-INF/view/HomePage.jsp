<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
</head>
<body>
	<header>
		<div class="menu-bar">
			<h1>Welcome to Team 7 Travel and Tourism</h1>
			<ul>
				<li class="active"><a href='<c:url value='/home'></c:url>'
					class="">Home</a><em class="fa fa-home"></em></li>
				<li class="active"><a href="#">Login/Sign Up</a><em class="fa fa-sign-in"></em>
					<div class="sub-menu">
						<ul>
							<li><a href='<c:url value='/adminlogin'></c:url>' class="">Admin
									Login</a>
							<li><a href='<c:url value='/loginCustomer'></c:url>' class="">Tourist
									Login</a>		
						</ul>
					</div></li>
			</ul>
		</div>
	</header>
</body>
</html>