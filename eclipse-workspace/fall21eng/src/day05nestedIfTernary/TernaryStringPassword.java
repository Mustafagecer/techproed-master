package day05nestedIfTernary;

import java.util.Scanner;

public class TernaryStringPassword {
/*
 * Ask user to enter a String. If the String has 2 characters, output will be
“It is valid for state abbreviations” 
Otherwise, output will be “It is not valid for state abbreviations
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please a password  ");

		String p=scan.next();
		
		System.out.println(p.length()==2? "It is valid for state abbreviations":"It is not valid for state abbreviations");

		scan.close();
	}

}
