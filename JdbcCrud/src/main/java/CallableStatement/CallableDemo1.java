package CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class CallableDemo1 {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter No1 ");
	int no1=sc1.nextInt();
	System.out.println("Enter No2 ");
	int no2=sc1.nextInt();
	
	
	Connection con=null;
	CallableStatement cstmt=null;
	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
		//create platform using Callable Statement.
		cstmt=con.prepareCall("{?=call addnumbers(?,?)}");
		//set input to second and third placeholder.
		cstmt.setInt(2,no1);
		cstmt.setInt(3,no2);
		//Store output into first placeholder.
		cstmt.registerOutParameter(1, Types.INTEGER);
		cstmt.execute();
		//get Output from first placeholder.
		System.out.println("ADDITION IS "+cstmt.getInt(1));
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
