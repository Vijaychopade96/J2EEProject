package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/employeelink")
public class HttpDemo6 extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String ename=req.getParameter("ename");
	String salary=req.getParameter("salary");
	double sal=Double.parseDouble(salary);
	PrintWriter pw=resp.getWriter();
	String designation=req.getParameter("designation");
	if(designation.equals("HR")) {
		double total=sal+sal*0.20;
		pw.print("<h1> Salary for HR is:"+sal+"</h1>");
		pw.print("<h2> Incremented Salary for HR is:"+total+"</h2>");
	}else if(designation.equals("MANAGER")) {
		double total=sal+sal*0.30;
		pw.print("<h1> Salary for MANAGER is:"+sal+"</h1>");
		pw.print("<h2> Incremented Salary for MANAGER is:"+total+"</h2>");
	}else {
		pw.print("Invalid Designation");
	}
}
}
