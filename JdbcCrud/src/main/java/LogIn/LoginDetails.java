package LogIn;

import java.sql.*;
import java.util.Scanner;

public class LoginDetails {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Username:");
		String user=sc1.next();
		System.out.println("Enter Password:");
		String pass=sc1.next();
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="select username,password from login_info";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
	
			boolean status=false;
			while(rs.next()) {
				String dbuser=rs.getString(1);
				String dbpass=rs.getString(2);
				
				if(dbuser.equals(user) && dbpass.equals(pass)) {
					System.out.println("LOGIN SUCCESSFULL");
					status=true;
				}
			}
			if(status==false) {
				System.out.println("INVALID LOGIN DETAILS");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
