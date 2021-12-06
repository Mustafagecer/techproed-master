package day10loops;

import java.util.Scanner;

public class TriangleRow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows...");
		int NumberOfRow=scan.nextInt();
		
		for(int i=2*NumberOfRow;i>=1; i--	) {
			for(int k=1; k<i+1; k++) {
				System.out.print("* ");
				
				
			}
			System.out.println();
		}
		
		
		scan.close();
		
		
	
	}

}
