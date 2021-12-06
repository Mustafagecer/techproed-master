package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write please first name..");
		
		String firstName=scan.nextLine();
		
	    System.out.println("Write please middle name..");
		
		String middleName=scan.next();
		
	    System.out.println("Write please first surname..");
		
		String surName=scan.next();

	    System.out.println("Write please first ssn..");
		
		String ssn=scan.next();
		
		System.out.println(firstName +" "+middleName +" " +surName);
		
		System.out.println("Ssn : "+ssn);
	}

}
