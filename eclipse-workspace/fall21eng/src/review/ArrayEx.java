package review;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
	
	String arr[]= {"Ali", "Veli","Hasan","Kamil","Mehmet"};
	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr));
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
	System.out.println("============");
	
	for(int a=arr.length-1; a>=0;a--) {
		System.out.println(arr[a]);
	}
	
	
	
	
	
	}
	}

}
