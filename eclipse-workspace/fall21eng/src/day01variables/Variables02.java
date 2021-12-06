package day01variables;

public class Variables02 {

	/*
	 * DAta Types in Java
	 * there are 2 main data types
	 * 
	 * 1) Primitive Data Types;
	 * 
	 * a)boolean: It has 2 different values which are "true" and "false"
	           Every boolean variable uses a singles bit in memory
	           booleans have "false" as default value
	   
	   b)char : Its used for single characters
	             Value must be put between single quotes 'S'
	             Every char uses 16 bits in the memory
	   c)byte: itis used for whole numbers between -128 and 127
	            it uses 8 bit memory
	            
	   d)short
	   e)int
	   f)long
	   g)float
	   h)double
	   
	   Note: '=' is used to assign value to a variable
	         '==' is used to compare 2 values if they Are equal each other
	         
	         '!=' means 'not equal to'
	   
	 
	 * 
	 */
	public static void main(String[] args) {
	
	
		boolean isExpensive= true;
		boolean isOld= false;
		
		char initialOfFirstName = 'S';
		char initialOfLastName = 'A';
				
		System.out.println(initialOfFirstName);
		
		System.out.println(initialOfFirstName + 'A');
		
		System.out.println(initialOfFirstName> 'B');
		System.out.println(initialOfFirstName ==83);
		
		System.out.println(initialOfFirstName !=5);
		
		System.out.println(initialOfFirstName >initialOfLastName );
		
		System.out.println(initialOfFirstName /initialOfLastName );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
