package day06Switch;

import java.util.Scanner;

public class ReplaceAndInteger {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	String p1="$12.99";
	String p2="$25.99";	
    String p3=p1.replace("$","").replace(".", ""); 
    String p4=p2.replace("$","").replace(".", ""); 
	
	System.out.println("Total is : "+ (Integer.valueOf(p3)+Integer.valueOf(p4))/100);
	}

}
