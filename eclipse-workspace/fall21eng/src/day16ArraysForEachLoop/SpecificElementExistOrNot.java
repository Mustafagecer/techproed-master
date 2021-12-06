package day16ArraysForEachLoop;

import java.util.Arrays;

public class SpecificElementExistOrNot {

	public static void main(String[] args) {
	
	int arr[]= {2,6334,6,73869,6,2,5,8,0};
//	for (int i=0;i<arr.length;i++) {
//		if(arr[i]==5) {
//			
//			break;
//		}
//		
//		else {
//			System.out.println("The 5 is not exist in the Array");
//		}
//	}
	Arrays.sort(arr);
	System.out.println(Arrays.binarySearch(arr, 6));

	}

}
