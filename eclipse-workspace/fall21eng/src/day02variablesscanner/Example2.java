package day02variablesscanner;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write please first lenght; ");
		
		int i1 = scan.nextInt();
		
        System.out.println("Write please second lenght; ");
		
		int i2 = scan.nextInt();
		
		
		System.out.println("Perimeter of Rectangle is: " + (2*(i1+i2)));
		
		System.out.println("Area of Rectangle is: "+ (i1*i2));
		
		
		
		
		

	}

}
