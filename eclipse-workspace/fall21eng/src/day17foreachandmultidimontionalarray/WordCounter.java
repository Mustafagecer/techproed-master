package day17foreachandmultidimontionalarray;

import java.util.Arrays;

public class WordCounter {

	public static void main(String[] args) {
		/*Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
           For example; if user enters “Java is easy, 
		 * if you study. Nothing is easy, if you do not study” output will be 14.
		 */
	
String s="Java is easy, if you study. Nothing is easy, if you do not study";
String s1=s.replaceAll("\\p{Punct}", "");
System.out.println(s1);
String word[]=s1.split(" ");
System.out.println(Arrays.toString(word));
System.out.println(word.length);

       
/*Find the sum of the elements in the array elements of the given multi dimensional array
{ {1,2,3}, {4,5}, {6,7} } and return an array.
For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
 * 
 */

int arr[][]={ {1,2,3}, {4,5}, {6,7} };
System.out.println();

int sum=0;

for (int [] w:arr) {
	for(int x:w) {
int diveded[]=new int[w.length];


	}

	
}System.out.println(sum);



	}

}
