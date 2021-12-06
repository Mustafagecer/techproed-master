package review;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Please enter two numbers..."
	 		+ "First Number..");
	 int f=scan.nextInt();
	 System.out.println("Please enter second number...");
	 int s=scan.nextInt();
	 System.out.println("Please enter the operation type: Addiotion is A, Subtraction is S, "
	 		+ "Division is D, Multiplication is M...");
	String o=scan.next().toLowerCase();
	
	 if (o.equalsIgnoreCase("a")) {
		 System.out.println(f+s);
		 }
	 if (o.equalsIgnoreCase("s")) {
		 System.out.println(f-s);
		 }
	 if (o.equalsIgnoreCase("m")) {
		 System.out.println(f*s);
		 }
	 if (o.equalsIgnoreCase("d")) {
		 System.out.println(f/s);
		 }
	 else {
		 System.out.println("You should enter just a or s or m or d");
	 }

	}

}
