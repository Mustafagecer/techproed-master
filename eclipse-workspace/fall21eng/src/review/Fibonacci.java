package review;

public class Fibonacci {

	public static void main(String[] args) {
	int f=0;
	int s=1;
	int fib=0;
	
	
	for(int i=0;i<=10;i++) {
		System.out.println(f);
		f=s;
		fib=s+f;
		System.out.print(fib);
	}

	}

}
