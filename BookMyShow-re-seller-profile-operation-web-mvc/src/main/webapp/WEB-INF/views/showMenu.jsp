<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Movie Dashboard</title>
</head>
<body>
    <h2>Movie Management Dashboard</h2>
    
    <h3>Total Movies: ${totalMovies}</h3>
    
    <ul>
        <li><a href="addMovie">Add New Movie</a></li>
        <li><a href="viewMovies">View All Movies</a></li>
    </ul>
    
    <br>
    ${message}
</body>
</html>