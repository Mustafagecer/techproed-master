package day25interfaceencapsulation;

import javax.swing.text.Highlighter;

public abstract class ElectricalVehicles implements AirCondition {

	@Override
	public void climateAc() {
		System.out.println("The electrical vehicle climate AC...");
	}

	@Override
	public void run() {
		System.out.println("The electrical vehicle is the best...");
		
	}


	public abstract void electronicAc() ;

}
