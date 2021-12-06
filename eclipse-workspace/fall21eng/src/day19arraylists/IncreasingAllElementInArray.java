package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncreasingAllElementInArray {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(-12);
		list.add(23);
		list.add(25);
		list.add(12);
		list.add(-5);
		list.add(7);
		Collections.sort(list);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
		if(list.get(i)!=7) {
			list.set(i, list.get(i)+3);
			
		}
			
			
				
			}System.out.println(list);
		}

	}


