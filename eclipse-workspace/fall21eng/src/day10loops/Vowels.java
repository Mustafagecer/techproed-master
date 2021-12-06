package day10loops;

import java.util.Iterator;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
		
	System.out.println("Enter a Text");
	String text=scan.next();
	
	int index=0;
	
	while (index<text.length()) {
		
		if(text.charAt(index)=='a'|| text.charAt(index)=='e'|| text.charAt(index)=='o'||
				text.charAt(index)=='u'|| text.charAt(index)=='i') {
		
			System.out.print(text.charAt(index));
		}
		
		
		index++;
		
	}
		
		
		
		
		
		
	}

}
