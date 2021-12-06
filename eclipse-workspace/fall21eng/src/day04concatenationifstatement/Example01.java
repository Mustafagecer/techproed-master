package day04concatenationifstatement;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Write please an integer");
		int i=scan.nextInt();
		
		if (i%2==0) {
			System.out.println(i+" is even");
			
		}else {
			System.out.println(i + " is not even");
			
			scan.close();
		}

	}

}
