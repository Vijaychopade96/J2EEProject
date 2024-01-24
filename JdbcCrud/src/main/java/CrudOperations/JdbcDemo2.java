package CrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		String query="delete from product_info where product_name='WATCH'";
		try {
			//Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			//establish the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			
			//create statement platform
			stmt=con.createStatement();
			
			//execute sql query
			int count=stmt.executeUpdate(query);
			
			System.out.println(count+" RECORD DELETED SUCCESSFULLY");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	}