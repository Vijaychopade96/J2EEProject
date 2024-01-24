package CrudOperations;

import java.sql.*;
import java.util.Scanner;

public class EmpUpdate {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc1.nextInt();
		System.out.println("Enter Salary:");
		double salary=sc1.nextDouble();

		Connection con;
		Statement stmt;
		
		String query="update employee_info set employee_salary="+salary+" where employee_id="+id+"";
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			stmt=con.createStatement();
			int count=stmt.executeUpdate(query);
			System.out.println(count+" Record Updated Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
