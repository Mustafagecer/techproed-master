package inheritanceex2;

public class Runner {

	public static void main(String[] args) {
	Cat c1 =new Cat();
	System.out.println(c1.a);//7 Animal
	System.out.println(c1.c);//2 Kendisinden
	System.out.println(c1.d);//Kendisinden
	System.out.println(c1.m);//Mammal
	
	c1.mM();
	c1.mC();
	c1.mA();
	
	Mammal c2=new Cat();
	System.out.println(c2.a);
	System.out.println(c2.c);
	System.out.println(c2.m);
	
	c2.mA();
	c2.mC();
	c2.mM();
	
	
	
	}

}
