package review;

import java.util.Scanner;

public class Substing {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the word");
		String w=scan.next().toLowerCase();
		if (w.contains(" ")) {
			System.out.println("Write please a word without space");
		}
		if(w.length()%2==0) {
			System.out.println("The length of word is not ann odd number");
		}
		if(w.length()%2==1) {
			System.out.println(w.charAt((w.length()-1)/2));
		}
	}

}
