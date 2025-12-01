<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List, com.kodewala.bookmyshow.controller.bean.Movie"%>
<!DOCTYPE html>
<html>
<head>
<title>All Movies</title>
</head>
<body>
	<h2>All Movies</h2>

	<a href="showMenu">Back to Dashboard</a> |
	<a href="addMovie">Add New Movie</a>

	<br>
	<br>

	<%
	String message = (String) request.getAttribute("message");
	String error = (String) request.getAttribute("error");
	List<Movie> movies = (List<Movie>) request.getAttribute("movies");

	if (message != null) {
	%>
	<p><%=message%></p>
	<%
	}

	if (error != null) {
	%>
	<p><%=error%></p>
	<%
	}

	if (movies == null || movies.isEmpty()) {
	%>
	<p>No movies available. Please add some movies.</p>
	<%
	} else {
	%>
	<table border="1" cellpadding="5" cellspacing="0">
		<tr>
			<th>Movie Name</th>
			<th>Genre</th>
			<th>Language</th>
			<th>Duration</th>
			<th>Rating</th>
			<th>Cast</th>
			<th>Description</th>
			<th>Actions</th>
		</tr>
		<%
		for (int i = 0; i < movies.size(); i++) {
			Movie movie = movies.get(i);
		%>
		<tr>
			<td><%=movie.getMovieName() != null ? movie.getMovieName() : ""%></td>
			<td><%=movie.getGenre() != null ? movie.getGenre() : ""%></td>
			<td><%=movie.getLanguage() != null ? movie.getLanguage() : ""%></td>
			<td><%=movie.getDuration() != null ? movie.getDuration() : ""%></td>
			<td><%=movie.getRating() != null ? movie.getRating() : ""%></td>
			<td><%=movie.getCast() != null ? movie.getCast() : ""%></td>
			<td><%=movie.getDescription() != null ? movie.getDescription() : ""%></td>
			<td><a href="updateMovie/<%=i%>">Update</a> | <a
				href="deleteMovie/<%=i%>"
				onclick="return confirm('Are you sure you want to delete this movie?')">Delete</a>
			</td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	}
	%>
</body>
</html>