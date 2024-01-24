package Dao;

import java.sql.*;
import java.util.ArrayList;

import Dto.Product;

public class ProductDAO {
	static Connection con=null;
	PreparedStatement pstmt=null;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","vijay@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insertProduct(Product p) {
		String query="insert into product_info(name, price) values(?,?)";
		int count=0;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, p.getProductName());
			pstmt.setDouble(2, p.getProductPrice());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	public int removeProduct(Product p) {
		String query="delete from product_info where id=?";
		int count=0;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, p.getProductId());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}
	
	public ArrayList<Product> displayProduct() {
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Product> products=new ArrayList();
		String query="select * from product_info";
		
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				double price=rs.getDouble(3);
				
				Product p1=new Product();
				p1.setProductId(id);
				p1.setProductName(name);
				p1.setProductPrice(price);
				
				products.add(p1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
		
	}
}
	
		
		
	
