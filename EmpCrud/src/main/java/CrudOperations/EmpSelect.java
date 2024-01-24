package CrudOperations;

import java.sql.*;

public class EmpSelect {
	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		String query="select * from employee_info";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("=======================================");
			System.out.println("ID\tNAME\tSALARY\tDESIGNATION");
			System.out.println("=======================================");
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				double salary=rs.getDouble(3);
				String des=rs.getString(4);
				System.out.println(id+"\t"+name+"\t"+salary+"\t"+des);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
