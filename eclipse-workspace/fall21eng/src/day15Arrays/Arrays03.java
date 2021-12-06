package day15Arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//put the zeros at end of an Array
	int arr[]= {2,0,-1,6,0,8};
	int brr[]=new int[arr.length];
	int idx=0;
	
	for (int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
		brr[idx]=arr[i];
		idx++;
	
	}}
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(brr));	
	
	
	}

}
