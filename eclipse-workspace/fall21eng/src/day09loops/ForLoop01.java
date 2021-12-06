package day09loops;

public class ForLoop01 {

	public static void main(String[] args) {
	String s1="Anna Maria";
	String s2=s1.replace(" ", "");
	for(int i=s2.length()-1; i>=0;i--) {
		System.out.print(s2.charAt(i));
	}
	
	for (int i2=0 ; i2<s1.length(); i2++) {
		char c=s1.charAt(i2);
		if(s1.indexOf(c)==s1.lastIndexOf(c)) {
			System.out.print(c);
		}
		
	}

	}

}
