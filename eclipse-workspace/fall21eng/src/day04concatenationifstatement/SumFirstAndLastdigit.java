package day04concatenationifstatement;

import java.util.Scanner;

public class SumFirstAndLastdigit {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Write please a number which have 4 digits");
		int a=scan.nextInt();
        int f = a%10;
        int l= a/1000;
        
		System.out.println("The sum of first and last digits is :" +(f+l));
	

		scan.close();
	}

}
