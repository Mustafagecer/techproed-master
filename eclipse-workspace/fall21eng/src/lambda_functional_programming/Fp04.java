package lambda_functional_programming;


import java.util.Scanner;
import java.util.stream.IntStream;

public class Fp04 {

	public static void main(String[] args) {
		
		
//		List<Integer> l = new ArrayList<Integer>();
//        l.add(12);
//        l.add(9);
//        l.add(13);
//        l.add(4);
//        l.add(9);
//        l.add(2);
//        l.add(4);
//        l.add(12);
//        l.add(15);
System.out.println(getSumFromSevenToHundred01());
System.out.println(getSumFromSevenToHundred02());
System.out.println(getMultiplicationFrom2To11());
//System.out.println(getFactorialOfGivenNumber());
//System.out.println(getSumOfTheEvenNumberBetweenTwoGivenNumbers());
System.out.println(findSumOfDigitsForTheIntegersInTheGivenRange());
	}

	public static int getSumFromSevenToHundred01() {
		return IntStream.range(7, 101).reduce(0, Math::addExact);
		
	}
	public static int getSumFromSevenToHundred02() {
		return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
		
	}
	public static int getMultiplicationFrom2To11(){
		return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
		
	}
	public static Object getFactorialOfGivenNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int number=scan.nextInt();
		return number>0? IntStream.rangeClosed(1, number).reduce(1, Math::multiplyExact) : "The given number must be positive";
	
	}
	
	public static int getSumOfTheEvenNumberBetweenTwoGivenNumbers() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1=scan.nextInt();
		System.out.println("Please enter second number");
		int number2=scan.nextInt();
		return number2>number1 ? IntStream.rangeClosed(number1, number2).filter(Utils::checkToBeEven).reduce(0, Math::addExact)
				: IntStream.rangeClosed(number2, number1).filter(Utils::checkToBeEven).reduce(0, Math::addExact);
		
	}

	//5)Create a method to calculate the sum of digits of every integers between given two integers
	//  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68
	
		public static int findSumOfDigitsForTheIntegersInTheGivenRange() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1=scan.nextInt();
		System.out.println("Please enter second number");
		int number2=scan.nextInt();
		return  IntStream.rangeClosed(number1, number2).map(Utils::sumOfDigits).reduce(0, Math::addExact);
		
	}





}
