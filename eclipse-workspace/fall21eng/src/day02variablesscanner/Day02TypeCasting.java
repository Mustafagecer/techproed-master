package day02variablesscanner;

public class Day02TypeCasting {

	
	/*
	 Type Casting: We want to convert a number primitive data type to another number primitive type
	 Number primitive Data types : byte < short < in < long < float< double
	
	 
	 */

	public static void main(String[] args) {
		
		
		/*
	Auto Widening type Casting: If you change small primitive data to larger,
	 it is called Auto Widening Type Casting
	 
		 */
		 byte b1 = 12;
		 short s1 = b1;
		 System.out.println(s1);
		 
		 double d1 = 2.34;
		 
		 /*
		  Explicit Narrowing Type Casting : If you change large primitive data to smaller,
	 it is called Explicit Narrowing Type Casting
		  */
		 float f2 = (float) d1;
		 
		 long l1 = 300;
		 
		 byte b2 = (byte) l1;
		 
		 System.out.println(b2);
		 
		 /*
		  How to convert "primitive data type" to "Wrapper class"
		    int====>Integer            Integer====>int
		    
		    If you convert primitive to wrapper it is called "Auto Boxing" 
		*/
		 
		 int i2=123;
		 
		 Integer i2Wrapper= i2;
		 
		 //If you convert wrapper to primitive it is called "unboxing"
	
		 Integer i3Wrapper= 456;
		 int i3 = i3Wrapper;
		 
		 
		 
				 
		
	}

}
