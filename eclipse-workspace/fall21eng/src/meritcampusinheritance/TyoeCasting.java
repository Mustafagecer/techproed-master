package meritcampusinheritance;

public class TyoeCasting {

	 public static void main(String s[])
	    {
	        A a = new A();
	        a.i = 21;
	        B b = new B();
	        b.i = 43;
	        b.j = 25;

	        a = convertToA(b);

	        System.out.println("i = " + a.i); // LINE X
	    }

	    public static A convertToA(B b1)
	    {
	        return b1; // LINE Y
	    }
	}

	class A
	{
	    int i;
	}

	class B extends A
	{
	    int j;
	}


