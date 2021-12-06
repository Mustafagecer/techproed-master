package day10loops;

import java.util.Scanner;

public class FaktorialOfANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to see Factorial of the number...");
	    double num=scan.nextDouble();
	    double fact = 1;
        double i = 1;
        while(i<=num)
        {
            fact = fact * i;
            
            i++;
        }
      
	    System.out.println("Factorial of "+num+" is: "+fact);
	    }
    
	
	}
	

