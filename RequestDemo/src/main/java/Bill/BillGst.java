package Bill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/gstlink")
public class BillGst extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	String qty=req.getParameter("quatity");
//	String price=req.getParameter("price");
//	
//	double qty1=Double.parseDouble(qty);
//	double price1=Double.parseDouble(price);
	
	double total=(Double)req.getAttribute("a");
	
	double gsttotal=total+total*0.05;
	
	PrintWriter pw=resp.getWriter();
	pw.print("<h1 style='color:green'>TOTAL BILL AMOUNT WITH GST IS "+gsttotal+"</h1>");
}
}
