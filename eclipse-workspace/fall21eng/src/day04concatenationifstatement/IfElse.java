package day04concatenationifstatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please  first number ");
		double d1=scan.nextDouble();
		System.out.println("Enter please  second number ");
		double d2=scan.nextDouble();

		if (d1<0  &&  d2<0) {
			System.out.println("The output is: "+(d1*d2));
		}
		
		else if (d1>0  &&  d2>0) {
			System.out.println("The output is: "+(d1+d2));
		}
		else {
			System.out.println("I cannot add or multiply different signed numbers");
		}
		
		
		
	}

}
