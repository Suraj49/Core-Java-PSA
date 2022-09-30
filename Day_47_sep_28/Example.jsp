<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<% page import=java.util.Date %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Example</title>
</head>
<body>
	<%
	//script tag

	int i=30;//1 create variable

	System.out.println(i); //print into cansole

	System.out.println("suraj");
		//implicit objects
		//1. out
		out.println(100);
		//2. request
		request.setAttribute("v", 100);
		out.println(request.getAttribute("v"));
		//3. response

%>

<%=new Date() %>
</body>
</html>