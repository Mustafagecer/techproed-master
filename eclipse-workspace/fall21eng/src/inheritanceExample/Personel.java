package inheritanceExample;

public class Personel {

	public static int  sayac=1000;
	public int  id;
	public String isim ;
	public String soyad ;
	public String adres;
	public String tel;
	
	public int idAtama() {
		this.id=sayac;
		sayac++;
		return id;
		
	}
}
