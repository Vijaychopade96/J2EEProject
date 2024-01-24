package CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class ParametersDemo {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Bike company");
		String company=sc1.next();

		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			
			cstmt=con.prepareCall("{call parameters(?,?)}");
		    cstmt.setString(1, company); 
		    cstmt.registerOutParameter(2, Types.INTEGER);
		    cstmt.execute();
		    System.out.println("Total no of Models Are:"+cstmt.getInt(2));
		} catch (SQLException e) {
			e.printStackTrace();
	}
	}

}
