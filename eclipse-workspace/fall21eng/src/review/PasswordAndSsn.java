package review;

import java.util.Scanner;

public class PasswordAndSsn {

	public static void main(String[] args) {
		/* Ask user ta enter his/her first name, last name and Social Security Number.
		Then type a program which makes
		a) initials of the first name and the last name in uppercase,
		other characters will be in lowercase.
		b) all characters except last 4 characters of the Social Security Number “ * ”.
		For example; Suleyman Alptekin *****5678
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your First Name");
		String f=scan.next();
		System.out.println("Enter your Last Name");
		String l=scan.next();
		System.out.println("Enter your Social Security Number");
		String s=scan.next();
		
		System.out.println(f.charAt(0)>='A' && f.charAt(0)<='Z'
		&& l.charAt(0)>='A' && l.charAt(0)<='Z'? "Valid First and Last name":"Not valid first or last name."
		+ ""
		+ "initials of the first name and the last name should be in uppercase");
		
		System.out.println(s.length()==8 ? ("****"+Integer.valueOf(s.charAt(4)+""+s.charAt(5)+""+s.charAt(6)+""+s.charAt(7))): "Invalid Ssn , Please write again");
	
	
		scan.close();
	}
		
		
	
	}


