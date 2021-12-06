package day04concatenationifstatement;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Write please the lenght of Rectanngle..");

		int l=scan.nextInt();
		System.out.println("Write please the windth of Rectanngle..");
		int w=scan.nextInt();
		
		if(l==w) {
			System.out.println("It's a Square");
			
		}else {
			System.out.println("It's not a Square");
		}
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
	}

}
