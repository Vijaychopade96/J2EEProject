package Domain;

import java.util.ArrayList;
import java.util.Scanner;

import Dao.ProductDAO;
import Dto.Product;

public class ProductMainApp {
	static Scanner sc1=new Scanner(System.in);
	public static void main(String[] args) {
		boolean status=true;
		while(status) {
		System.out.println("Select Operation");
		System.out.println("1:ADD PRODUCT");
		System.out.println("2:DELETE PRODUCT");
		System.out.println("3:DISPLAY PRODUCT");
		System.out.println("4:EXIT");
		System.out.println("ENTER YOUR CHOICE");
		int choice=sc1.nextInt();
		
		if(choice==1) {
			addProduct();
		}else if(choice==2) {
			deleteProduct();
		}else if(choice==3) {
			showProducts();
		}else {
			status=false;
		}
	}
 }
	
	 static void addProduct() {
		System.out.println("Enter a Product Name:");
		String name=sc1.next();
		System.out.println("Enter a Product Price:");
		double price=sc1.nextDouble();
		Product p1=new Product();
		p1.setProductName(name);
		p1.setProductPrice(price);
		ProductDAO a1=new ProductDAO();
		int count=a1.insertProduct(p1);
		System.out.println(count+" Product Inserted Successfully");
	}
	
	static void deleteProduct() {
		System.out.println("Enter a Product Id:");
		int id=sc1.nextInt();
		Product p1=new Product();
		p1.setProductId(id);
		ProductDAO a1=new ProductDAO();
		int count=a1.removeProduct(p1);
		System.out.println(count+" Product Deleted Successfully");
	}
	
	static void showProducts() {
		ProductDAO a1=new ProductDAO();
		ArrayList<Product> data=a1.displayProduct();
		for(Product d:data) {
			System.out.println(d);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
