package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingClosest2Integer {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(-12);
		list1.add(23);
		list1.add(25);
		list1.add(12);
		list1.add(-5);
		System.out.println(list1);
	
		Collections.sort(list1);
		System.out.println(list1);

		int d=Integer.MAX_VALUE;
		for(int i=1;i<list1.size();i++) {
			d=Math.min(d, list1.get(i)-list1.get(i-1));
		}	
		for(int i=1;i<list1.size();i++) {
		if(list1.get(i)-list1.get(i-1)==d) {
			System.out.println("The closest numbers in the List are "+list1.get(i)+" and "+list1.get(i-1));
		
		}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
