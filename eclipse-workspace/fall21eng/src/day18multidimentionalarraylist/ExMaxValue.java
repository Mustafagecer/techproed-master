package day18multidimentionalarraylist;

public class ExMaxValue {

	public static void main(String[] args) {
	int arr[][] = { {1,2}, {6, 7, -9, 110}, {3,4,5 }};

	int i=Integer.MAX_VALUE;
	for(int[] w:arr) {
	for(int x:w) {
		if (i>x) {
			i=x;
			
		}
	}
	}
	System.out.println(i);
	
	
	
	
	
	}

}
