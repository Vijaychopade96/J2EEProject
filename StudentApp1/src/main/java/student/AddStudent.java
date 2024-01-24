package student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addstudentlink")
public class AddStudent extends HttpServlet{
Connection con=null;
  @Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root","Shafik123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String id=req.getParameter("studentid");
	 String name=req.getParameter("studentname");
	 String stream=req.getParameter("studentstream");
	 
	 //Parsing
	 int sid=Integer.parseInt(id);
	 
	 PreparedStatement pstmt=null;
	 String query="insert into student_app values(?,?,?)";
	 
	 try {
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, sid);
		pstmt.setString(2, name);
		pstmt.setString(3,stream);
		
		int count=pstmt.executeUpdate();
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>"+count+" RECORD INSERTED SUCCESSFULLY</h1>");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	}
}
