package PreparedStatement;

import java.sql.*;

public class Bike {
	
	static Connection con=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;

	static { 
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7", "root", "Shafik123");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addBike(String model, String company, double price) {
		String query="insert into bike_info(model,company,price) values(?,?,?)";
		
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, model);
			pstmt.setString(2, company);
			pstmt.setDouble(3, price);
			int count=pstmt.executeUpdate();
			System.out.println(count+" RECORD INSERTED");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getByModel(String bmodel) {
		
		String query="select * from bike_info";
		
			try {
				pstmt=con.prepareStatement(query);
				rs=pstmt.executeQuery(query);
				System.out.println("ID\t\tMODEL\t\tCOMPANY\t\tPRICE");
				System.out.println("===================================================");
				while(rs.next()) {
					if(bmodel.equals(rs.getString(2))) {
					int id=rs.getInt(1);
					String bmodel1=rs.getString(2);
					String company=rs.getString(3);
					double price=rs.getDouble(4);
					System.out.println(id+"\t\t"+bmodel+"\t\t"+company+"\t\t"+price);
				}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
			
			public void getByCompany(String bcompany) {
				String query="select * from bike_info";
				
				try {
					pstmt=con.prepareStatement(query);
					rs=pstmt.executeQuery(query);
					System.out.println("ID\t\tMODEL\t\tCOMPANY\t\tPRICE");
					System.out.println("===================================================");
					while(rs.next()) {
						if(bcompany.equals(rs.getString(3))) {
						int id=rs.getInt(1);
						String bmodel1=rs.getString(2);
						String company=rs.getString(3);
						double price=rs.getDouble(4);
						System.out.println(id+"\t\t"+bmodel1+"\t\t"+company+"\t\t"+price);
					}
					}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
					
			public void getAllBikes() {
				String query="select * from bike_info";
				try {
					pstmt=con.prepareStatement(query);
					rs=pstmt.executeQuery(query);
					System.out.println("ID\t\tMODEL\t\tCOMPANY\t\tPRICE");
					System.out.println("===================================================");
					while(rs.next()) {
						int id=rs.getInt(1);
						String model=rs.getString(2);
						String company=rs.getString(3);
						double price=rs.getDouble(4);
						System.out.println(id+"\t\t"+model+"\t\t"+company+"\t\t"+price);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
					
		
	}
