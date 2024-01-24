package CallableStatement;

import java.sql.*;
import java.util.Scanner;


public class ProductOperations {
	public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Product id");
	int id=sc1.nextInt();
	System.out.println("Enter Product name");
	String name=sc1.next();
	System.out.println("Enter Product Price");
	String price=sc1.next();
	System.out.println("Enter Product Delete Id");
	double did=sc1.nextDouble();
	
	Connection con=null;
	CallableStatement cstmt=null;
	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
		
		cstmt=con.prepareCall("{call productOperations(?,?,?,?)}");
	    cstmt.setInt(1, id);
	    cstmt.setString(2,name);
	    cstmt.setString(3, price);
	    cstmt.setDouble(4, did); 
	    cstmt.execute();
	    System.out.println("Procedures Executed Successfully");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
