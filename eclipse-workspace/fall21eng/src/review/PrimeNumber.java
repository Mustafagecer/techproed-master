package review;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please write a number");
		int num =scan.nextInt();
		int counter =0 ;
		
		if(num<=1) {
			System.out.println("Please write a number which is greather than 1");
		}
		for(int i=2;i<num;i++) {
			
			
			if (num%i==0) {
				counter++;
				}}
		if (counter>0) {
			System.out.println(num +" is not prime number");
			
			
		}else {
			System.out.println(num +" is prime number");
			
		}
	}

}
