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
   double addition=(Double)request.getAttribute("a");
   double subtraction=(Double)request.getAttribute("s");
   double multiplication=(Double)request.getAttribute("m");
   double division=(Double)request.getAttribute("d");
 %>
<h1>Addition of Two No is:<%= addition%></h1>
<h1>Subtraction of Two No is:<%= subtraction %></h1>
<h1>Multiplication of Two No is:<%= multiplication %></h1>
<h1>Division of Two No is:<%= division %></h1>
</body>
</html>