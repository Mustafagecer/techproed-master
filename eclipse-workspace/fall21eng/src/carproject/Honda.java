package carproject;

public class Honda extends Car{
	
	String make="Honda";
	String model="Accord";
	int year=2012;
	double price=8000;
	
	static {
		System.out.println("Honda is on the way");
	}
	
	

	public Honda(String model, int year, int price) {
		super(model, year, price); 
	
		this.model=model;
		this.year=year;
		this.price=price;
		
		
	}

	@Override
	String carMake() {
		// TODO Auto-generated method stub
		return "Car make: "+this.make;
	}

	@Override
	String carModel() {
		
		return "Car model: "+ this.model;
	}

	@Override
	int carYear() {
		// TODO Auto-generated method stub
		return this.year;
	}

	@Override
	double carPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}


	}
	


