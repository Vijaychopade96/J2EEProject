package CrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		String query="insert into product_info values(1,'LAPTOP',35000.25)";
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
			
			System.out.println(count+" RECORD INSERTED SUCCESSFULLY");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
