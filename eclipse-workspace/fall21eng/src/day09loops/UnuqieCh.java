package day09loops;

import java.util.Scanner;

public class UnuqieCh {

	public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	System.out.println("Write please a text: ");
	String text=scan.next();
	
	for(int i=0;i<=text.length()-1;i++) {
		char c=text.charAt(i);
		
	if(text.indexOf(c)==text.lastIndexOf(c)) {
		System.out.print(c);
			
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
