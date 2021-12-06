package interfaceturkce;

public class Sahin extends Tofas
implements icDonanim, Lastik{

	@Override
	public void motor() {
	
		System.out.println("1.6 aile motorudur");
	}

	@Override
	public void yakit() {
	System.out.println("Tüp takmazsan cook yakar");
		
	}

	@Override
	public void ayna(String turu) {
		
		System.out.println("Ayna dis ve ic donanim interfaceden geldi..");
	}

	@Override
	public void kapi() {
		
		System.out.println("Kapi dis donanim interfaceden geldi..");
	}

	@Override
	public void kaporta() {
		
		System.out.println("kaporta di  s donanim interfaceden geldi..");
	}

	@Override
	public void koltuk() {
		System.out.println("Koltuk ic donanim interfaceden geldi..");
		
	}

	@Override
	public void ebat() {
		System.out.println("16 inc lastik ebati vardir");
		
	}

	@Override
	public void jant() {
		System.out.println("celik jant kullanilmistir");
		
	}

	
}
