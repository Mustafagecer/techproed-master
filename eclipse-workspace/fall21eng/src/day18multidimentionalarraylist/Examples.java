package day18multidimentionalarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Examples {

	public static void main(String[] args) {
		//How to declare an ArrayList

		ArrayList<Integer> list1=new  ArrayList<Integer>() ;
	    List<Integer> list2=new  ArrayList<Integer>() ;      list2.add(-5);
	    List<Integer> list3=new  ArrayList<>() ;
	    list1.add(3);list1.add(0); list1.add(30);
	    list1.add(3); list1.add(-3); list1.add(8); list1.add(-6);  list1.add(13); list1.add(-39);
	    
	    list1.addAll(list2);
	    System.out.println(list1);
	   // list1.clear();
	    System.out.println("After clear..."+ list1);//After clear...[]
	    list1.clone();
	    System.out.println("After clone..."+ list1);
	    System.out.println(list1.containsAll(list2));
	    
	    System.out.println(list1.get(6));
	    list1.add(4, -8);
	    
	    System.out.println(list1);
	    System.out.println(list1.contains(20));
	    
	    
	    
	    
	    
	}

}
