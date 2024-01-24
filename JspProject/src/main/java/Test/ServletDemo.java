package Test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/arithmeticlink")
public class ServletDemo extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num1=req.getParameter("first");
		String num2=req.getParameter("second");
		
		//Parsing
		Double no1=Double.parseDouble(num1);
		Double no2=Double.parseDouble(num2);
		
		//Arithmetic Operations
		double add=no1+no2;
		req.setAttribute("a", add);
		double sub=no1-no2;
		req.setAttribute("s", sub);
		double mul=no1*no2;
		req.setAttribute("m", mul);
		double div=no1/no2;
		req.setAttribute("d", div);
		
		RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
		rd.forward(req, resp);
		
	}

}
