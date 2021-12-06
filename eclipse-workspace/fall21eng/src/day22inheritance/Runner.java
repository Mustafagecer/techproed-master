package day22inheritance;

public class Runner {

	public static void main(String[] args) {
		
		
		Dog dog1=new Dog();
		dog1.age=20;
		
		System.out.println(dog1.age);
		dog1.drink();
		dog1.eat();
		dog1.feedWithMilk();
		dog1.bark();

	}

}
