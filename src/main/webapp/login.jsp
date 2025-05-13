<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<link rel="stylesheet" href="style.css">


</head>
<body>

	<div class="login-container">
		
		<form action="login1" method="post">
		
		<h2>Login</h2>
			<div class="form-group">
				<label for="username">Username:</label> <input type="text"
					name="userName" id="username" required />
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					name="password" id="password" required />
			</div>
			<input type="submit" value="Login" />
			<a href="registration.jsp">if Not registered</a>
		</form>
	</div>

</body>
</html>
