package day16ArraysForEachLoop;

import java.util.Arrays;

public class FindingInitialOfNamesInAText {

	public static void main(String[] args) {
		// Get the initials of student names from given String
		String text="Ali Can, Mehmet Kara, Sami Mücteba eve gitmek istiyor.";
		
		String words[]=text.split(", ");
		System.out.println(Arrays.toString(words));
		
		String initial="";
		for (int i=0; i<words.length; i++) {
			
	    initial=words[i].substring(0, 1)+words[i].substring(words[i].indexOf(" ")+1, words[i].indexOf(" ")+2);
	    System.out.print(initial+" ");
		}

	}

}
