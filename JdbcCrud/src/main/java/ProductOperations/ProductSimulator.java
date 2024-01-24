package ProductOperations;

import java.sql.*;

public class ProductSimulator {
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

	public void addProduct(int id, String name, double price) {
		
		String query="insert into product_info1 values("+id+",'"+name+"',"+price+")";
		try {
			stmt=con.createStatement();
			int count=stmt.executeUpdate(query);
			System.out.println(count+" Product Inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteProduct(int id) {
		
		String query="delete from product_info1 where product_id="+id;
		try {
			stmt=con.createStatement();
			int count=stmt.executeUpdate(query);
			if(count!=0) {
				System.out.println("Product Deleted");
			}else {
				System.out.println("Product Not Found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectProduct() {
		ResultSet rs=null;
		
		String query="select * from product_info1";
		try {
		
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("ID\t\tNAME\t\tPRICE");
			System.out.println("===================================================");
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				double price=rs.getDouble(3);
				System.out.println(id+"\t\t"+name+"\t\t"+price);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
