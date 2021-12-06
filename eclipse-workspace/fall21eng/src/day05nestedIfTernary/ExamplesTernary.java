package day05nestedIfTernary;

import java.util.Scanner;

public class ExamplesTernary {

	public static void main(String[] args) {
		/*
		 1)Type java code by using ternary and if-else, 
		 ask user to enter an integer, if the integer is even,
		 the output will be “The integer is even”. If the integer is odd,
		  the output will be “The integer is odd”.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please  a number  ");

		int a=scan.nextInt();
		
	    System.out.println((a%2==0)? ("It is an even number"):("It is not an odd number")); 

		scan.close();
	}

}
