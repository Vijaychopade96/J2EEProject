package PreparedStatement;

import java.sql.*;

public class PrepareDemo2 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		
		String query="delete from product_info1 where product_id=(?)";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, 3);
			int count1=pstmt.executeUpdate();
			
			pstmt.setInt(1, 4);
			int count2=pstmt.executeUpdate();
			
			System.out.println(count1+count2+" RECORDS DELETED");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
