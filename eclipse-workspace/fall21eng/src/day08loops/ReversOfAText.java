package day08loops;

import java.util.Scanner;

public class ReversOfAText {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Write please a word");

		String s=scan.next();
		
		for(int i=s.length()-1; i>=0 ; i-- ) {
		
		
				System.out.print(s.charAt(i));

		}}

}
