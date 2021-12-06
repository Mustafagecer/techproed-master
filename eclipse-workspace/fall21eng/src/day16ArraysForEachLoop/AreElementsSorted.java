package day16ArraysForEachLoop;

import java.util.Arrays;

public class AreElementsSorted {

	public static void main(String[] args) {
	String s1[]= {"S","A","T"};
	String s2[]=Arrays.copyOf(s1, s1.length);
	Arrays.sort(s1);
	if(s1.equals(s2)) {System.out.println("The Array is sorted");}
	else {
		System.out.println("The Array is not sorted");
	}
	}

}
