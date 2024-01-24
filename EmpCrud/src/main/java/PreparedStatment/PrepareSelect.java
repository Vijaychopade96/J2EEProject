package PreparedStatment;

import java.sql.*;

public class PrepareSelect {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String query="select * from employee1";
				
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Shafik123");
			pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			System.out.println("ID\tNAME\tSALARY");
			System.out.println("=========================");
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				double salary=rs.getDouble(3);
				System.out.println(id+"\t"+name+"\t"+salary);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
