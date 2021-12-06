package day02variablesscanner;

public class Day02VariablesMemory {

	public static void main(String[] args) {
	
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
		   c)byte: it is used for whole numbers between -128 and 127
		           it uses 8 bit memory
		           if you are not sure the value will be between -128 and 127,
		            don't use byte data type
		 

           d)short; between -32768 and 32767
                   
                    if you are not sure the value will be between -32768 and 32768,
		            don't use byte data type
		   
		   
		   e)int: whole numbers and -2,147,483,648 and 2,147,483,647
		          it uses 32 bits from memory
		          Most of time we are using int
		          
		   
		   f)long:whole numbers and -9,220,372,036,854,755,808 and 9,220,372,036,854,755,807
		          it uses 64 bits from memory
		          Note: Every whole number is "int" for Java as default.
		          when you create a "long" variable, you have to put "L" or "l" to the end to inform Java,
		          the number is not int it is long. Otherwise you will get error
		   
		   
		   g)float: It used decimal numbers
		            it uses 32 bits from memory
		            you can have 7 digits in decimal part most
		            
            Note: Every decimal number is "double" for Java as default.
		          when you create a "float" variable, you have to put "F" or "f" to the end to inform Java,
		          the number is not double it is float. Otherwise you will get error    		   
		   
		   
		   h)double:It used decimal numbers
		            it uses 64 bits from memory
		             you can have 16 digits in decimal part most
		   
		   Note: '=' is used to assign value to a variable
		         '==' is used to compare 2 values if they Are equal each other
		         
		         '!=' means 'not equal to'
		   
		 Note: If all values in an operation is integer the result will be integer in Java
		  If the result is decimal in Math ,Java converts the decimal to integer just by removing decimal part. 
		  Java do not do "rounding" operation 
		 2)Non-Primitive Data Type
		 
		 a)String: is used for multiple character
		
		
		Note: What is the difference between "primitive and non-primitive" data types?
		       a) Primitive data type names are typed just by using lower cases, but non-primitive data types use upper case at the beginning.
               b) Primitive data types are just 8, but non-primitive data types are unlimited.
               c)Primitive data types were created by Java, we cannot create primitive data type. But non-primitive data types can be created by Java and by developers.
               d)Primitive data types are stored in "Stack Memory" and non-primitive data types are stored in "Heap Memory" 
		       ****e)Primitive data types have just "values" in them. But non-primitive ones have "values" and "methods" in them
		  
		 */
		
		byte age = 12;
		
		System.out.println("Age:" + age);
		
		short population = 250;
		System.out.println(population);
		
		int profit=200000000;
		System.out.println("profit: €" + profit);
		
		
		long numberOfCellsInHuman = 1232456789123456L;
		System.out.println("The number of cells in a human: " + numberOfCellsInHuman);
		
		float f = 1.2f;
		System.out.println("f: " + f);
		
		double d = 2.4;
		System.out.println("d= " + d);
		
		String stdName = "Ali Can";
		
		System.out.println(stdName.toLowerCase());
		System.out.println(stdName.contains("d"));
		
		
		
		
		
	}

}
