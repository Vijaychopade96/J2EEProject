<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table{
   background-color:rgb(69 246 168);
}
</style>
</head>
<body>

 <% 
 String start=request.getParameter("spoint");
 String end=request.getParameter("epoint");
 //Parsing
 int s=Integer.parseInt(start);
 int e=Integer.parseInt(end);
 ArrayList<Integer> even=new ArrayList<>();
 ArrayList<Integer> odd=new ArrayList<>();
 for(int a=s;a<=e;a++){
	 if(a%2==0){
	 	even.add(a);
	 }else{
		 odd.add(a);
	 }
 }
 %>
 <h2 style='color:rgb(171 143 243)'>Even and Odd Numbers</h2>
 <table border='2'  style=float:left>
 <tr>
 <th>EVEN NO</th>
 </tr>
 <%
 Iterator<Integer> itr=even.iterator();
 while(itr.hasNext()){
 %>
 <tr><td><%=itr.next()%></td>
 </tr>
 <%
 }
 %>
 </table>
 
 <table border='2' style=margin-left:200px>
 <tr>
 <th>ODD NO</th>
 </tr>
 <%
 Iterator<Integer> itr1=odd.iterator();
 while(itr1.hasNext()){
 %>
 <tr><td><%=itr1.next()%></td>
 </tr>
 <%
 }
 %>
</body>
</html>