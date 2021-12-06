package review;

import java.util.Scanner;

public class HalfOfWort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word,which even ch has");
		String word=scan.next();
		if(word.length()%2==1) {
			System.out.println("The given word has not even ch. Please enter a word,which even ch has");
			
		}else {
			String half=word.substring(0, (word.length()+1)/2);
			System.out.println("The half of String is: "+half);
		}

	}

}
