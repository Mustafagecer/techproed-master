package inheritanceex2;

public class Mammal extends Animal {

	public void mA() {
		System.out.println("Mammal");
	
}
	public void mC() {
		System.out.println("cat"+" Mammal");
	
}
	public int c=5;
	public int m=4;
	
	public Mammal() {
		this('a');
		System.out.println("p'siz mammal cons.");
	
	}
	public Mammal(char c) {
		super(34);
		
		System.out.println("char p'li mammal cons.");
	
	}
}
