package day10loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	
	/*Type java code by using while loop,
Write a program that prompts the user to input a positive intege
it should then print the multiplication table of that number
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Please the Number: ");
	int num=scan.nextInt();	
	int i=1;
	while (i<11) {
	
	System.out.println(num+"x"+i+"="+i*num);	
		
	i++;
	}
	
		
		
	}

}
