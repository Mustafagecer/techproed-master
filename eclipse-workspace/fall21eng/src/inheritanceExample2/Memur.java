package inheritanceExample2;

public class Memur extends Muhasebe{
public static void main(String[] args) {
	Memur m1=new Memur();
	Memur m2=new Memur();
	
	m1.name="Ali";
	m1.surname="Veli";
	m1.adress="asasdfdfv";
	m1.saatucreti=20;
	m1.statu="Chef";
	m1.tel="351616";
	m1.id=m1.idAta();
	
	System.out.println(m1.id);
			

}
}
