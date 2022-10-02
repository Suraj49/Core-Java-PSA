<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h3 style="color: red">Login Hare</h3>
	<form action="verifylogin" method="post">
		<table>
			<tr>
				<td>Name :<input type="text" name="email" /></td>
				<td>Password :<input type="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="Login" />
	</form>
	<%
	if(request.getAttribute("error")!=null){
		out.println(request.getAttribute("error"));
	}
	%>
</body>
</html>