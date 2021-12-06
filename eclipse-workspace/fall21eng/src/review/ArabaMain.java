package review;

public class ArabaMain {

	public static void main(String[] args) {
	Araba volvo=new Araba("xc90", "beyaz", -3000, -2020);
	Araba audi=new Araba("Q7", "bej", 2000, 2019);
	Araba honda=new Araba();

	honda.model="accord";
	honda.renk="gri";
	honda.setYil(2000);
	honda.setMotor(1400);
	System.out.println("Honda yil: "+honda.getYil());
	System.out.println("Honda motor: "+honda.getMotor());
	System.out.println("Volvo yil: "+volvo.getYil());

	
	}

}
