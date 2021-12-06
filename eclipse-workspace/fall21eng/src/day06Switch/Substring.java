package day06Switch;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please write a String");
	String name=scan.nextLine();
	
	System.out.println("The last 4 terms of written word is:  " +name.substring(name.length()-4));

	
	}

}
  