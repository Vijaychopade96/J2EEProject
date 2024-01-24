package JDBCTEST;

import java.sql.*;


public class Question2Business {
	static Connection con=null;
	Statement stmt=null;
	
	static {
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void getCount(String city) {
			String query="select city,count(*) from user_info where city=('"+city+"') group by city";
			ResultSet rs=null;
			try {
				stmt=con.createStatement();
				rs=stmt.executeQuery(query);
				System.out.println("CITY\t\tCOUNT");
				System.out.println("===================================");
				while(rs.next()) {
					System.out.println(rs.getString(1)+"\t\t"+rs.getInt(2)); 
		           }
	     }catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	     }
	}
	public void display() { 
		String query="select * from user_info order by age";
		ResultSet rs=null;
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("ID\tUERNAME\tAGE");
			while(rs.next()) {
				int id=rs.getInt(1);
				String user=rs.getString(2);
				String pass=rs.getString(3);
				int age=rs.getInt(4);
				long contact=rs.getLong(5);
				String usercity=rs.getString(6);
				System.out.println(id+"\t"+user+"\t"+age);
	           }
     }catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
     }
	}
}
