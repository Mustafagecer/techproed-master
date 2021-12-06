package day04concatenationifstatement;

import java.util.Scanner;

public class AnyLetterFinding {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Write please a name of day");
		String day=scan.next();
		
		if (day.equalsIgnoreCase("Monday")) {
			System.out.println("ody");
		}
		else if (day.equalsIgnoreCase("Tuesday")) {
			System.out.println("usa");
		}

		else if (day.equalsIgnoreCase("Wednesday")) {
			System.out.println("ens");
		}
		else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("hrd");
		}
		else if (day.equalsIgnoreCase("Friday")) {
			System.out.println("rdy");
		}
		else if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("aud");
		}
		else if (day.equalsIgnoreCase("Sunday")) {
			System.out.println("ud ");
		}
		
		else { 
			System.out.println("You have not written a name of day");
		}
		
		
		
		scan.close();
		
		
		
		
		
	}

}
