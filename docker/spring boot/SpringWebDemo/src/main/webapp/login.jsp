<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<link href='assets/css/login.css' type='text/css' rel='stylesheet'/>
</head>
<body>
	
	<div>
		<div class="wrapper fadeInDown">
			<div id="formContent">
				<div class="fadeIn first">
					<h2 class='sign'>Sign In!!</h2>
					<p>
						${error }</p>
					
				</div>
				<form action="login" method="POST">
					<input type="text" id="login" class="fadeIn second" name="email"
						placeholder="Email"
						value="kshitij@gmail.com"/> 
						<input type="password" value="kshitij"
						id="password" class="fadeIn third" name="password"
						placeholder="Password"/> <input type="submit"
						class="fadeIn fourth" value="Log In" />
				</form>
				
			</div>
		</div>
	</div>
</body>
</html>