package JDBCTEST;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		boolean status=true;
		while(status) {
		System.out.println("Select Operation");
		System.out.println("1:Insert Record");
		System.out.println("2:Display Record");
		System.out.println("3:Exit");
		System.out.println("Enter choice");
		int choice=sc1.nextInt();
		if(choice==1) {
			System.out.println("Enter username");
			String user=sc1.next();
			System.out.println("Enter pass");
			String pass=sc1.next();
			System.out.println("Enter age");
			int age=sc1.nextInt();
			System.out.println("Enter contact");
			long contact=sc1.nextLong();
			System.out.println("Enter City");
			String city=sc1.next();
			Question1Business q1=new Question1Business();
			q1.insertRecord(user, pass, age, contact, city);
		}else if(choice==2) {
			Question1Business q1=new Question1Business();
			q1.displayRecord();
		}else if(choice==3){
			status=false;
		}else {
			System.out.println("Invalid choice");
		}
	}

}
}
