package Practice;

import java.sql.*;

public class DisplayStatement {
public static void main(String[] args) {
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	 String query="select * from employee_info";
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
		System.out.println("ID\t\tNAME\t\tSALARY\t\tDESIGNATION");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			double salary=rs.getDouble(3);
			String desi=rs.getString(4);
			System.out.println(id+"\t\t"+name+"\t\t"+salary+"\t\t"+desi);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
