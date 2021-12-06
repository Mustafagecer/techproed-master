package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement02 {

	/*
	 * If you want to compare two data as a info use "equals()" .
	 * 
	 *  || Means "or"
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write please a day name..");
		String dayName=scan.next();
		
		if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("wednesday") || dayName.equalsIgnoreCase("Friday") || dayName.equalsIgnoreCase("Tuesday")) {
			System.out.println("Weekday");
			
		}
			
		else if (dayName.equalsIgnoreCase("Saturday") ||dayName.equalsIgnoreCase("Sunday")) {
				System.out.println("Weekend day");
			

				
				
				
				
			}else {
				System.out.println("You have false wrote");
			}
			
			
			
			
			scan.close();
			
			
			
			
			
			
			
			
	}

	}


