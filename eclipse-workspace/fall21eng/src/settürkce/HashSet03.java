package settürkce;

import java.util.HashSet;

public class HashSet03 {

	public static void main(String[] args) {
		HashSet<Double> hs1=new HashSet<>();
		hs1=setOlustur();
		System.out.println("metod dan aktarilan hashset: "+hs1);
		double sonuc=toplaminiAl(setOlustur());
	
		System.out.println("metod dan elemanlar toplaniyor: "+sonuc);

	}

	public static HashSet<Double> setOlustur(){
		HashSet<Double> hs2=new HashSet<>();
		hs2.add(3.23);
		hs2.add(3.10);
		hs2.add(5.12);
		hs2.add(10.12);
		hs2.add(23.12);
		System.out.println("metod icinde olusturulan hashset: "+hs2);
		
		return hs2;
	}
	public static double toplaminiAl(HashSet<Double> dhs){
		double toplam=0;
		for(double topla:dhs) {
			toplam+=topla;
			
		}
		return toplam;
		
	}

}
