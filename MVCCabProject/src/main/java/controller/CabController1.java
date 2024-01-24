package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CabModel;
@WebServlet("/cablink1")
public class CabController1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1=req.getParameter("distance");
		String type=req.getParameter("type");
		
		double distance=Double.parseDouble(s1);
		
		CabModel m1=new CabModel();
		double fairAmt=m1.calculateBill(distance, type);
		
		req.setAttribute("km", distance);
		req.setAttribute("type", type);
		req.setAttribute("fair", fairAmt);
		
		RequestDispatcher rd=req.getRequestDispatcher("bill1.jsp");
		rd.include(req, resp);
		
		
	}

}
