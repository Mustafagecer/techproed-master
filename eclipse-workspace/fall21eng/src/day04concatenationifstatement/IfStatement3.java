package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement3 {

	public static void main(String[] args) {
		
/*
 if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("wednesday") || dayName.equalsIgnoreCase("Friday") || dayName.equalsIgnoreCase("Tuesday")) {
			System.out.println("Weekday");			
		}			
		else if (dayName.equalsIgnoreCase("Saturday") ||dayName.equalsIgnoreCase("Sunday")) {
				System.out.println("Weekend day");
			}else {
				System.out.println("You have false wrote");
			}
 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Write please the name of mounth:");
		
		String m=scan.next();
		if (m.equalsIgnoreCase("December")||m.equalsIgnoreCase("January") || m.equalsIgnoreCase("February" ) ) {
			System.out.println("Winter");
		}
	
		else if (m.equalsIgnoreCase("March")||m.equalsIgnoreCase("april") || m.equalsIgnoreCase("May" ) ) {
			System.out.println("Spring");
		}
		else if (m.equalsIgnoreCase("June")||m.equalsIgnoreCase("July") || m.equalsIgnoreCase("August" ) ) {
			System.out.println("Summer");
		}
		else if (m.equalsIgnoreCase("September")||m.equalsIgnoreCase("Octeber") || m.equalsIgnoreCase("November" ) ) {
			System.out.println("autumn");}
		
		else {System.out.println("Are you sure! "+ m +" is a mounth name?");

		scan.close();
			
		
		
		
		
		
		
		}
		
		
	}

}
