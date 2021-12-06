package day26exceptions;

public class Exception01 {

	public static void main(String[] args) {
	

		System.out.println(division(12,3));
		
	
	//	System.out.println(division(12,0));b 
		
		int arr[]= {2,3,6,7,1,5};
		System.out.println(addTwoConsecutiveArrayElements(arr,1));		//There is no exception
		System.out.println(addTwoConsecutiveArrayElements(arr,5));
			System.out.println("Zaman");
			}
	
public static  double division (int a ,int b) {
	return a/b;
	
}
public static int addTwoConsecutiveArrayElements(int arr[],int index) {
	return arr[index]+arr[index+1];
	

			
}
}
