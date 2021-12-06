package day09loops;

public class ExampleSumOfDigit {

	public static void main(String[] args) {

	int sumOfDigits=0;
	for(int i=12345678; i>0;i=i/10) {
		int digits=i%10;
		
		sumOfDigits=sumOfDigits+digits;
		
		
	}
	System.out.println(sumOfDigits);	

	}

}
