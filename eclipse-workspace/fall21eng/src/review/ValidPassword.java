package review;

import java.util.Scanner;

public class ValidPassword {

	public static void main(String[] args) {
		/*7)
Ask user to enter password, if the password is okay for the following conditions output will be
“Your password is created successfully.” If the password is not okay for any of the following conditions
Output will be “Enter a new password according to the give conditions”
1.First letter must be uppercase
2.Last letter must be lowercase
3.Password must contain 6 characters		 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Password which has\r\n" 
				
				+ "1.First letter must be uppercase\r\n"
				+ "2.Last letter must be lowercase\r\n"
				+ "3.Password must contain 6 characters : ");
		String p=scan.next();

		System.out.println(p.length()==6 && p.charAt(0)>='A'&&p.charAt(0)<='Z'
		&& p.charAt(5)>='a'&&p.charAt(5)<='z'?
		"Your password is created successfully.":
		"Enter a new password according to the give conditions");
	
	
	}

}
