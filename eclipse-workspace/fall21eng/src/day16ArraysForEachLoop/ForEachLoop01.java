package day16ArraysForEachLoop;

import java.util.Arrays;

public class ForEachLoop01 {

	public static void main(String[] args) {

		//for-each-loop is the best to use
		
		//for-each-loop can be used with the containers which have multiple elements so 
		//for-each-loop can be used with arrays
		
		
		//Get the total number of characters in the elements
		String s[] = {"Ali Can"," given", "array", "if", "Veli Han", "Mary Star"};

		//Do it by using for-loop
		
		int sum=0;
		for(int i=0; i<s.length; i++) {
		sum=sum+s[i].length();
		
		}
		System.out.println("Total of the chracter is "+sum);
		
		//Do it by using for-each-loop
		int sum2=0;
		
		for(String w:s) {
			sum2=sum2+w.length();
		}
		System.out.println("Total of the chracter is "+sum2);
		
		//Print all elements in the given array if the elements has more than 6 characters
		String s3="Print all elements in the given array if the elements has more than 6 characters";
		String x[]=s3.split(" ");
		//System.out.println(Arrays.toString(x));
		
		for(String w:x) {
			if (w.length()>6) {
				System.out.print(w+" ");

}}
		
//Print to common elements for 2 arrays
		int arr1[] = {11, 21, 33};
		int arr2[] = {33, 34, 11, 54, 23, 22};
	for (int a:arr1) {
	for(int b:arr2) {
		if (a==b) {
			System.out.print(a+" ");
		}
	}
	}
		
	}

}
