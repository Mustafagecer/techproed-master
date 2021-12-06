package abstractinsanExample;

public abstract class Insan {

	private String isim;
	private String soyisim;
	
	
	public Insan(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}

	public abstract void calis();
	
	public void bilgilendirme() {
		System.out.println("concrete bilgilendirme methodu calisti=======>"+this.isim+" "+this.soyisim);
	}
	public void isimDegeistirme(String isim, String soyisim) {
		this.isim=isim;
		this.soyisim=soyisim;
		
	}
	
	public static class Calisan extends Insan{
		private int calisanId;

		public Calisan(String isim, String soyisim,int calisanId) {
			super(isim, soyisim);
			this.calisanId=calisanId;
		}

		@Override
		public void calis() {
			if (this.calisanId==0) {
				System.out.println(calisanId+" Bu kisi sirket calisani degil");
				
			}else {
				System.out.println(calisanId+" Bu kisi sirket calisanidir");
			}
			
		}
		public static void main(String[] args) {
		
		Calisan sekreter=new Calisan("ali","veli",0);
		Calisan qatester=new Calisan("ahmet","kamus",545);
		Calisan developer=new Calisan("seyma","zeynep",56365);
		
		sekreter.bilgilendirme();
		sekreter.calis();
		
		qatester.bilgilendirme();
		qatester.calis();
		
		developer.bilgilendirme();
		developer.calis();
	}
	}
	

}
