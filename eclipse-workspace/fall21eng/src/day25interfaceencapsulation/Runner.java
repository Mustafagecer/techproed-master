package day25interfaceencapsulation;

public class Runner {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.bacteriaKiller();
		car1.climateAc();
		car1.electronicAc();
		car1.havingHybridEngine();
		
		
		
		System.out.println(AirCondition.MAKE);
		System.out.println(HybridEngine.MAKE);

	}

}
