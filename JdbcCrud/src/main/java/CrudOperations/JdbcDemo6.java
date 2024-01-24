package CrudOperations;

import java.sql.*;

public class JdbcDemo6 {
	public static void main(String[] args) {
		
  Connection con=null;
  Statement stmt=null;
  
  String query="insert into product_info values(1,'AC',30000.10)";
  try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver Loaded");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","Shafik123");
	stmt=con.createStatement();
	int count=stmt.executeUpdate(query);
	System.out.println(count+"Product Successfully Inserted");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
}
}
