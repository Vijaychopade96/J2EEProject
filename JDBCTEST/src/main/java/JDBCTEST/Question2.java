package JDBCTEST;

import java.util.Scanner;

public class Question2 {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	boolean status=true;
	while(status) {
	System.out.println("\nSelect Operation");
	System.out.println("1:Get Count");
	System.out.println("2:Display Count");
	System.out.println("3:Exit");
	System.out.println("Enter choice");
	int choice=sc1.nextInt();
	
	if(choice==1) {
		System.out.println("Enter City");
		String city=sc1.next();
		Question2Business q2=new Question2Business();
		q2.getCount(city);
	}else if(choice==2) {
		Question2Business q2=new Question2Business();
		q2.display();
	}else if(choice==3) {
		status=false;
	}else {
		System.out.println("Invalid choice");
	}
	}
}
}
