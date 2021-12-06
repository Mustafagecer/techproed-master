package day15Arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
	
	//Create a String array and print the elements in alphabetical order on  the console in different lines
	String sArr[]=new String[5];
	System.out.println(Arrays.toString(sArr));
	sArr[0] = "Ali";
	sArr[1] = "Bekir";
	sArr[2] = "Zehra";
	sArr[3] = "Yasin";
	sArr[4] = "Mary";
	System.out.println(Arrays.toString(sArr));//[Ali, Bekir, Zehra, Yasin, Mary]
	
	//How to sort array elements
	Arrays.sort(sArr);
	System.out.println(Arrays.toString(sArr));//[Ali, Bekir, Mary, Yasin, Zehra]
	
	//How to print arrays alements one by one
	
	for (int i=0; i<sArr.length; i++) {
		System.out.println(sArr[i]);
	}
	
	
	
	
	}

}
