package day07StringMAnupulation;

import java.util.Scanner;

public class AbrevationOfName {

	public static void main(String[] args) {
/*Write a program that takes your full name as input and displays the abbreviations 
  of the first and middle names except the last name 
  which is displayed as it is. For example, if your name is Robert Brett Roser,
  then the output should be R.B.Roser.
 */
		
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter please your fullname");
	String name=scan.nextLine();
	char fn=name.charAt(0);
	char mn=name.charAt(name.indexOf(" ")+1);
	String ln=name.substring(name.lastIndexOf(" ")+1);
	System.out.println(""+fn+"."+mn+"."+ln);
	
	
	
	
	
	
	
	
	}

}
