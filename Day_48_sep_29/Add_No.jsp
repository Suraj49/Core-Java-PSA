<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add numbers</title>
</head>
<body>
	<h2>Enter the number....</h2>
	<form action="addController" method="post">
		number 1:<input type="number" name="num1" />
		number 2:<input type="number" name="num2" />
		<input type="submit" value="Add" />
	</form>

	<%
	if (request.getAttribute("result") != null) {
		out.println(request.getAttribute("result"));
	}
	%>

</body>
</html>