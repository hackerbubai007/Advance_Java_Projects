<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Movie</title>
</head>
<body>
    <h2>Add New Movie</h2>
    
    <form action="saveMovie" method="post">
        <table>
            <tr>
                <td>Movie Name:</td>
                <td><input type="text" name="movieName" required></td>
            </tr>
            <tr>
                <td>Genre:</td>
                <td><input type="text" name="genre" required></td>
            </tr>
            <tr>
                <td>Language:</td>
                <td><input type="text" name="language" required></td>
            </tr>
            <tr>
                <td>Duration:</td>
                <td><input type="text" name="duration" placeholder="e.g., 2h 30m" required></td>
            </tr>
            <tr>
                <td>Rating:</td>
                <td><input type="text" name="rating" placeholder="e.g., 8.5/10" required></td>
            </tr>
            <tr>
                <td>Cast:</td>
                <td><input type="text" name="cast" required></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><textarea name="description" rows="4" cols="50"></textarea></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Save Movie">
                    <input type="button" value="Cancel" onclick="window.location.href='showMenu'">
                </td>
            </tr>
        </table>
    </form>
    
    <br>
    ${message}
</body>
</html>