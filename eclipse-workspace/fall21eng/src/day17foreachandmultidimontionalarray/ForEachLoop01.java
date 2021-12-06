package day17foreachandmultidimontionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// Find the vowels in a String by using arrays
		String s="Learn Java, earn money.";
		String letters[]=s.split("");
		System.out.println(Arrays.toString(letters));
		for(String w:letters) {
			if(!(w.equalsIgnoreCase("a")|| w.equalsIgnoreCase("e")|| w.equalsIgnoreCase("i")|| w.equalsIgnoreCase("o")|| w.equalsIgnoreCase("u"))) {
				System.out.print(w+" ");
				}}System.out.println("=================");
		//Print the words ending with "n"
		String words[]=s.split(" ,");
		System.out.println(Arrays.toString(words));
		
		for(String l:words) {
		if(l.endsWith("n")||l.endsWith("N")) {
			
		}System.out.println(l+" ");
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter please an integer..");
		String i=scan.next();
		String arr[]=i.split("");
		
System.out.println(Arrays.toString(arr));
			System.out.println();
		int sum=0;
		for (String w:arr) {
			sum=sum+Integer.valueOf(w);
			
		}
	System.out.println("The sum of digits of the given integer is..."+sum);

	scan.close();

	}

}
