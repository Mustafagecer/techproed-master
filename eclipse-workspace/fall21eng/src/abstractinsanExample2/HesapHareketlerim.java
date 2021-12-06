package abstractinsanExample2;

public class HesapHareketlerim {

	public static void main(String[] args) {
		BenimHesabim bh =new BenimHesabim(2000);
		System.out.println("Para cektikten sonra bakiye: "+bh.paraCek(2000));
		System.out.println("Para yattiktan sonra bakiye: "+bh.paraYatir(3500));
		
	}

}
