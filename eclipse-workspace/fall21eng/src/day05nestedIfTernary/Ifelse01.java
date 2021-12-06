package day05nestedIfTernary;

import java.util.Scanner;

public class Ifelse01 {
	
	/*
	 Type java code by using nested if() statement.
	Write a program to check if a year is leap year or not.
	If the year is divisible by 100 then it must be divisible by 400.
	If a year is not divisible by 100 then it must be divisible by 4.
	
	
	1) && —> “And” operator
	                             If 0 is false and 1 is true,
                                 “&&” operation is similar to multiplication of 0 and 1
	true && true = true
	true && false = false
	false && false = false
	
	 */

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Write please a year to learn if it is leap or not");
		int i=scan.nextInt();
		
		if (i>0&& i%100==0 && i%400==0) {System.out.println(i+"It is leap year");
		
		
		}
		
		else if (i>0&& i%100!=0 && i%4==0) {
			System.out.println(i+"It is leap year");
			
		
		}
		
			else {
				System.out.println("It is not leap year");
			}
		
	
	
	scan.close();
	}
		
			
	}


