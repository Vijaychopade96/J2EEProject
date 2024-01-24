package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/firstlogin")
public class HttpDemo3 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("name");
		String password=req.getParameter("pass");
		String name="root";
		String pass="root123";
		if(username.equalsIgnoreCase(name)) {
			if(password.equalsIgnoreCase(pass)) {
				PrintWriter pw=resp.getWriter();
		        pw.print("<h1 style='color:red'>Login Successfull</h1>");	
	         }
          }else {
	            PrintWriter pw=resp.getWriter();
	            pw.print("<h1 style='color:red'>Invalid Username or Password</h1>");	
                }
	       }
          }
