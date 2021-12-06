package day10loops;

import java.util.Scanner;

public class StarsTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        String s="**********************";  
		String c="";
		
        for(int i= s.length()-1; i>=0; i--) {
        
        c=c+s.charAt(i);
        
        	System.out.println(c);
        }
		}

}
