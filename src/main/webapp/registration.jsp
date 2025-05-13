<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <form action="regis" method="post">
        <h2>Sign up here!!!</h2>
        
        <label>Id:</label>
        <input type="text" name="id" required>
        
        <label>Name:</label>
        <input type="text" name="name" required>
        
        <label>User Name:</label>
        <input type="text" name="username" required>

        <label>Password:</label>
        <input type="password" name="password" required>

        <input type="submit" value="Register">
        <a href="login.jsp">if Already registered</a>
        
    </form>
</body>
</html>
