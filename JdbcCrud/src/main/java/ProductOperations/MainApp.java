package ProductOperations;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		ProductSimulator ps=new ProductSimulator();
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
		System.out.println("Select Operation");
		System.out.println("1:Add Product");
		System.out.println("2:Delete Product");
		System.out.println("3:Display Product");
		System.out.println("4:Exit");
		System.out.println("Enter Choice");
		int choice=sc1.nextInt();
		
		if(choice==1) {
			System.out.println("Enter Product Id:");
			int id=sc1.nextInt();
			System.out.println("Enter Product Name:");
			String name=sc1.next();
			System.out.println("Enter Product Price:");
			double price=sc1.nextDouble();
			
			ps.addProduct(id, name, price);
			
		}else if(choice==2) {
			System.out.println("Enter Product Id:");
			int id=sc1.nextInt();
			ps.deleteProduct(id);
		}else if(choice==3) {
			ps.selectProduct();
		}else if(choice==4){
			status=false;
		}else {
			System.out.println("Invalid Choice");
		}
	}
	}

}
