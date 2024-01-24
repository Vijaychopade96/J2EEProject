<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
   color:violet;
   text-align: center;
}
</style>
</head>
<body>
<%
double dis=(Double)request.getAttribute("km");
String type=(String)request.getAttribute("type");
double fairAmt=(Double)request.getAttribute("fair");
%>
<h1>CAB FAIR BILL</h1>
<h1>TOTAL KM IS:<%=dis%></h1>
<h1>CAB TYPE IS:<%=type %></h1>
<h1>BILL AMOUNT IS:<%=fairAmt %></h1>
</body>
</html>