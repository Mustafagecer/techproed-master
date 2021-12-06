package sett�rkce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet01 {

	public static void main(String[] args) {
		HashSet<String> hs1=new HashSet<>
		(Arrays.asList("icin","HashSetde","Siralama","olmadigi","icin","gelisig�zel","siralar"));
		System.out.println(hs1);//[olmadigi, HashSetde, siralar, gelisig�zel, icin, Siralama]
		
		String arr[]= {"Arraylisti","liste","ceviren","bir","method","yaz"};
		ArrayList<String> list=new ArrayList<String>();
		list=cevir(arr);
		
		System.out.println("Arrayden olusturulan list olusturuldu: "+ list);
		TreeSet<String> hs2=new TreeSet<>(list);
		
		System.out.println("Arrayden olusturulan listler TreeSetle d�zenleniyor: "+hs2);
		LinkedHashSet<String> hs3=new LinkedHashSet<>(list);
		System.out.println("Arrayden olusturulan listler LinkHashSetle d�zenleniyor: "+hs3);
		HashSet<String> hs4=new HashSet<>(list);
		System.out.println("Arrayden olusturulan listler HashSetle d�zenleniyor: "+hs4);
	}
	
	public static ArrayList<String> cevir(String []arr) {

		ArrayList<String> ArrList=new ArrayList<String>();
		for(String w:arr) {
			ArrList.add(w);
		
		}
		
		return ArrList;

}
}
