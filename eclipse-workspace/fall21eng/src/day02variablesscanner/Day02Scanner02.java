package day02variablesscanner;

import java.util.Scanner;

public class Day02Scanner02 {

	public static void main(String[] args) {
	/*
	 Get 2 numbers from user and print the sum on the console.
	 */

		//Create Scanner object and import Scanner Class
		
		Scanner scan = new Scanner(System.in);
		
		//Get the data and put in the container
		System.out.println("Enter first number..");
		double num1 = scan.nextDouble();
		
		
		System.out.println("Enter second number..");
		double num2 = scan.nextDouble();
		
		System.out.println("The sum:" + (num1*num2));
		
		System.out.println("Enter the variable");
		
		double num3 = scan.nextDouble();
		
		System.out.println("Square of a number: " + num3*num3);
		scan.close();
	}

}
