package day04concatenationifstatement;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Write please a number");

		double d=scan.nextDouble();
		if (d>0) {
			System.out.println("The absolute value of "+d+" is "+d);
			
		}
		
		
		else if (d<0) {
			System.out.println("The absolute value of "+d+" is "+(-1)*(d));
			
		}
		
		
		
		
	}

}
