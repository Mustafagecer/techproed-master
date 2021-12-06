package day05nestedIfTernary;

import java.util.Scanner;

public class MultiTernary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please a number  :");
		
		double y=scan.nextDouble();
		System.out.println((y > 5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3+y));


	}

}
