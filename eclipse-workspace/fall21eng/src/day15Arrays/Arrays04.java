package day15Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays04 {

	public static void main(String[] args) {
// Sort the String array elements in ascending order according to their lengths.
	
	String arr[]= {"ali","Mustafa","veli","mehmet","kamil",};

Arrays.sort(arr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
	System.out.println(Arrays.toString(arr));
	
	
	
	
	
	}

}
