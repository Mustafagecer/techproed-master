package day04concatenationifstatement;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter please  quantity and unit price   ");

			double d=scan.nextDouble();
			if (d>1000) {
				System.out.println("You should pay "+ d*0.9);
				
			}
			
			
			else {
				System.out.println("No discount ");
				
			}
			
			
			

	}

}
