package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Validation;
//Control Layer
@WebServlet("/validationlink")
public class LoginController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("user");
	String pass=req.getParameter("pass");
	
	Validation v1=new Validation();
	boolean status=v1.validation(name, pass);
	if(status) {
		resp.sendRedirect("welcome.jsp");
	}else {
		resp.sendRedirect("index.html");
	}
}
}
