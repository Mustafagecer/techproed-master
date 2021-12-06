package day10loops;

import java.util.Scanner;

public class LettersTriangle {
	 /*
 	Ask user to enter the number of rows to create following image
 	if user gives you 4;
					 	A1
					 	AB2
					 	ABC3
					 	ABCD4
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer ...");
		int num=Math.abs(scan.nextInt());
		int i=1;
		char c='A';
		
		while(i<=num) {
		for(int j=1; j<=i; j++) {
		System.out.println(c);	
		c++;		
			}
		
			
			i++;
		}
		
		
	}

}
