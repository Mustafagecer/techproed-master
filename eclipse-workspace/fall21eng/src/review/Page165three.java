package review;

import java.util.ArrayList;
import java.util.List;

public class Page165three {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(5);
		list.set(1, 6);
		list.remove(0);
		for(Integer w:list) {
			System.out.println(w);
		}
		
	}

}
