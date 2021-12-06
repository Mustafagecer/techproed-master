package day05nestedIfTernary;

import java.util.Scanner;

public class AbsoluteTernary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please first number  ");

		int a=scan.nextInt();

		int result= a>0?a:(-1*a);
		System.out.println(result +" is absolute value of " +a);
		scan.close();

	}

}
