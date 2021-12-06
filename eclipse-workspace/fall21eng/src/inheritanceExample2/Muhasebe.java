package inheritanceExample2;

public class Muhasebe extends Personel{

	public int saatucreti;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		
		maas=saatucreti*8*30;
		return maas;
		
	}

	
}
