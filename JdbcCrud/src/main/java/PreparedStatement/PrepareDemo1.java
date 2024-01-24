package PreparedStatement;

import java.sql.*;

public class PrepareDemo1 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		
		String query="insert into product_info1 values(?,?,?)";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, 3);
			pstmt.setString(2, "TV");
			pstmt.setDouble(3, 30000.20);
			int count1=pstmt.executeUpdate();
			
			pstmt.setInt(1, 4);
			pstmt.setString(2, "PROJECTOR");
			pstmt.setDouble(3, 28000.20);
			int count2=pstmt.executeUpdate();
			
			System.out.println(count1+count2+" RECORDS INSERTED");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
