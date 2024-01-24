package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/arithmeticoperationlink")
public class JspDemo1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1=req.getParameter("1stno");
		String s2=req.getParameter("2ndno");
		
		int no1=Integer.parseInt(s1);
		int no2=Integer.parseInt(s2);
		
		int add=no1+no2;
		req.setAttribute("a", add);
		int sub=no1-no2;
		req.setAttribute("s", sub);
		int mult=no1*no2;
		req.setAttribute("m", mult);
		int div=no1/no2;
		req.setAttribute("d", div);
		
		RequestDispatcher rd=req.getRequestDispatcher("arithmetics.jsp");
		rd.include(req, resp);
	}

}
