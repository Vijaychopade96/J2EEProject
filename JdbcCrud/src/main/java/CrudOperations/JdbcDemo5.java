package CrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo5 {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Product Id:");
		int id=sc1.nextInt();
		System.out.println("Enter Product Price:");
		double price=sc1.nextDouble();
		
		Connection con=null;
		Statement stmt=null;
		
		String query="update product_info set product_price="+price+" where product_id="+id;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");

			//create statement platform
			stmt=con.createStatement();
		
			//execute sql query
			int count=stmt.executeUpdate(query);
			System.out.println(count+" Updated Successfully");
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
