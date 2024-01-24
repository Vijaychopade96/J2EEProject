package JDBCTEST;

import java.sql.*;

public class Question1Business {

	static Connection con=null;
	PreparedStatement pstmt=null;
	
	static {
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void insertRecord(String user,String pass,int age,long contact,String city) {
		String query="insert into user_info(username,password,age,contact,city) values(?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, user);
			pstmt.setString(2, pass);
			pstmt.setInt(3, age);
			pstmt.setLong(4, contact);
			pstmt.setString(5, city);
			int count=pstmt.executeUpdate();
			System.out.println(count+" Record Inserted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayRecord() {
		String query="select * from user_info";
		ResultSet rs=null;
		try {
			pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery(query);
			System.out.println("ID\tUERNAME\tPASSWORD\tAGE\tCONTACT\tCITY");
			while(rs.next()) {
				int id=rs.getInt(1);
				String user=rs.getString(2);
				String pass=rs.getString(3);
				int age=rs.getInt(4);
				long contact=rs.getLong(5);
				String city=rs.getString(6);
				System.out.println(id+"\t"+user+"\t"+pass+"\t"+age+"\t"+contact+"\t"+city);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
