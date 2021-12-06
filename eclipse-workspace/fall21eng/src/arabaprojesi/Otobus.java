package arabaprojesi;

public class Otobus extends Arac {

	int yolcuSayisi;
	
	public Otobus(String renk, int motor, String model) {
		super(renk, motor, model);
		this.yolcuSayisi=yolcuSayisi;
		
	}

	@Override
	public String toString() {
		return "Otobus [yolcuSayisi=" + yolcuSayisi + ", model=" + model + ", getRenk()=" + getRenk() + ", getMotor()="
				+ getMotor() + ", getModel()=" + getModel() + "]";
	}

	
	
}
