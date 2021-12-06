package day18multidimentionalarraylist;

import java.util.Arrays;

public class MultidimentionalArray {

	public static void main(String[] args) {
		//Convert a 2 dimensional array to 1 dimensional array
		int arr[][] = { {1,2}, {6, 7, 9, 110}, {3,4,5 }};
		int x=Integer.MIN_VALUE;
		for(int[] w:arr) {
		for(int y:w) {
			if (x<y) {
				x=y;
			}
		
		}
		}
			System.out.println(x);
	
	int sum=0;
	for (int[] w:arr) {
		sum=sum+w.length;
		}
		int brr[]=new int[sum];
		int idx=0;
		
		for (int[] w:arr) {
		for(int x1:w) {
			brr[idx]=x1;
			idx++;
		}
			
		}
		System.out.println(Arrays.toString(brr));
		
		Arrays.sort(brr);
		System.out.println(Arrays.toString(brr));
		System.out.println(brr[brr.length-1]);
		
	}

}
