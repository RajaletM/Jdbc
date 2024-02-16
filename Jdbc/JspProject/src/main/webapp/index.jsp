<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome JSp project</h1>
<h2>we can write java code in jsp</h2>
<%
int a =10;
int b =20;
System.out.println("sum is :"  +(a+b));//this line will print the output in the console becouse browser don't understand this syatem.out.println
out.println("we are in scriptlet ..sum " + (a+b));//will print the output in the browser.
%>
</body>
</html>