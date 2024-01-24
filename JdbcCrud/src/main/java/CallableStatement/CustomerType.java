package CallableStatement;

import java.sql.*;
import java.util.Scanner;

public class CustomerType {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Amount");
		int creditlimit=sc1.nextInt();
		
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			//create platform using Callable Statement.
			cstmt=con.prepareCall("{?=call customertype(?)}");
			//set input to second and third placeholder.
			cstmt.setInt(2,creditlimit);
			//Store output into first placeholder.
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.execute();
			//get Output from first placeholder.
			System.out.println("Customer Type Is "+cstmt.getString(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
