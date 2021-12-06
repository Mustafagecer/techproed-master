package day33maps;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;

public class MapsPractice01 {

	public static void main(String[] args) {
	
		String s[]= {"A","Z","A","K","T","K","A"};
		System.out.println(Arrays.toString(s));

HashMap<String, Integer> result = new HashMap<>();// {            }
		
		for(String w : s) {  
			
			Integer numOfOccurence = result.get(w);

			if(numOfOccurence==null) {
				
				result.put(w, 1);
				
			}
			
			else {
				
				result.put(w, numOfOccurence + 1);
				
			}
		
		}
		System.out.println(result);
		for(java.util.Map.Entry<String, Integer> w:result.entrySet()) {
			if (w.getValue()==1) {
				System.out.print(w.getKey()+" ");
			}
		}

	
	
	
	}

}
