package day10loops;

import java.util.Scanner;

public class FactorOfANumber {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an integer to see Factors of the given  number...");
	int num=scan.nextInt();
	int i=1;
	

	while (i<=num) {
	
	if (num%i==0) {
	System.out.print(" "+i);
		
	}
		
		i++;
		
	}
	

	
	}

}
