package review;

import java.util.ArrayList;
import java.util.Arrays;

public class BiggestElementOfArray {

	public static void main(String[] args) {
		int arr[]= {2,8,9,-4,-72,69};
		int n=Integer.MIN_VALUE;
		Arrays.sort(arr);;
		System.out.println(Arrays.toString(arr));//[-72, -4, 2, 8, 9, 69]
	    
	
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=arr.length-1; i>=0;i--) {

			list.add(arr[i]);
		}
		System.out.println(list);
		
		for (int w:arr) {
			if(n<w) {
				n=w;
			
				
			}
		}System.out.println("The biggest number of Array is; "+n);
	}

}
