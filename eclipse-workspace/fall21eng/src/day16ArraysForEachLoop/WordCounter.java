package day16ArraysForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		//Type code to find the number of words in a String
	Scanner scan=new Scanner(System.in);
	System.out.println("Write please a text...");
	String text=scan.nextLine();
	String words[]=text.split(" ");
	System.out.println(Arrays.toString(words));
	System.out.println(words.length + " words are written");

	int counter=0;
	//Count how many words starts with "a"
	for(int i=0;i<words.length; i++) {
		if(words[i].charAt(0)=='a'||words[i].charAt(0)=='A') {
		counter++;
			
		}
		
	}
	System.out.println(counter + " Words start with A or a");
	
	}

}
