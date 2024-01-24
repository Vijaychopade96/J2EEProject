package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/calculationlink")
public class HttpDemo7 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String no1=req.getParameter("no1");
		String no2=req.getParameter("no2");
		String add=req.getParameter("add");
		String mult=req.getParameter("mult");
		//Parse
		int num1=Integer.parseInt(no1);
		int num2=Integer.parseInt(no2);
		PrintWriter pw=resp.getWriter();
		if(add!=null && mult==null) {
		int result=num1+num2;
		pw.print("<h1 style='color:red'> Addition of Two NO is:"+result+"</h1>");	
	}else if(mult!=null && add==null) {
		int result=num1*num2;
		pw.print("<h1 style='color:red'> Multiplication of Two NO is:"+result+"</h1>");	
	}else {
		pw.print("Invalid Operation");
	}
}
}
