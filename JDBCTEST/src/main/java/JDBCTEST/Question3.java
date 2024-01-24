package JDBCTEST;

import java.sql.*;
import java.util.Scanner;

public class Question3 {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Contact");
	long contact=sc1.nextLong();
	
	Connection con=null;
	PreparedStatement pstmt=null;
	String query="delete from user_info where contact=?";
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
		pstmt=con.prepareStatement(query);
		pstmt.setLong(1, contact);
		int count=pstmt.executeUpdate();
		if(count!=0) {
		System.out.println(count+" Record Deleted Successfully");
		}else {
			System.out.println("Record not found");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
