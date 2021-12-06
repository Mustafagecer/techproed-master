package review;

import java.util.Scanner;

public class NameAndCreditCard {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=scan.next();
		System.out.println("Please enter your creditcard number");
		String n=scan.next();
		
		
		name= namecontrol(name);
		n=creditcardcontrol(n);
System.out.println(n);
	}


		
	

	public static String creditcardcontrol(String n) {
		n=n.replaceAll("\\s+","");
		if(n.length()==16) {
			for(int i=4;i<n.length();i+=4) {
				n=n+" ";
				
			}
		}else {
			System.out.println("The given number has not 16 digits");
		}
		
		return n;
	
		
	}





	private static String namecontrol(String name) {
		
		
		
		return name;
		
		
	}

}
