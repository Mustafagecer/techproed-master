package day16ArraysForEachLoop;

import java.util.Arrays;

public class Arrays01EqualArrays {

	public static void main(String[] args) {
	int arr1[]= {5,12,32,11};

	int arr2[]= {5,12,32};

	int counter=0;
	if(arr1.length==arr2.length) {

		for(int i=0; i<arr1.length;i++) {
			if (arr1[i]!=arr2[i]) {
				counter++;
				break;
				
			}}
			
			if(counter==1) {
				System.out.println("The Arrays are not  same");
				
			}else {
				System.out.println("The Arrays are same");
			}
	
	}else {
		System.out.println("The lenght of Arrays are not same.");
	}
		System.out.println(Arrays.equals(arr1, arr2));
	
	}

}
