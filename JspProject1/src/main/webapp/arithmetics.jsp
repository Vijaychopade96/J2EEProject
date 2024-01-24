<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int add=(Integer)request.getAttribute("a");
int sub=(Integer)request.getAttribute("s");
int mult=(Integer)request.getAttribute("m");
int div=(Integer)request.getAttribute("d");
%>
<h1>The Addition of Two Numbers is:<%=add %></h1><%--This is comment in jsp --%>
<h1>The Subtraction of Two Numbers is:<%=sub %></h1>
<h1>The Multiplication of Two Numbers is:<%=mult %></h1>
<h1>The Division of Two Numbers is:<%=div %></h1>
</body>
</html>