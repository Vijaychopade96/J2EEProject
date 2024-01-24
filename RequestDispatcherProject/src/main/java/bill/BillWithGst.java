package bill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/billcalculategst")
public class BillWithGst extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double total=(double) req.getAttribute("a");
		
		double gstAmt=total+total*0.10;
		PrintWriter pw=resp.getWriter();
		pw.print("<h1 style=color:green>The Total Amount with Gst is: "+gstAmt+" </h1>");
	}

}
