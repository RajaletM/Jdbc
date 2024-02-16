<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>We are in jsp page</h1>
<h2>username:</h2><%out.println(request.getParameter("user")); %>
<h2>city:</h2><%out.println(request.getParameter("city")); %>
</body>
</html>