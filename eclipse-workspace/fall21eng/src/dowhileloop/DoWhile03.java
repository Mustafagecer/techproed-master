package dowhileloop;

public class DoWhile03 {
	/*
	 For the String "1234_?!abcdef", type a code to count the number of letters, 
	 the number of digits and the number of others by using do-while loop
*/
	public static void main(String[] args) {
	
     String s="1234_?!abcdef";
     s=s.toLowerCase();
     
     int l=0;
     int d=0;
     int o=0;
     int idx=0;
	do {
		if(s.charAt(idx)>='a' &&s.charAt(idx)<='z') {
		l++;	
		}else if(s.charAt(idx)<='9' &&s.charAt(idx)>='0') {
		d++;	
			
		}else {
			o++;
		}
		
		idx++;
	}
	while(idx<s.length());
	System.out.println("Letters: "+l);
	System.out.println("Digits: "+d);
	System.out.println("Others: "+o);
	
	
	
	
	
	
	
	
	}

}
