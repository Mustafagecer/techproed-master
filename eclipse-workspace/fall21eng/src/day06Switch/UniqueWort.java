package day06Switch;

import java.util.Scanner;

public class UniqueWort {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string...");
	String str = scan.nextLine();
	
	char c='a';
	
	int f=str.indexOf(c);
	int l=str.lastIndexOf(c);
	
	if (f==-1) {
		System.out.println(c+" doesnt exist inside the String");
	} else if (f==l) {
		System.out.println(c+ " is unique");
	}else {System.out.println(c + " is not unique");
	 
	
	
	}

}}
