package abstractinsanExample2;

public class BenimHesabim extends Banka {


	@Override
	public
	double paraYatir(double miktar) {
		
		super.bakiye+=miktar;
		
		return bakiye;
	}

	@Override
	public double paraCek(double miktar) {
		super.bakiye-=miktar;
		
		return bakiye;
	}

	public BenimHesabim(double bakiye) {
		super.bakiye=bakiye;
		System.out.println(bakiye);
	}
}
