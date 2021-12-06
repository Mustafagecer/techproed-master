package day03scannerincrementdecrement;

import java.util.Scanner;

public class ModulusOperator01 {
     // % means remainder of division
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Write please the bigger number");
		int i1=scan.nextInt();
		System.out.println("Write please the little number");
		int i2=scan.nextInt();
		
		int w=i1%i2;
		int l= i1+i2;
		
		System.out.println("Area of Rectangle : "+ w*l);
		System.out.println("Perimeter of Rectangle : "+ 2*(w+l));
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
