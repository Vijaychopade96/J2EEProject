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
   text-align:center;
}
</style>
</head>
<body>
<%
  double totalKm=(Double)request.getAttribute("km");
  String cabType=(String)request.getAttribute("type");
  double fairAmt=(Double)request.getAttribute("fair");
%>
<h1>CAB FAIR BILL</h1>
<h1>TOTAL KM IS:<%=totalKm %></h1>
<h1>CABTYPE IS:<%=cabType %></h1>
<h1>FAIR AMOUNT IS:<%=fairAmt %></h1>
</body>
</html>