package day04concatenationifstatement;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Write please first letter of day");
		
		String day=scan.next();
		
		if(day.equalsIgnoreCase("s")) {
			System.out.println("Saturday or Sunday");
		}

		else if(day.equalsIgnoreCase("m")) {
			System.out.println("Monday");
		}
		else if(day.equalsIgnoreCase("T")) {
			System.out.println("tuesday or Tuersday");
		}
		
		
		else if(day.equalsIgnoreCase("f")) {
			System.out.println("Friday");
		}
		else if(day.equalsIgnoreCase("w")) {
			System.out.println("Wednesday");
		}
		
		else {System.out.println("You have wrong wrote");
		
		
		
		scan.close();
		
		
		
		
		
		}
	}

}
