package review;

import java.util.Scanner;

public class EMail {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter an email address");
	String email=scan.next();
	emailcontrol(email);
	
	

	}

	public static void emailcontrol(String email) {
		if (!email.contains("@")) {
		System.out.println("Your email adress should have '@'");
	}else if(!email.contains("@gmail.com")){
		System.out.println("Your email adress should have '@gmail.com'");}
	else if(!email.endsWith("@gmail.com")) {
		System.out.println("Your email adress should finished '@gmail.com'");
	}else {
		System.out.println("Your email adress has created succesfuly");
	}
		
	}

}
