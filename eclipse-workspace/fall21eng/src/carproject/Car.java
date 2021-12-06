package carproject;

public abstract class Car {

	public String make;
	public String model;
	public int year;
	public double price;
	static {
		System.out.println("Car is on the way");
	}
	
	public Car( String model, int year, int price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	abstract String carMake();
	abstract String carModel();
	abstract int carYear();
	abstract double carPrice();
	
	
}
