package day09loops;

public class SumOfDigits {

	public static void main(String[] args) {


	String s="423534648";
	int sumOfUniqeDigits=0;
	
	for (int i=0; i<s.length(); i++) {
		char c=s.charAt(i); 
	if(s.indexOf(c)==s.lastIndexOf(c)) {
		String cs= ""+c;
		sumOfUniqeDigits=sumOfUniqeDigits+Integer.valueOf(cs);
		
	}
		
	}
System.out.print(sumOfUniqeDigits);
	}

}
