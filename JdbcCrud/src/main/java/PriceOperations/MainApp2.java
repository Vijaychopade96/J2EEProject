package PriceOperations;

import java.sql.*;
import java.util.Scanner;

public class MainApp2 {
	public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Lower Price");
	double lower=sc1.nextDouble();
	System.out.println("Enter Higher Price:");
	double higher=sc1.nextDouble();
	
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	String query="select * from product_info1 where product_price BETWEEN "+lower+ " and "+higher;
	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
		System.out.println("ID\t\tNAME\\t\\tPRICE");
		System.out.println("===================================================");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			double price=rs.getDouble(3);
			System.out.println(id+"\t\t"+name+"\t\t"+price);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
