package CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc1=new Scanner(System.in);
     System.out.println("Enter pi Value");
     double pi=sc1.nextDouble();
     System.out.println("Enter Radius Value");
     double radius=sc1.nextDouble();
     
     
     Connection con=null;
     CallableStatement cstmt=null;
     
     
     try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
		cstmt=con.prepareCall("{?=call areaofcircle(?,?)}");
		cstmt.setDouble(2, pi);
		cstmt.setDouble(3, radius);
		
		cstmt.registerOutParameter(1, Types.DOUBLE);
		cstmt.execute();
		System.out.println("Area of Circle is "+cstmt.getDouble(1));
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
