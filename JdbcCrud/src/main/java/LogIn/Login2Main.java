package LogIn;

import java.util.Scanner;

public class Login2Main {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Login2 l1=new Login2();
		boolean status1=true;
		while(status1) {
		System.out.println("Select Operation");
		System.out.println("1:LOGIN");
		System.out.println("2:SIGN UP");
		System.out.println("3:Exit");
		System.out.println("Enter a choice");
		int choice=sc1.nextInt();
		
		if(choice==1) {
			System.out.println("Enter Username:");
			String user=sc1.next();
			System.out.println("Enter Password:");
			String pass=sc1.next();
			l1.login(user,pass);
		
		}else if(choice==2) {
			System.out.println("Enter Id");
			int id=sc1.nextInt();
			System.out.println("Enter Username:");
			String user=sc1.next();
			System.out.println("Enter Password:");
			String pass=sc1.next();
			l1.signUp(id,user, pass);
		}else if(choice==3) {
			status1=false;
		}else {
			System.out.println("Invalid Choice");
		}
		}
		
}
}
