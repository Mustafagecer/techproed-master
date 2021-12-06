package day02variablesscanner;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {


		short s1 = 12 ;
		
		int i1= (int) s1 ;
		
		System.out.println(i1);

		int i2 = 130;
		byte b1 = (byte) i2;
		
		
		System.out.println(b1);
		
		
		float f1 = 15.6f;
		double d1 = f1 ;
		
		System.out.println(d1);
		
		float f2= 5f/3 ;
		System.out.println(f2);
		
		double d2 = 5/3d ;
		System.out.println(d2);
		
		int i3 = 7/3 ;
		System.out.println(i3);
		
		int i4=15, i5=15, i6= 20;
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first integer less than 100");
		
		int num1= scan.nextInt();
		
		
		System.out.println("Enter second integer less than 100");
		int num2 = scan.nextInt();
		
		System.out.println("Enter third integer less than 100");
		int num3= scan.nextInt();
		
		
		System.out.println("The sum of three numbers: " + (num1+num2+num3));
		
		
		
		
		
		
	}

}
