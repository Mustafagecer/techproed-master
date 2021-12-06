package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Fp02 {
	
	/*
	 	1)In functional programming we can use "lambda expressions" but if using "method reference" is possible
	 	  using "lambda expressions" is not recommended
	 	2) Method Reference is like "Class Name :: Method Name" 
	 	   For Example               String     :: length (Be careful we do not use method parenthesis in method reference)
	 */

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        
        printElements(l);
        System.out.println();
        printEvenElements(l);
        System.out.println();
        squareOfOddElemenets(l);
        System.out.println();
        cubeOfDistinctOddElemenets(l);
        System.out.println();
        theSumOfSqOfDistinctEven(l);
        System.out.println();
        maxValueOfList(l);
        System.out.println();
        minValueOfList(l);
        System.out.println();
        minValueOfListAfter7(l);
        System.out.println();
        getHalfOfDistinctElementsInReversedOrder(l);
	} 
	
	//1)Create a method to print the list elements on the console in the same line with a space 
	//  between two consecutive elements.(Functional)
	public static void printElements(List<Integer> list) {
		list.stream().forEach(Utils::printInTheSameLineWithSpace);
	}
	//Even number From the list
	public static void printEvenElements(List<Integer> list) {
		list.stream().filter(Utils::checkToBeEven).forEach(Utils::printInTheSameLineWithSpace);
              	
	//Square of odd elements from a list
 	
    }
    public static void squareOfOddElemenets(List<Integer> list) {           
	
    	list.stream().filter(Utils::checkToBeOdd).map(Utils::getToSquare).forEach(Utils::printInTheSameLineWithSpace);
   } 
    //4)the cube of the distinct odd numbers
    	
     public static void cubeOfDistinctOddElemenets(List<Integer> list) {           
	
    	list.stream().filter(Utils::checkToBeOdd).distinct().map(Utils::getToCube).forEach(Utils::printInTheSameLineWithSpace);
   } 
   //5)the square of the sum of distinct even numbers
 	public static void theSumOfSqOfDistinctEven(List<Integer> list) {
 		Integer sum=list.stream().
 		distinct().
 		filter(Utils::checkToBeEven).
 		map(Utils::getToSquare).
 		reduce(0,Math::addExact);
 		System.out.println(sum);
	
 	}
    
 	//7)Max value from list
 	public static void maxValueOfList(List<Integer> list) {
 	
 	int max=list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);	
 	System.out.println(max);
 	}
 	public static void minValueOfList(List<Integer> list) {
 	 	
 	 	int min=list.stream().distinct().reduce(Integer.MAX_VALUE,Math::min);	
 	 	System.out.println(min);
 	 	}
 	
    public static void minValueOfListAfter7(List<Integer> list) {
 
    	int minAfter7=list.stream().filter(t->t>7).filter(Utils::checkToBeEven).reduce(Integer.MAX_VALUE,Math::min);
    	System.out.println(minAfter7);
    }
    public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list) {
		
		List<Double> result =(List<Double>) list.stream().
		distinct().
		filter(t->t>5).
		sorted(Comparator.reverseOrder()).
		map(Utils::getToHalf).collect(Collectors.toList());
		System.out.println(result);
    }
    
    
 

}