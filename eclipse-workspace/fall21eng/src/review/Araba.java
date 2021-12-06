package review;

public class Araba {

	String model;
	String renk;
	private int yil;
	private int motor;
	public Araba() {}
	public Araba(String model, String renk, int yil, int motor) {
		super();
		setModel(model);
		setMotor(motor);
		setRenk(renk);
		setYil(yil);
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getYil() {
		
		return yil;
	}
	public void setYil(int yil) {
		if(yil<0) {
			System.out.println("Yil negatif olamaz. Bunu mu demek istediniz?"+(-1)*yil);
		}
		this.yil = yil;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		if(motor<0) {
			System.out.println("Motor negatif olamaz. Bunu mu demek istediniz?"+(-1)*motor);
		}else {
			this.motor = motor;
		}
		
	}
	
}
