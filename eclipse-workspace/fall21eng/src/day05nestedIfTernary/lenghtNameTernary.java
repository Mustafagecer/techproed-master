package day05nestedIfTernary;

import java.util.Scanner;

public class lenghtNameTernary {

	public static void main(String[] args) {
		//(name.length() > 3) ? (name.contains(“i”) ? “Veli” : “No name”) : (“Ali”);
		Scanner scan=new Scanner(System.in);
		String name= scan.next();

		 
		 
		System.out.println(name.length()>3?(name.contains("i")? "Veli":"No Name"):"Ali");
	
         System.out.println(name.equals("Ali")?(name.charAt(0)=='A'?"Good":"Bad"):"The Worst");   
	
	
	}

}
