package CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class BikeOerations {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Bike id");
		int id=sc1.nextInt();
		System.out.println("Enter Bike model");
		String model=sc1.next();
		System.out.println("Enter Bike company");
		String company=sc1.next();
		System.out.println("Enter Bike price");
		double price=sc1.nextDouble();
		
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			
			cstmt=con.prepareCall("{call bikeoperations(?,?,?,?)}");
		    cstmt.setInt(1, id);
		    cstmt.setString(2,model);
		    cstmt.setString(3, company);
		    cstmt.setDouble(4, price); 
		    cstmt.execute();
		    System.out.println("Procedures Executed Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
	
