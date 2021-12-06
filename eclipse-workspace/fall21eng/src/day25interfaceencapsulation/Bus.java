package day25interfaceencapsulation;

public class Bus implements AirCondition {

	@Override
	public void electronicAc() {
	
		System.out.println("The Bus AC is semi-electronic...");
	}

	@Override
	public void climateAc() {
	
		System.out.println("The Bus AC is not climate AC...");
	}

	@Override
	public void bacteriaKiller() {
		System.out.println("The Bus AC ikills %85 bacteria...");
		
	}

	@Override
	public void run() {
		System.out.println("The Bus AC runs perfeckt..");
	}

	@Override
	public void havingHybridEngine() {
		// TODO Auto-generated method stub
		
	}

}
