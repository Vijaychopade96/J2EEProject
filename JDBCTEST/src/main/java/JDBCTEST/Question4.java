package JDBCTEST;


import java.sql.*;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter AMt");
	double amt=sc1.nextDouble();
	System.out.println("Enter ticket");
	int ticket=sc1.nextInt();

	Connection con=null;
	CallableStatement cstmt=null;
	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
		cstmt=con.prepareCall("{?=call booking(?,?)}");
		cstmt.setDouble(2, amt);
		cstmt.setDouble(3, ticket);
		
		cstmt.registerOutParameter(1, Types.DOUBLE);
		cstmt.execute();
		System.out.println("Product Price is "+cstmt.getDouble(1));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
