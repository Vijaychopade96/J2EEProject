package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Amount");
		int amt=sc1.nextInt();
		System.out.println("Enter Customer Type");
		String cs=sc1.next();
		
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			//create platform using Callable Statement.
			cstmt=con.prepareCall("{?=call discount1(?,?)}");
			//set input to second and third placeholder.
			cstmt.setInt(2,amt);
			cstmt.setString(3,cs);
			
			//Store output into first placeholder.
			cstmt.registerOutParameter(1, Types.DOUBLE);
			cstmt.execute();
			//get Output from first placeholder.
			System.out.println("Customer Type Is "+cstmt.getDouble(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
