package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LoginValidation;
@WebServlet("/loginvalidationlink1")
public class LoginControllerDemo1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("user");
		String pass=req.getParameter("pass");
		
		LoginValidation l1=new LoginValidation();
		boolean status=l1.validation(user,pass);
		
		if(status) {
			resp.sendRedirect("welcome1.jsp");
		}else{
			resp.sendRedirect("welcome2.jsp");
		}
		
	}

}
