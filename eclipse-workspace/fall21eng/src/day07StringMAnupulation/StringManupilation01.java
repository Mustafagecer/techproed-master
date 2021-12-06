package day07StringMAnupulation;

import java.util.Scanner;

public class StringManupilation01 {

	public static void main(String[] args) {
	//Type code to find number of space ch in a String
	Scanner scan= new Scanner(System.in);
	
	/*
 	Regex(Regular Expression): Regex is used to declare a group of characters
 	i) All lower case letters ==> [a-z]
 	ii)All upper case letters ==> [A-Z]
 	iii)All upper case and lower case letters ==> [a-zA-Z]
 	iv)All characters different from space character ==> \\S
 	v) Space character ==> \\s
 	vi)All characters different from digits ==> \\D
 	vii)All digits ==> \\d
 	viii) Non alphabetical characters ==> [^a-zA-Z]
 	ix) Characters from a to z, from A to Z, form 0 to 9, and _ ==> "\\w"
 	x) Characters different from a to z, A to Z, 0 to 9, and _ ==> "\\W"
 */
//	System.out.println("Write Please a Task");
	//1)Type code to find the number of space characters in a String
//	String s=scan.nextLine();
//	String s2=s.replaceAll("\\S", "");
//	System.out.println(s2.length());
//
//	String s3=s.replace("\\s", "");
//	System.out.println(s3.length());
	
//	String d=s.replaceAll("\\D", "");
//	System.out.println("All Numbers in the Task ; "+d);	
//	System.out.println("All Letters in the Task ; "+s.replaceAll("[^a-zA-Z]", ""));
//	System.out.println("All others ch in the Task ; "+s.replaceAll("[a-zA-Z0-9]", ""));
//		
		
	/*
	4)Check the password according to the given rule
		a)No space character at the beginning and at the end
		b)It must contain at least 1 digit
		c)It must contain at least 1 lowercase letter
		d)It must contain at least 1 uppercase letter
		e)It must contain at least 1 character different from digits and letters
*/		
		
		System.out.println("Enter please a valid password");
		String p=scan.next();
		boolean FirstCharSpace=p.startsWith(" ");
		System.out.println(FirstCharSpace);
		boolean EndCharSpace=p.startsWith(" ");
		System.out.println(EndCharSpace);
		int numOfDigit=p.replaceAll("\\D","").length();
		int numOfLowerChar=p.replaceAll("[^a-z]","").length();
		int numOfUpperChar=p.replaceAll("[^A-Z]","").length();
		int numOfOtherChar=p.replaceAll("[A-Za-z0-9]","").length();
		if (FirstCharSpace||EndCharSpace) {
			System.out.println("Dont use Space at the end or beginning");
		}
		
		if (numOfDigit==0) {
			System.out.println("Your password doesnt contain Number");
		}
		
		if (numOfLowerChar==0) {
			System.out.println("Your password doesnt contain lowercase");
		}
		if (numOfUpperChar==0) {
			System.out.println("Your password doesnt contain Uppercase");
		}
		if (numOfOtherChar==0) {
			System.out.println("Your password doesnt contain Numbers");
		}else {
			System.out.println("It is a Valid password");
		}

	}

}
