package CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class ProductCalculation {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Qty");
		double qty=sc1.nextDouble();
		System.out.println("Enter Price");
		double price=sc1.nextDouble();
	
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			cstmt=con.prepareCall("{?=call productcalculation(?,?)}");
			cstmt.setDouble(2, qty);
			cstmt.setDouble(3, price);
			
			cstmt.registerOutParameter(1, Types.DOUBLE);
			cstmt.execute();
			System.out.println("Product Price is "+cstmt.getDouble(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
