package LogIn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login1 {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Username:");
		String user=sc1.next();
		System.out.println("Enter Password:");
		String pass=sc1.next();
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="select username,password from login_info where username='"+user+"' and password='"+pass+"'";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			  if(rs.next()) {
					System.out.println("LOGIN SUCCESSFULL");
				}else {
				System.out.println("INVALID LOGIN DETAILS");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
