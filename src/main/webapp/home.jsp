<%@ page import="com.example.demo.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <!-- Custom CSS -->
    <style>
        body {
            background-color: #00b3b3; /* Dark Cyan background */
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            min-height: 100vh;
        }

        .navbar {
            background-color: #ffc0cb !important; /* Light pink navbar */
        }

        .navbar .nav-link {
            color: #000 !important;
            font-weight: 500;
        }

        .navbar .nav-link:hover {
            text-decoration: underline;
            color: #333 !important;
        }

        .container {
            margin-top: 100px;
            background-color: white;
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            max-width: 600px;
        }

        h1 {
            font-size: 36px;
            color: #007bff;
        }

        p.lead {
            font-size: 20px;
            color: #333;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg">
    <a class="navbar-brand" href="#">MyApp</a>
    <div class="collapse navbar-collapse">
        <div class="navbar-nav ml-auto">
            <a class="nav-link active" href="#">Home</a>
            <a class="nav-link" href="#">Profile</a>
            <a class="nav-link" href="login.jsp">Logout</a>
        </div>
    </div>
</nav>

<!-- Main Content -->
<div class="container text-center">
   <h1>Welcome <% User user=(User)request.getAttribute("user"); %>!</h1>
   <p><%= user.getName() %></p>
    <p><%= user.getId() %></p>
     <p><%= user.getPassword() %></p>
     <p><%= user.getUserName() %></p>
     
   <p class="lead">You have successfully logged in.</p>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
