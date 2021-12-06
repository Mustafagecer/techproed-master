package review;

public class IntReverse {

	public static void main(String[] args) {
	int x=12345678;
	String s=Integer.toString(x);
 
	System.out.println(s);
	String reverse="";
	
	for (int i=s.length()-1;i>=0;i--) {
	reverse=reverse+s.charAt(i);	
	}
	System.out.println(reverse);
	}

}
