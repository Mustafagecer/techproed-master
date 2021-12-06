package day33maps;

public class InterwievQuestion {

	public static void main(String[] args) {
	
		String s="Java is very very easy";
		s=s.replaceAll("\\s", "");
		System.out.println(s);
		
		int counter = 0;
		char c='a';
		if(s.indexOf(c)==s.lastIndexOf(c)) {
			System.out.println(-1);
		}else {
			for(int i=s.indexOf(c)+1; i<s.lastIndexOf(c);i++) {
				counter++;
				
			}
		}System.out.println(counter);
		
		
	
	}

}
