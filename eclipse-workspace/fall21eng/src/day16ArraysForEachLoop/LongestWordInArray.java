package day16ArraysForEachLoop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongestWordInArray {

	public static void main(String[] args) {
		// Find the longest word in a STring
		Scanner scan=new Scanner(System.in);
		System.out.println("Write please a text...");
		String text=scan.nextLine();
		String words[]=text.split(" ");
		Arrays.sort(words,Comparator.comparingInt(String::length));
		
		System.out.println(Arrays.toString(words) );
		
		

		
	}

}
