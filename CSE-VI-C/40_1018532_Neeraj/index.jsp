<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>BOOK INFORMATION</h1>
	<form action="information" method="post">
		<label>Accession Number</label>
		<input type="number" name="accno"/><br><br>
		<label>Title</label>
		<input type="text" name="title"/><br><br>
		<label>Author</label>
		<input type="text" name="author"/><br><br>
		<label>Edition</label>
		<input type="text" name="edition"/><br><br>
		<label>Publisher</label>
		<input type="text" name="publish"/><br><br>
		<input type="submit" value="submit"/>
	
	</form>

</body>
</html>