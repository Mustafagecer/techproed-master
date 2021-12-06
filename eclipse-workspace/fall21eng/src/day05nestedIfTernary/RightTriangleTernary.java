package day05nestedIfTernary;

import java.util.Scanner;

public class RightTriangleTernary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please the first leg of Triangle  ");

		double a=scan.nextDouble();
	
		System.out.println("Enter please  the second leg of Triangle   ");

		double b=scan.nextDouble();
		
		System.out.println("Enter please  the hypotenus of Triangle   ");

		double c=scan.nextDouble();
		
		 
		
		System.out.println(a*a+b*b==c*c? "It is a Right Triangle" : "It is not a Triangle");
		
		scan.close();
	}

}
