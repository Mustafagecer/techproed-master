package Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Example02 {

	public static void main(String[] args) {

		String str="Ali come to School. Ayse went to school!";
		String kelime[]=str.split(" ");
		System.out.println(Arrays.toString(kelime));
		kelimeSay(str);
	}

	public static void kelimeSay(String str) {
		
		HashMap<String,Integer> map=new HashMap<>();
		
		String kelime[]=str.split(" ");
		
		for(int i=0;i<kelime.length;i++) {
			if(map.containsKey(kelime[i])) {
				map.put(kelime[i], map.get(kelime[i])+1);
				
			}else {
				map.put(kelime[i], 1);
			}
		}
		System.out.println(map);
	}
}
