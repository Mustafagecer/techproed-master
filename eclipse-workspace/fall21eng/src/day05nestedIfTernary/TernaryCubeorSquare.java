package day05nestedIfTernary;

import java.util.Scanner;

public class TernaryCubeorSquare {

	public static void main(String[] args) {
		/*Ask user to enter a number. If the number is less than 10 and greater
than or equal to 0, calculate its cube. Otherwise, calculate its square.
		 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please  a number  ");

		int a=scan.nextInt();
		
		System.out.println(a>=0&&a<10?"The cube of Entered number is "+a*a*a:"The square of Entered number is "+a*a);

		scan.close();
	}

}
