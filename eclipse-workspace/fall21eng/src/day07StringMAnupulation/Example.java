package day07StringMAnupulation;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		/*
	4)Check the password according to the given rule
		a)No space character at the beginning and at the end
		b)It must contain at least 1 digit
		c)It must contain at least 1 lowercase letter
		d)It must contain at least 1 uppercase letter
		e)It must contain at least 1 character different from digits and letters	
		 */
				
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter please password");
		String p=scan.nextLine();
	//a)No space character at the beginning and at the end		
	 boolean NoSpaceBegin=p.startsWith(" ");
	 boolean NoSpaceLast=p.endsWith(" ");
			 
		//		
	int NumberOfDigit= p.replace("\\D", "").length();
	int NumberOfLetters= p.replace("[^a-zA-Z]", "").length();
	int NumberOfOtherChar= p.replace("[a-zA-Z0-9]", "").length();
	if(NoSpaceBegin) {System.out.println("You have used Space at the beginning, please write a valid password");}
	else if(NoSpaceLast) {System.out.println("You have used Space at the end, please write a valid password");}

	else if(NumberOfDigit==0 || NumberOfLetters==0 || NumberOfOtherChar==0) {

	System.out.println("Your password is not valid");	
	}
		
	else {System.out.println("Your password created sucsessufully");	
}
			
			
			
			
			
			
			
			

	}

}
