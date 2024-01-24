package PreparedStatment;

import java.sql.*;
import java.util.Scanner;

public class PrepareDelete {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc1.nextInt();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		String query="delete from employee1 where empId=(?)";
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Shafik123");
				pstmt=con.prepareStatement(query);
				pstmt.setInt(1, id);
				int count=pstmt.executeUpdate();
				System.out.println(count+" Record Deleted Successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

}
}
