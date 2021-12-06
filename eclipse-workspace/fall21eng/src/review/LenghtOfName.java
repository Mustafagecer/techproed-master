package review;

import java.util.Scanner;

public class LenghtOfName {
/*Ask user ta enter his/her first and last name. If the first name is longer
output will be “First name is longer.” If the length of last name is equal
To the length of last name output will be “First name and last name
have same length.” Otherwise, output will be “Last name is longer”

*/
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Write please  your first name: ");
			String f=scan.next();

			System.out.println("Write please  your last name: ");
			String l=scan.next();
			
			System.out.println(f.length()>=l.length()?(f.length()>l.length()?"First name is longer.":"First name and last name\r\n"
					+ "have same length."):"Last name is longer");
			
		
			scan.close();
			
			
			
			
			
			
			
			
			
			
	}

}
