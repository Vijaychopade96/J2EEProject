package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addpractice")
public class HttpAddition extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String f1=req.getParameter("first");
		String f2=req.getParameter("second");
		
		int no1=Integer.parseInt(f1);
		int no2=Integer.parseInt(f2);
		int add=no1+no2;
		PrintWriter pw=resp.getWriter();
		pw.print("<h1 style=color:red>Addition is:"+add+"</h1>");
	}

}
