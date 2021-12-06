package day15Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class FibonacciSeries {

	public static void main(String[] args) {
//		int a=1;
//		int b=1;
//		int fs;
//		
//		for (int i=0;i<100;i++) {
//		fs=a+b;
//		a=b;
//		b=fs;
//		
//		System.out.print(fs+" ");
		
	int fb[]=new int[102];
	fb[0]=1;
	fb[1]=1;
	
	for(int i=0;i<20;i++) {
		
	fb[i+2]=fb[i+1]+fb[i];
	
	

	System.out.print(fb[i+1]+" ");
	}

	
	System.out.println();
	}

}
