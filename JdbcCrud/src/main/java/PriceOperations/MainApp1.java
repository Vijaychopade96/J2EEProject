package PriceOperations;

import java.util.Scanner;

public class MainApp1 {
	public static void main(String[] args) {
		PriceOperations ps=new PriceOperations();
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
		System.out.println("Select Operation");
		System.out.println("1:Max Price");
		System.out.println("2:Min Price");
		System.out.println("3:Exit");
		System.out.println("Enter Choice");
		int choice=sc1.nextInt();
		
	
		if(choice==1) {
			ps.maxPrice();
		}else if(choice==2) {
			ps.minPrice();
		}else if(choice==3){
			status=false;
		}else {
			System.out.println("Invalid Choice");
		}
	}

}
}
