package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/requestfirlink")
public class RequestDemo1 extends HttpServlet{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw=resp.getWriter();
	pw.print("<h1 style='color:red'>RESPONSE FROM FIRST SERVLET</h1>");
	RequestDispatcher rd= req.getRequestDispatcher("requestsecondlink");
	rd.include(req, resp);
}
}
