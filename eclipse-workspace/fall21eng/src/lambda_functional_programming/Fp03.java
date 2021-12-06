package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Fp03 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
        l.add("Ali"); l.add("Ali");l.add("Mark");l.add("Amanda");l.add("Christopher"); 
        l.add("Alberto");l.add("Tucker"); l.add("BenjamiN");l.add("Jackson"); l.add("Mariano");

        System.out.println(l);
        System.out.println();
        printUpperCase(l);
        System.out.println();
        orderAccordingToLengthCase(l);
        System.out.println();
        sortingDistingElementsAccordingToLastChar(l);    
        System.out.println();
        printSortedByLengthFirstThenSortedByInitial(l);
        System.out.println();
        removeIfTheLengthIsGreaterThanFive2(l);
        System.out.println();
//        removeIfElementsStartingAaOrEndingNn(l);
//        System.out.println();
//        removeIfElementsStartingAaOrEndingNn2(l);
//        System.out.println();
        removeIfLengthOfElementsBtw8and10orEndingWithO(l);
        System.out.println();
        removeIfLengthOfElementsBtw8and10orEndingWithI(l);
        System.out.println();
        System.out.println(chechTheLengthOfAllElementLessThan12(l));
        System.out.println(checkTheElementWhichDontStartWithX(l));
        
      System.out.println(checkTheAnyElementWhichEndingtWithr(l));
        
	}//printUpperCase
	public static void printUpperCase(List<String> list) {

		list.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);
	}
	//orderAccordingToLengthCase
	public static void orderAccordingToLengthCase(List<String> list) {

		list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInTheSameLineWithSpace);
	}
	
	//sortingDistingElementsAccordingToLastChar
	public static void sortingDistingElementsAccordingToLastChar(List<String> list) {
		
		list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printInTheSameLineWithSpace);;
		
	}
	//5) Create a method to sort the elements according to their lengths then according to their first character
		public static void printSortedByLengthFirstThenSortedByInitial(List<String> list) {
			list.stream().sorted(Comparator.comparing(String::length).thenComparing((Utils::getFirstChar))).forEach(Utils::printInTheSameLineWithSpace);;
		}
		//6) Remove the elements if the length of the element is greater than 5
		public static void removeIfTheLengthIsGreaterThanFive(List<String> list) {
			
			list.removeIf(t->t.length()>5);
			
			System.out.println(list);
			
		}
		
		public static void removeIfTheLengthIsGreaterThanFive2(List<String> list) {
			
			list.stream().filter(t->t.length()<6).forEach(Utils::printInTheSameLineWithSpace);
		}
		public static void removeIfElementsStartingAaOrEndingNn(List<String> list) {
			list.removeIf(t->t.charAt(0)=='a'||t.charAt(0)=='A'||t.charAt(t.length()-1)=='n'||t.charAt(t.length()-1)=='N');
			
			System.out.println(list);
		}
		public static void removeIfElementsStartingAaOrEndingNn2(List<String> list) {
			list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n "));
			
			System.out.println(list);
		}
		
		public static void removeIfLengthOfElementsBtw8and10orEndingWithO(List<String> list) {
			list.removeIf(t->t.length()<11 && t.length()>7||t.endsWith("o")||t.endsWith("O"));
			System.out.println(list);
		}
		public static void removeIfLengthOfElementsBtw8and10orEndingWithI(List<String> list) {
			
			Predicate<String> checkCondition=t->t.length()<11 && t.length()>7||t.toLowerCase().endsWith("i");
			list.removeIf(t->checkCondition.test(t));
			System.out.println(list);
		}
		//chechTheLengthOfAllElementLessThan12
		public static boolean chechTheLengthOfAllElementLessThan12(List<String> list) {
			return list.stream().allMatch(t->t.length()<12);
			
		}
		public static boolean checkTheElementWhichDontStartWithX(List<String> list) {
			return list.stream().noneMatch(t->t.startsWith("X"));
			
		}
		
		public static boolean checkTheAnyElementWhichEndingtWithr(List<String> list) {
			return list.stream().anyMatch(t->t.toUpperCase().endsWith("r"));
			
		}
		
	}