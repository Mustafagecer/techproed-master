package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		//How to check if multiple elements exist in a List
		//["A", "M", "C", "K", "B"] ==> If "A", and "C", and "K" exist in the list
	
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
	
		list1.add("A");
		list1.add("C");
		list1.add("M");
		list1.add("K");
		list1.add("B");
		
		System.out.println(list1);

		list2.add("A");
		list2.add("C");
		list2.add("K");
		
		System.out.println(list1.containsAll(list2));
		
		System.out.println(list1.containsAll(Arrays.asList("M","K","s")));
		
		list1.remove("M");
		list1.add(2, "S");
		
		System.out.println(list1);
		list1.set(0, null);
		System.out.println(list1);
		
		
	}

}
