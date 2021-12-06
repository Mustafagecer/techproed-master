package day02variablesscanner;

public class Day02WrapperClasses {

	public static void main(String[] args) {
		

		/*
		 Wrapper Class: Non-primitive classes have many useful methods, primitive has not.
		 Having useful is very good
		 Because of that Java created new "non primitive data" types which have method primitive values
		 
		   Primitive Data         Wrapper Class
		      boolean               Boolean
		      
		 
		
		 */
		
		char C1= 'A';
		Character c2= 'B';
		
		System.out.println(c2.charValue());
		
		byte r = 25;
		
		Byte b = 32;
		
		System.out.println(b.MAX_VALUE);
		
		System.out.println(b.MIN_VALUE);
		
		short s1=123;
		
		Short s2=123;
		Short s3= 125;
		
		System.out.println("compare s2 and s3 : " +s2.compareTo(s3));
		
		Integer i1 = 1236;
		System.out.println(i1.MIN_VALUE);
		
		
		Long l1 = 546464l;
		 System.out.println(l1.BYTES);
		 
		 Float f1= 1.65f;
		System.out.println(f1.BYTES);
			
	
		int age=27, height=185, distance=470 ;
		
		System.out.println(age+height);
		
		String BirthDay = "01.01.1989" ;
		
		System.out.println(BirthDay);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
