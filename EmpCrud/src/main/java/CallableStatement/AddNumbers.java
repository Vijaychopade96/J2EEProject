package CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Number1:");
		int no1=sc1.nextInt();
		System.out.println("Enetr Number2:");
		int no2=sc1.nextInt();
		
	
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Shafik123");
			cstmt=con.prepareCall("{?=call addnumbers(?,?)}");
			cstmt.setInt(2, no1);
			cstmt.setInt(3, no2);
			
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
		
			System.out.println("Addition is:"+cstmt.getInt(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
