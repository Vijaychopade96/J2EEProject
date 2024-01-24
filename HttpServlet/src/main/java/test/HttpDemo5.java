package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/registrationlink")
public class HttpDemo5 extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw=resp.getWriter();
	String firstname=req.getParameter("fname");
   	String lastname=req.getParameter("lname");
    String contact=req.getParameter("contact");
    long con=Integer.parseInt(contact);
    String gen=req.getParameter("gender");
    String branch=req.getParameter("branch");
    pw.print("<h1> REGISTRATION PAGE</h1>");
	
    pw.print("<table border='1'>");
    pw.print("<tr>");
    pw.print("<th>First Name</th><th>Last Name</th><th>Contact</th><th>Gender</th><th>Branch</th>");
    pw.print("</tr>");
    pw.print("<tr>");
    pw.print("<td>"+firstname+"</td><td>"+lastname+"</td><td>"+con+"</td><td>"+gen+"</td><td>"+branch+"</td>");
    pw.print("</tr>");
    pw.print("</table>");
	

}
}
