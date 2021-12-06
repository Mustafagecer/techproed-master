package day08loops;

public class SumOfOddsNumber {

	public static void main(String[] args) {
      
		int i, sum = 0;
 
        for(i = 33; i <= 200; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between 33 to 200 is : " + sum);
        
//        Write a program to multiply counting numbers from 7 to 15 by using for-loop.
//        Print the multiplication on the console
        
        int first=7;
       
        for (first=7 ; first<=15; first++  ) {
        	int multiply=1;
        	multiply*=first;
        	
        	
        	
        }
        
        
    }
	}


