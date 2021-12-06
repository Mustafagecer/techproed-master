package inheritanceex2;

public class Animal {

	
		public void mA() {
			System.out.println("Animal");
		
	}
		public void mM() {
			System.out.println("Animal"+" Mammal");
		
	}
		public int a=7;
		public int m;
		public Animal() {
			System.out.println("Parametresiz animal constracter");
		}
		public Animal(int i) {
			System.out.println("int Parametreli animal constracter");
		}
 
}