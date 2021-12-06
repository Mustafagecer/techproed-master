package Maps;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> mp1=new Hashtable<>();
		mp1.put(101, "HashTable");
		mp1.put(102, "uniqe");
		mp1.put(103, "ve");
		mp1.put(104, "en hizlidir");
		mp1.put(105, "siralama");
		mp1.put(106, "rastgeledie");
		mp1.put(107, "null kabul etmez");
		mp1.put(102, "en hizlidir");
		mp1.put(91, "nasil yani?");
		System.out.println(mp1);

		//mp1.put(null, "ali");//java.lang.NullPointerException
	}

}
