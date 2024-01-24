package bill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/billcalculate")
public class BillWithoughtSGst extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=req.getParameter("quantity");
		String s2=req.getParameter("price");
		
		int qty=Integer.parseInt(s1);
		double price=Double.parseDouble(s2);
		
		double total=qty*price;
		req.setAttribute("a",total);
		PrintWriter pw=resp.getWriter();
		pw.print("<h1 style=color:green>The Total Amount without Gst is: "+total+" </h1>");
		
		RequestDispatcher rd=req.getRequestDispatcher("billcalculategst");
		rd.include(req, resp);
		
	}

}