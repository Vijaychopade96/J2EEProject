package PreparedStatement;

import java.util.Scanner;

public class BikeMainApp {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Bike b1=new Bike();
	boolean status=true;
	while(status) {
	System.out.println("Select Operation");
	System.out.println("1:ADD BIKE");
	System.out.println("2:GET BIKE BY MODEL");
	System.out.println("3:GET BIKE BY COMPANY");
	System.out.println("4:GET ALL BIKES");
	System.out.println("5:EXIT");
	System.out.println("Enter Choice:");
	int choice=sc1.nextInt();
	
	if(choice==1) {
		System.out.println("Enter Model");
		String model=sc1.next();
		System.out.println("Enter Company");
		String company=sc1.next();
		System.out.println("Enter Price");
		double price=sc1.nextDouble();
		b1.addBike(model, company, price);
		
	}else if(choice==2) {
		System.out.println("Enter Model");
		String model=sc1.next();
		b1.getByModel(model);
	}else if(choice==3) {
		System.out.println("Enter Company");
		String company=sc1.next();
		b1.getByCompany(company);
	}else if(choice==4) {
		b1.getAllBikes();
	}else if(choice==5){
		status=false;
	}else {
		System.out.println("Invalid Choice");
	}
	}
	
}
}
