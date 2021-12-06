package Maps;

import java.util.Hashtable;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer, String> mp1=new TreeMap<>(); 
		mp1.put(101, "TreeMap");
		mp1.put(107, "null kabul etmez");
		mp1.put(103, "ve");
		mp1.put(91, "nasil yani?");
		mp1.put(105, "siralama");
		
		mp1.put(104, "en yavastir");
		mp1.put(102, "en hizlidir");
		mp1.put(106, "dogal sirayla ");
	
		mp1.put(102, "uniqe");
		
	
		System.out.println(mp1);
	}

}
