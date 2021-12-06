package review;

import java.util.Scanner;

public class ByteExample {


	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("number?");
		int i=scan.nextInt();
		
		tekMiCiftMi(i);
		
	}

	public static void tekMiCiftMi(int i) {
		if (i%2!=0) {
			System.out.println(i+" is an odd number");
		}else {
			System.out.println(i+" is an even number");
		}
		
	}
	

}
