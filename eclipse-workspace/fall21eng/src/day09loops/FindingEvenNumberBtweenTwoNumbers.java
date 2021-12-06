package day09loops;

import java.util.Iterator;
import java.util.Scanner;

public class FindingEvenNumberBtweenTwoNumbers {

	public static void main(String[] args) {
//Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter Please First Number");
	int f=scan.nextInt();
	System.out.println("Enter Please Second Number");
	int s=scan.nextInt();

	for(int i=f;i<=s;i++) {

	if(i%2==0 && f<s) {
		System.out.print(" "+i);
	}
	}
	}

	
	}


