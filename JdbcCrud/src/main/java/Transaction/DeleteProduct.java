package Transaction;

import java.sql.*;
import java.util.Scanner;

public class DeleteProduct {

	public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Product id");
	int id=sc1.nextInt();
	
	Connection con=null;
	PreparedStatement pstmt=null;
	
	String query="delete from product_info1 where product_id=?";
	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
		con.setAutoCommit(false);
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		int count=pstmt.executeUpdate();
		System.out.println("WANT TO UNDO");
		System.out.println("1:YES\t\t2:NO");
		int choice=sc1.nextInt();
		if(choice==1) {
			con.rollback();
			System.out.println("TRANSACTION ROLLBACK");
		}else if(choice==2) {
			con.commit();
			System.out.println(count+" PRODUCT DELETED");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
