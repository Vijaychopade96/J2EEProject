package LogIn;

import java.sql.*;
import java.util.Scanner;

import CrudOperations.DisplayProduct;
import ProductOperations.ProductSimulator;

public class Login2 {
	static Connection con=null;
	static Statement stmt=null;
	static {
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
		stmt=con.createStatement();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	 public void login(String user, String pass){
		String query="select username,password from login_info";
		ResultSet rs=null;
		try {
			
			rs=stmt.executeQuery(query);
			boolean status=false;
			while(rs.next()) {
				String dbuser=rs.getString(1);
				String dbpass=rs.getString(2);
				
				if(dbuser.equals(user) && dbpass.equals(pass)) {
					System.out.println("LOGIN SUCCESSFULL");
					status=true;
					Scanner sc1=new Scanner(System.in);
					System.out.println("Select Operation");
					System.out.println("1:Display product");
					System.out.println("2:Add Product");
					System.out.println("Enter Choice");
					int choice=sc1.nextInt();
					
					if(choice==1) {
						DisplayProduct dp=new DisplayProduct();
						dp.displayProduct();
					}else if(choice==2) {
						ProductSimulator ps=new ProductSimulator();
						System.out.println("Enter Product Id:");
						int id=sc1.nextInt();
						System.out.println("Enter Product Name:");
						String name=sc1.next();
						System.out.println("Enter Product Price:");
						double price=sc1.nextDouble();
						ps.addProduct(id, name, price);
					}
				}
			}
			if(status==false) {
				System.out.println("INVALID LOGIN DETAILS");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
		
		public void signUp(int id,String username,String password) {
			String query="insert into login_info values ('"+id+"','"+username+"','"+password+"')";
			
			try {
				int count=stmt.executeUpdate(query);
				System.out.println(count+" New User Data Inserted");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


