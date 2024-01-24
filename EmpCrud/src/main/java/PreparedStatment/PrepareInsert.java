package PreparedStatment;

import java.sql.*;
import java.util.Scanner;

public class PrepareInsert {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int id=sc1.nextInt();
		System.out.println("Enter Employee Name:");
		String name=sc1.next();
		System.out.println("Enter Employee Salary:");
		double salary=sc1.nextDouble();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		String query="insert into employee1 values(?,?,?)";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Shafik123");
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, salary);
			int count=pstmt.executeUpdate();
			System.out.println(count+" Record Inserted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
