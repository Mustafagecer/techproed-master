package day05nestedIfTernary;

import java.util.Scanner;

public class NestedIf01 {

	/*Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not.
If it is ‘A’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid
If the initial of the password is lowercase then check if it is ‘z’ or not.
If it is ‘z’ the output will be “Valid Password”
otherwise the output will be “Invalid Password”
For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid
	 
	 
	 Indexes start from 0
	 
	 Note: Every character in a String has index.
	 
	 */
	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the password...");
		String p=scan.next();
		
		if (p.charAt(0)>= 'A' && p.charAt(0)<= 'Z') {
			if(p.charAt(0)=='A') {System.out.println("Valid Password");
		}
		
		else {System.out.println("unvalid Password");
		}}
		
		else if(p.charAt(0)>= 'a' && p.charAt(0)<= 'z') {
			if(p.charAt(0)=='z') {System.out.println("Valid Password");
		}
		
		else {System.out.println("unvalid Password");
		}}
		else {
			System.out.println("First character should be letter..");
		}
scan.close();
	}
}
