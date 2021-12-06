package day15Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Write please lenght of Array: ");
		int lenght =scan.nextInt();
		String sArr[]=new String[lenght];
		
		for(int i=0;i<lenght;i++) {
			System.out.println("Enter "+(i+1)+". element");
			sArr[i]=scan.next();		
			
		}
		//Arrays.sort(sArr);
		System.out.println(Arrays.toString(sArr));
		
		//Make the second element first, first element last, last element second
		//[Ali, Veli, Samil, Kemal] ==> [Veli, Kemal, Samil , Ali]
		String s1[]=new String[lenght];
		s1[0]=sArr[lenght-1];
		s1[1]=sArr[0];
		s1[lenght-1]=sArr[1];
	for(int i=0;i<lenght;i++) {
	if (i==0||i==1||i==(lenght-1)) {
		continue;
		
	}
	s1[i]=sArr[i];
	
		
	}
		
		
		
		
		
		
		
		
		
		
		 
		
	}

}
