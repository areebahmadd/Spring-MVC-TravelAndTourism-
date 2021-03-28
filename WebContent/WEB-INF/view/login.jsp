
<!DOCTYPE html>
<html lang="en">
<style><%@include file="/WEB-INF/css/signup-style.css"%></style>
<head>

<title>Login</title>
</head>
<body>

<div id='container'>
  <div class='signup'>
  <form action="loginAction" method="post">
    <input type="text" name="username" placeholder="Enter Username" required>
    <input type="password" name="password" placeholder="Enter Password" required>
     <input type="submit" value="login">
    </form>
       <h2><a href="addCustomer">Sign-Up</a></h2>
       <h2><a href="home">Back To Home Page</a></h2>
  </div>
 
  <div class='whysignLogin'>
  <h1>Tourist Login</h1>
  <h3>                     	${msg }</h3>  
</div>
 </div>
</body>
</html>