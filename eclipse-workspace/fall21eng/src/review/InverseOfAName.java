package review;

import java.util.Scanner;

public class InverseOfAName {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word which has 4 letters : ");
		String i=scan.next();
		
		System.out.println(i.charAt(3)+""+i.charAt(2)+""+i.charAt(1)+""+i.charAt(0));

	}

}
