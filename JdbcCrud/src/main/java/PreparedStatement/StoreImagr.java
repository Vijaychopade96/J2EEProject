package PreparedStatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class StoreImagr {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		FileInputStream fin=null;
		
		String query="insert into course_info(id,name,image) values(?,?,?)";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "JAVA");
			fin=new FileInputStream("D:\\ProperetiesFile\\java.png");
			pstmt.setBinaryStream(3, fin);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 2);
			pstmt.setString(2, "SQL");
			fin=new FileInputStream("D:\\\\ProperetiesFile\\sql.png");
			pstmt.setBinaryStream(3, fin);
			pstmt.executeUpdate();
			System.out.println("Info Inserted Successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
