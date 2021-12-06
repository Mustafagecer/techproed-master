package lambda_functional_programming;

public class Utils {

	public static void printInTheSameLineWithSpace(Object o) {

		System.out.print(o+" ");
		
	}
	public static boolean checkToBeEven(int x) {
		return x%2==0;
	}
	public static boolean checkToBeOdd(int x) {
		return x%2==1;
	}
	public static int getToSquare(int x) {
		return x*x;
	}
	public static int getToCube(int x) {
		return x*x*x;
	}
	public static double getToHalf(int x) {
		return x/2.0;
		
	}
	public static char getLastChar(String str) {
		return str.charAt(str.length()-1);
	}
	public static char getFirstChar(String str) {
		return str.charAt(0);
	}
	public static int sumOfDigits(int x) {
		int sum=0;
		while(x!=0) {
			sum=sum+x/10;
			x=x/10;

		}
		return sum;
	}
}
