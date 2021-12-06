package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		 
		System.out.println("Write please the lenght;");
		
		
		int l=scan.nextInt();
		
		System.out.println("Write please the height");
		int h=scan.nextInt();
		
		System.out.println("Perimeter of a Rectangle: " +(2*l+2*h));
		
		System.out.println("Area of a Rectangle: " +l*h);

	}

}
