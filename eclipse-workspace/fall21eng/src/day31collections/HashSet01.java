package day31collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSet01 {

	public static void main(String[] args) {
	HashSet<String> hs1= new HashSet<>();
	
	hs1.add("K");
	hs1.add("K");

	hs1.add(null);
	hs1.add(null);
	
	HashSet<String> hs2= new HashSet<>();
	
	hs2.add("K");
	hs2.add(null);
	

	System.out.println(hs1.equals(hs2));//true
	
	hs1.remove(null);
	System.out.println(hs1);//[K]
	
	//Type code to display ArrayList element just once
	//EX: ArrayList: [5,3,2,6,5,2,-5]==>[5,3,2,6,-5]
	
	List<Integer> l1 =new ArrayList<>();
	l1.add(5);
	l1.add(3);
	l1.add(2);
	l1.add(6);
	l1.add(5);
	l1.add(2);
	l1.add(-5);
	
	HashSet<Integer> hs3= new HashSet<>();
	
	hs3.addAll(l1);
	
	System.out.println(hs3);
	
	}

}
