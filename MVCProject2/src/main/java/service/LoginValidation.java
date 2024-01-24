package service;

import java.sql.*;

public class LoginValidation {
	public boolean validation(String user, String pass) {
		
		String query="select name,pass from login_info";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Shafik123");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				if(user.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
					return true;
				}else {
					return false;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
