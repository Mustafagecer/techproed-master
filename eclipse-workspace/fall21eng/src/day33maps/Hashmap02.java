package day33maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Hashmap02 {

	public static void main(String[] args) {
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
		System.out.println(str);
		
		str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

		
		String letters[] = str.split("");
		
		
		HashMap<String, Integer> result = new HashMap<>();// {            }
		
		for(String w : letters) {  //[java, is, easy, type, codes, to, learn, java, to, earn, money, learn, java]
			
			Integer numOfOccurence = result.get(w);
			
			//If the word does not exist in the map "if-body" will be executed
			if(numOfOccurence==null) {
				
				result.put(w, 1);
				
			}
			//If the word exists in the map "else-body" will be executed
			else {
				
				result.put(w, numOfOccurence + 1);
				
			}
			
		}System.out.println("Before TreeMap: "+result);
		TreeMap<String, Integer> result2 = new TreeMap<>();
		
		result2.putAll(result);
		
		System.out.println("After TreeMap: "+result2);//{codes=1, java=3, money=1, learn=2, earn=1, is=1, to=2, type=1, easy=1}
		
	}


}
