package PreparedStatment;

import java.sql.*;
import java.util.Scanner;

public class PrepareUpdate {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc1.nextInt();
		System.out.println("Enter Salary:");
		double salary=sc1.nextDouble();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		String query="Update employee1 set empSalary=(?) where empId=(?)";
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Shafik123");
			pstmt=con.prepareStatement(query);
			pstmt.setDouble(1, salary);
			pstmt.setInt(2, id);
			int count=pstmt.executeUpdate();
			System.out.println(count+" Record Updated Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
