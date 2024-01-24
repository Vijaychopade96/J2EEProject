package student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginlink")
public class Validation extends HttpServlet{
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("id");
		String pass=req.getParameter("pass");
		
		Validation v1=new Validation();
		boolean status=v1.validation(name, pass);
	
		if(status) {
			RequestDispatcher rd=req.getRequestDispatcher("student.html");
			rd.include(req, resp);
		}else {
			resp.sendRedirect("index.html");
		}
		}
public boolean validation(String username, String password) {
		
		String query="select username,password from login_info";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);

			while(rs.next()) {
			if(username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
				return true;
				
			}
		} 
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
