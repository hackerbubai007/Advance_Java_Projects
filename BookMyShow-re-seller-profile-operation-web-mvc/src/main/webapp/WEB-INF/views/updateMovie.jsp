<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.kodewala.bookmyshow.controller.bean.Movie" %>
<%
    Movie movie = (Movie) request.getAttribute("movie");
    Integer index = (Integer) request.getAttribute("index");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Movie</title>
</head>
<body>
    <h2>Update Movie</h2>
    
    <form action="saveUpdate/<%= index %>" method="post">
        <table>
            <tr>
                <td>Movie Name:</td>
                <td><input type="text" name="movieName" value="<%= movie.getMovieName() != null ? movie.getMovieName() : "" %>" required></td>
            </tr>
            <tr>
                <td>Genre:</td>
                <td><input type="text" name="genre" value="<%= movie.getGenre() != null ? movie.getGenre() : "" %>" required></td>
            </tr>
            <tr>
                <td>Language:</td>
                <td><input type="text" name="language" value="<%= movie.getLanguage() != null ? movie.getLanguage() : "" %>" required></td>
            </tr>
            <tr>
                <td>Duration:</td>
                <td><input type="text" name="duration" value="<%= movie.getDuration() != null ? movie.getDuration() : "" %>" required></td>
            </tr>
            <tr>
                <td>Rating:</td>
                <td><input type="text" name="rating" value="<%= movie.getRating() != null ? movie.getRating() : "" %>" required></td>
            </tr>
            <tr>
                <td>Cast:</td>
                <td><input type="text" name="cast" value="<%= movie.getCast() != null ? movie.getCast() : "" %>" required></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><textarea name="description" rows="4" cols="50"><%= movie.getDescription() != null ? movie.getDescription() : "" %></textarea></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Update Movie">
                    <input type="button" value="Cancel" onclick="window.location.href='viewMovies'">
                </td>
            </tr>
        </table>
    </form>
    
    <br>
    <%= request.getAttribute("message") != null ? request.getAttribute("message") : "" %>
</body>
</html>