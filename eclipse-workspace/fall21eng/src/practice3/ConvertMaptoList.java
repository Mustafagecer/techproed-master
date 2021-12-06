package practice3;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class ConvertMaptoList {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("Honda", 2021);
		map.put("Toyota", 2018);
		map.put("Porche", 2020);
		map.put("Ferrari", 2017);
		map.put("Mercedes", 2013);
		
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
		List alldta=new ArrayList<>(map.entrySet());
		System.out.println(alldta);
		
		for(Entry e:map.entrySet()) {
			String key=(String) e.getKey();
			Object value=e.getValue();
			System.out.println("key: "+key);
			System.out.println("Value "+ value);
		}
		
		
		
				}

}
