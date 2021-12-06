package day13statickeyword;
//Type a code to count the number objects created from Students class 
public class Students {
 
	public String name ;
	public int age;
	public static int numberOfStudents;
	
	public Students() {
		this.name= "Ali Can";
		this.age=12;
		numberOfStudents++;
		
	}
	public Students (String name, int age) {
	
		this.name=name;
		this.age=age;
		numberOfStudents++;
		
	}
	
	public Students(String name) {
		this.name=name;
		
	}
	public static void main(String[] args) {

		System.out.println("Before: "+ numberOfStudents);
		 Students std1=new Students();
		 System.out.println("After:  "+numberOfStudents);

	}

}
