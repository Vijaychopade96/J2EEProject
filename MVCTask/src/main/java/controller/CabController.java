package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Simple;
@WebServlet("/cablink")
public class CabController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String km=req.getParameter("km");
		String type=req.getParameter("type");
		
		//Parsing
		double kmeter=Double.parseDouble(km);
		
		Simple s1=new Simple();
		double fairAmt=s1.billCalculate(kmeter,type);
		
		req.setAttribute("km", kmeter);
		req.setAttribute("type", type);
		req.setAttribute("fair", fairAmt);
		
		RequestDispatcher rd=req.getRequestDispatcher("bill.jsp");
		rd.forward(req, resp);
		
	}

}
