package day16ArraysForEachLoop;

import java.util.Arrays;

public class TheSumOfElementsOfArray {

	public static void main(String[] args) {
	//Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
	int[][] a = {
	        {1,1,2}, 
	        {3,1,2}, 
	        {3,5,3}, 
	        {0,1,2}  
	    };
	    int sum=0;
	    for (int i=0; i<a.length;i++){
	      for (int j=0;j<a[i].length;j++){
	        sum+=a[i][j];

	      }
	      System.out.println(sum);
	        sum=0;
	    }
	}

}
