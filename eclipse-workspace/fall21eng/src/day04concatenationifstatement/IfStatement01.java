package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement01 {
	
	/*If it rains I will cancel the picnic ==>in English
		  If (it rains){I will cancel the picnic}===> in java
		 
		 */

	public static void main(String[] args) {
		//Get a number from user ; If the number is even, print "Even" on the console.
	    
		Scanner scan=new Scanner(System.in);	
		System.out.println("Enter an Integer");
		int num1=scan.nextInt();
		
		if(num1%2==0) {
			System.out.println(num1 +": is even");		
			
//Get a number from user ; If the number is odd, print "Odd" on the console.
		
		}	
			 if(num1%2==1) {
		
			System.out.println(num1 +": is odd");
			
		}
		
			 
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
