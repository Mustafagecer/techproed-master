package Maps;

import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		String ad[]= {"ahmet","ahmet can","haluk"};
		String soyad[]= {"seref","erdem","bilgin"};
		
		HashMap<String, String> adSoyad=new HashMap<String, String>();
		
		for(int i=0;i<ad.length; i++) {
			adSoyad.put(ad[i], soyad[i]);
		}
		System.out.println(adSoyad);
	}

}
