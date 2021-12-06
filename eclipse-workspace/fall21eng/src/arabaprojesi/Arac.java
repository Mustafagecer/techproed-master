package arabaprojesi;

public class Arac {
	private String renk;
	private int motor;
	protected String model;
	
	public void Arac(){
		
	}

	public Arac(String renk, int motor, String model) {
		setMotor(motor);
		setModel(model);
		setRenk(renk);
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
