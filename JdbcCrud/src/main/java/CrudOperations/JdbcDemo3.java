package CrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo3 {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Product Id:");
	int id=sc1.nextInt();
	System.out.println("Enter Product Name:");
	String name=sc1.next();
	System.out.println("Enter Product Price:");
	double price=sc1.nextDouble();
	
	Connection con=null;
	Statement stmt=null;
	
	String query="insert into product_info values("+id+",'"+name+"',"+price+")";

	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");

		//create statement platform
		stmt=con.createStatement();
	
		//execute sql query
		int count=stmt.executeUpdate(query);
		System.out.println(count+" Product Inserted");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}if(stmt!=null){
			try {
				stmt.cancel();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
}
