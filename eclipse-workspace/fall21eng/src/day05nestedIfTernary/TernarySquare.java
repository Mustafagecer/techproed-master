package day05nestedIfTernary;

import java.util.Scanner;

public class TernarySquare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please lenght  ");

		double a=scan.nextDouble();
	
		System.out.println("Enter please  width  ");

		double b=scan.nextDouble();
		
		String result= a==b? "It is a square" : "It is not a square"; 
		
		System.out.println(result);
		
		scan.close();
	}

}
