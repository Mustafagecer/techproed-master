package review;

public class Student {

	
		int number=2;
		String name="Ali";
		static String college ="ITS";
		Student(int r, String n, String college){
		this.number = r;
		this.name = n;
		this.college = college;
		}
		public static void main(String args[]){
		Student s1 = new Student(111,"Karan", "MIT");
		Student s2 = new Student(222,"Aryan", "Harvard");
		System.out.println("s1 num: "+s1.number);
		System.out.println("s2 num: "+s2.number);
		System.out.println("s1 name: "+s1.name);
		System.out.println("s1 name: "+s2.name);
		System.out.println("s1 c: "+s1.college);
		System.out.println("s1 c: "+s2.college);
		}
		}