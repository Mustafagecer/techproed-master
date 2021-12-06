package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

	/*
	 1)Lambda is a functional programming, we started to use Lambda after Java8 
	 2)F.p focuses on "What to do?" but Structured Programming spends time on "How to do?"
	 3)F.p can be used just with Collection and Arrays
	 4)We cannot use fp in Maps directly. But we can convert map to Sets by using entrySet() then we can use 
	   fp 
	 
	 */
	public static void main(String[] args) {
		//1)Create a method to print the list elements on the console in the same line 
		//with a space between two consecutive elements.(Structured)
	
	List<Integer> l = new ArrayList<Integer>();
	        l.add(12);
	        l.add(9);
	        l.add(131);
	        l.add(4);
	        l.add(9);
	        l.add(10);
	        l.add(4);
	        l.add(12);
	        l.add(15);
	        printElementsStructured(l);
	        System.out.println("  ");
	        functionalMethod(l);
	        System.out.println("  ");
	         functionalEven(l);
	         System.out.println();
	         functionalOddSquare(l);
	         System.out.println();
	         functionalCubeOfDistinctOddNumber(l);
	         System.out.println();
	         theSumOfSqOfDistinctEven(l);
	         System.out.println();
	         theMulOfCubesOfDistinctEven(l);
	         System.out.println();
	         maxValueOfList01(l);
	         System.out.println();
	         maxValueOfList02(l);
	         System.out.println();
	         minValueOfList01(l);
	         System.out.println();
	         minValueOfList02(l);
	         System.out.println();
	         minValueAfter7(l);
	         System.out.println();
	         minValueAfter7secondway(l);
	         System.out.println();
	         getHalfOfDistinctElementsInReversedOrder(l);
	}

	public static void printElementsStructured(List<Integer> list) {
		for (Integer w : list) {
			System.out.print(w+" ");
		}//12 9 131 4 9 10 4 12 15  
		//With f.p
	}
	public static void functionalMethod(List<Integer> list) {
		list.stream().forEach(t-> System.out.print(t+" "));	
		}//12 9 131 4 9 10 4 12 15   

	//2)A method to getting even number
	public static void functionalEven(List<Integer> list) {
		list.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));
	}//12 4 10 4 12
	
	//3)the square of odd numbers
	public static void functionalOddSquare(List<Integer> list) {
		list.stream().filter(t->t%2==0).map(t->t*t).forEach(t->System.out.print(t+" "));
	}//144 16 100 16 144 
	//4)the square of the distinct odd numbers
	public static void functionalCubeOfDistinctOddNumber(List<Integer> list) {
		list.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
	}//729 2248091 3375 
	//5)the square of the sum of distinct even numbers
	public static void theSumOfSqOfDistinctEven(List<Integer> list) {
		Integer sum=list.stream().distinct().filter(t-> t%2==0).map(t->t*t).reduce(0,(t,u)->t+u); 
		System.out.println(sum);	
	}//260
	//6)The mult of the cubes of distinct even 
	public static void theMulOfCubesOfDistinctEven(List<Integer> l) {
		Integer production=l.stream().distinct().filter(t-> t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
		System.out.println(production);
	}//110592000
	//7)Max value from list
	public static void maxValueOfList01(List<Integer> list) {
		Integer max=list.stream().reduce(Integer.MIN_VALUE, (t,u)->t>u?t:u);
		System.out.println(max);
	}//131
	
	
	public static void maxValueOfList02(List<Integer> list) {
		Integer max=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);
		System.out.println(max);
	}//131
	
	//7)Min value from list
		public static void minValueOfList01(List<Integer> list) {
			Integer min=list.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)->t<u?t:u);
		
			System.out.println(min);
		}//4
		
		public static void minValueOfList02(List<Integer> list) {
			Integer min=list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t,u)->u);
			System.out.println(min);
		}
		
		 //8)Min Value after 7
		public static void minValueAfter7(List<Integer> list) {
			Integer minafter7=list.
					stream().
					distinct().
					filter(t->t>7&&t%2==0).
					sorted().
					reduce(Integer.MAX_VALUE,(t,u)->t>u?u:t);
			System.out.println(minafter7);//10
		}
		public static void minValueAfter7secondway(List<Integer> list) {
			Integer minafter7=list.
					stream().
					distinct().
					filter(t->t>7&&t%2==0).
					sorted().
					findFirst().get();
			System.out.println(minafter7);
		}//10
		
		public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list) {
				List<Double> result =list.
					stream().
					distinct().
					filter(t-> t>5).
					map(t->t/2.0).
					sorted(Comparator.reverseOrder()).collect(Collectors.toList());
					System.out.println(result);//[65.5, 7.5, 6.0, 5.0, 4.5]
			
		}
}
