package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("The lenght and heigt and width of Prisim");
		
		double l=scan.nextDouble();
		double h=scan.nextDouble();
		double w=scan.nextDouble();
		
		System.out.println("The Perimeter of Prisim is:  "+ 2*(l+h+w));
		
		System.out.println("The Area of Prisim is:"+ 2*(l*w+l*h+w*h));
		
		System.out.println("The Volume of Prisim:" + l*w*h);
	}

}
