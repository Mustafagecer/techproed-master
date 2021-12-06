package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
	/*Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
	 */
		int arr1[][] = { {1,2,3}, {4,5}, {6,7} };
		int arr2[] = new int[arr1.length];
		
	
		
		for(int i=0; i<arr1.length; i++) {
			int sum = 0;
			for(int k=0; k<arr1[i].length; k++) {
				sum = sum + arr1[i][k];	
				arr2[i] = sum; 
			}
			
		}
		System.out.println(Arrays.toString(arr2));
}}
