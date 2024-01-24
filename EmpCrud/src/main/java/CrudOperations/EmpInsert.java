package CrudOperations;

import java.sql.*;
import java.util.Scanner;

public class EmpInsert {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter user id:");
		int id=sc1.nextInt();
		System.out.println("Enter user Name:");
		String name=sc1.next();
		System.out.println("Enter user Salary:");
		double salary=sc1.nextDouble();
		System.out.println("Enter user Designation:");
		String designation=sc1.next();
		
		
		Connection con;
		Statement stmt;
		
		String query="insert into employee_info values("+id+", '"+name+"', "+salary+",'"+designation+"')";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			stmt=con.createStatement();
			int count=stmt.executeUpdate(query);
			System.out.println(count+" Record Successfully Inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
