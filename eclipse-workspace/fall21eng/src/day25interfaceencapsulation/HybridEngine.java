package day25interfaceencapsulation;

public interface HybridEngine {

	String MAKE="Honda Eco";
	void havingHybridEngine();
	void run();
	public default int power() {
		System.out.println("Hybrid engines are inreasing their powers...");
	
		return 1000;
		
	}
	public static String model() {
		System.out.println("The best model...");
		return "The Best...";
		
	}
}
