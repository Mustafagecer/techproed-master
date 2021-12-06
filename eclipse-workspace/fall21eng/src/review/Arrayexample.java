package review;

import java.util.Arrays;
import java.util.Comparator;

public class Arrayexample {

	public static void main(String[] args) {


	String arr[]= {"asdasd","htznb","4546","wrgrthbf","asaefwe"};

	Arrays.sort(arr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
	System.out.println(Arrays.toString(arr));
	
	
	int arr1[]= {5,4,0,6,9,0,0,7,8,9,2,4,4542,};
	for(int i=0;i<arr1.length; i++) {
		if(i!=0) {
			
		}
		System.out.println(Arrays.toString(arr1));
	}
	
	
	
	
	
	}

}
