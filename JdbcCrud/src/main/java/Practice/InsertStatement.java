package Practice;

import java.sql.*;
import java.util.Scanner;

public class InsertStatement {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Employee id");
		int id=sc1.nextInt();
		System.out.println("Enter Employee name");
		String name=sc1.next();
		System.out.println("Enter Employee salary");
		double salary=sc1.nextDouble();
		System.out.println("Enter Employee designation");
		String desi=sc1.next();
		
		Connection con=null;
		Statement stmt=null;
		
		String query="insert into employee_info values("+id+",'"+name+"',"+salary+",'"+desi+"')";
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","Shafik123");
			stmt=con.createStatement();
			int count=stmt.executeUpdate(query);
			System.out.println(count+" Record Inserted Successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
