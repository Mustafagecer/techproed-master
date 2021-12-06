package constructor;

public class C01 {

	public int ilanNo;
	public String marka;
	public String model;
	public int yil;
	public int fiyat;
	
	public void hizMetodu(int hiz) {
		System.out.println("Araba"+hiz+" km hiz yapabilir");
	
	}
	public void  yakit(String yakitTuru) {
		System.out.println("Araba yakit olarak "+ yakitTuru+"kullanir");
		
	}
	
	
	
	C01(){
		
	}
	public C01(int ilanNo, String marka, String model, int yil, int fiyat) {
		super();
		this.ilanNo = ilanNo;
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.fiyat = fiyat;
	}
	
}
