 package day02variablesscanner;

import java.util.Scanner;

public class Day02Scanner01 {

	public static void main(String[] args) {
		//To go a class we create object most of the times.
		/*
		 
		How will we create an object from a class
		a)Class name 
		b)Object name 
		c)=
		d)new 
		e)ClassName()
	
		 */

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter your age!.");
//		
//		int age = scan.nextInt();
//		System.out.println("The age user entered:" + age);
//		
//		System.out.println("First name?");
//		
//		// To get String from user you have 2 options
//		//i)next() : gets just the first word 
//		//ii)nextLine(): gets all the words then moves to the next line 
//		String name = scan.next();
//		System.out.println("first name? " + name);
		
		
		System.out.println("enter your adress");
		
		String address = scan.nextLine();
		System.out.println("Adress user entered: " + address);
		
		
		scan.close();
		
		
		
		
		
		
	}

}
