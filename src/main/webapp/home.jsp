<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Web App Demonstration</title>
</head>
<body>
<p>
<a href="https://github.com/slavomirpsota">My GitHub</a><br>
<a href="https://www.linkedin.com/in/slavom%C3%ADr-psota-5a910a150/?originalSubdomain=sk">My LinkedIn</a><br>
</p>
	<form action="addPerson">
		<label for="id">ID:</label><br>
		<input type = "text" id="id" name="hid"><br>
		<label for="name">Name:</label><br>
		<input type = "text" id = "name" name="name"><br>
		<label for="surname">Surname:</label><br>
		<input type = "text" id = "surname" name="surname"><br>
		<input type = "submit"><br>
	</form><br>
	<form action="getPerson">
		<label for="id">Fetch by ID, Name or Surname:</label><br>
		<input type = "text" id="id" name="searchParam"><br>
		<input type = "submit"><br>
	</form>
</body>
</html>