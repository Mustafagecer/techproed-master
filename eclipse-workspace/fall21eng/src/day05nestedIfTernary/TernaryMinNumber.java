package day05nestedIfTernary;

import java.util.Scanner;

public class TernaryMinNumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please first number  ");

		int a=scan.nextInt();
	
		System.out.println("Enter please  second number  ");

		int b=scan.nextInt();

	     System.out.println(a>b ? b:a);
		
		scan.close();
	}

}
