package Practice;

import java.sql.*;
import java.util.Scanner;

public class InsertPrepared {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Employee id");
	int id=sc1.nextInt();
	System.out.println("Enter Employee name");
	String name=sc1.next();
	System.out.println("Enter Employee salary");
	double salary=sc1.nextDouble();
	System.out.println("Enter Employee designation");
	String desi=sc1.next();
	
	Connection con=null;
	PreparedStatement pstmt=null;
	
	String query="insert into employee_info values(?,?,?,?)";
	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","Shafik123");
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setDouble(3, salary);
		pstmt.setString(4, desi);
		int count=pstmt.executeUpdate();
		System.out.println(count+" Record Inserted");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
