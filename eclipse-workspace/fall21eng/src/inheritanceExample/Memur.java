package inheritanceExample;

public class Memur extends Muhasebe {

	public static void main(String [] args) {
	
	Memur memur1=new Memur();
	memur1.isim="Ali";
	memur1.soyad=" asda";
	memur1.saatUcreti=20;//....
	memur1.maas=memur1.maasHesapla();
	System.out.println(memur1.maas);
	
	
	Memur memur2=new Memur();
	memur2.isim="Mehmet	";
	memur2.soyad=" cvxc";
	memur2.saatUcreti=15;//....
	memur2.maas=memur2.maasHesapla();
	memur2.id=memur2.idAtama();
	
	System.out.println(memur2.maas);
	System.out.println(memur2.idAtama());
		
	}

}
