package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/firstcourse")
public class HttpDemo4 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//fetch the value from HTML
		String[] courses=req.getParameterValues("course");
		PrintWriter pw=resp.getWriter();
		pw.print("<h1 style='color:red'> Selected Couses Are</h1>");
		for(int a=0;a<courses.length;a++) {
		pw.print("<h2 style='color:black'>"+courses[a]+"</h2>");
	}
}
}
