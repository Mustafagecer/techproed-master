package day22inheritance;
/*
 1)Private class can not be used by child classes 
 2)Default class members can be used by child classes if the child class in the same package
 3)Protected class members can be used by child classes 
 4)Public class members can be used by child classes 
 5)To use "static class" members, no need to create object,use the by class name
 6)super(); is for calling parent constructor
 Java will put it as default but it will be invisible
super(); must be in the first line of the constructor
  8)"this()" and "super()" must be in the first line
   inside a constructor so "this()" and "super()" cannot
	 be used at the same time in a Constructor.
	9)Java does not support "multiple inheritance".
	A child class cannot have multiple parents				
 */
public class Animal {

	public Animal(){
		super();
		
		System.out.println("Animal Construcctor..");
	}
	int age;
	public void eat() {
		System.out.println("They eat...");
	}
	public void drink() {
		System.out.println("They drink...");
	}
	
}
