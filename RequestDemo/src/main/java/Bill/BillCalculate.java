package Bill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/billlink")
public class BillCalculate extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String qty=req.getParameter("quatity");
	String pri=req.getParameter("price");
	
	//Parsing
	double quantity=Double.parseDouble(qty);
	double price=Double.parseDouble(pri);
	
	double total=quantity*price;
	req.setAttribute("a", total);
	
	PrintWriter pw=resp.getWriter();
	pw.print("<h1 style='color:green'>TOTAL BILL AMOUNT WITHOUT GST IS "+total+"</h1>");
	RequestDispatcher rd=req.getRequestDispatcher("gstlink");
	rd.include(req, resp);
	
}
}
