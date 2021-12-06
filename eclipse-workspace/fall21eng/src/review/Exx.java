package review;

import java.util.Arrays;

public class Exx {
	
	public static void main(String[] args) {


//	String word=" ): muroyiveS koooooooooc iziS  ";
//	
//	String reverse="";
//	
//	for (int i=word.length()-1; i>=0; i--) {
//		reverse=reverse+word.charAt(i);
//	System.out.println(reverse);}


	int arr[][]=  { {1,2,3}, {4,5}, {6,7} };
	int sum[]= new int[arr.length];
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
		sum[i]+=arr[i][j];
		
			
			
		}
		
		
	}System.out.println(Arrays.toString(sum));
	}

}
