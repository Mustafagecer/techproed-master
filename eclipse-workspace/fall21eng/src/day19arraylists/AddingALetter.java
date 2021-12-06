package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddingALetter {

	public static void main(String[] args) {
		/*
	 	Ask user to enter a letter
	 	If the letter exists in list1 convert it to "Got it"
	 	otherwise add the element which user entered into the list
	 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter...");
		String i=scan.next();
		
		List<String> list1=new ArrayList<>();
		list1.add("A");
		list1.add("K");
		list1.add("S");
		list1.add("T");
		list1.add("Z");
		
		if (list1.contains(i)) {
			
		list1.set(list1.indexOf(i), "Got it");
		   
				
			
		}
		else {
			list1.add(i);
			
		}
		System.out.println(list1);
	}

}
