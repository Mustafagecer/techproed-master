package Maps;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {
		HashMap<Integer, String> mp1=new HashMap<>();

		
		mp1.put(102, "uniqe");
		mp1.put(106, "key'e");
		mp1.put(104, "hizlidir");
		mp1.put(105, "siralama");
		mp1.put(101, "HashMap");
		mp1.put(107, "göredir");
		mp1.put(103, "ve");
		mp1.putIfAbsent(null, "null bir kere kabul edilir.");
		System.out.println(mp1); 
		
		System.out.println(mp1.get(103));
		System.out.println("key set: "+mp1.keySet());
		System.out.println("value set: "+mp1.values());
		
		System.out.println(mp1.getOrDefault(107, "böyle bir eleman yok"));
		System.out.println(mp1.getOrDefault(115, "default cevap : böyle bir eleman yok"));
		
		System.out.println(mp1.putIfAbsent(103, "putIfabsent"));
		System.out.println();
		System.out.println(mp1.putIfAbsent(109, "putIfabsent")+"     "+mp1);
		
		  
	}

}
