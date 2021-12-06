package day04concatenationifstatement;

import java.util.Scanner;

public class GenderAndAge {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		System.out.println("What is your gender?");
		String x=scan.nextLine();
		
		if(x.equalsIgnoreCase("Male")) {
			System.out.println("Enter Please Your age: ");
		int i=scan.nextInt();
		
		
		
		
		if(i<18 || i>65) {
			System.out.println("No need to work");	
		}
		
		else if(i>=18 || i<=65 ) {
			System.out.println("You need to work");	
		}
			
		}
		else {System.out.println("No need to work");	
			
		}
		
		
		
		
		scan.close();
		
		
		
	}

}
