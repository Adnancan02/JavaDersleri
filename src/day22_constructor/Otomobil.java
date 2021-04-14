package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){ // istersek constructor'i parametreli olarak olusturabiliriz
		
		
	}
	// biz bir constructor olusturdugumuzda java default olan� yok eder
	// doly�s�yla biz bir constructor olusturdugumuzda mutlaka
	// default constructor in yerini de bir constructor yazmal�y�z.
	public Otomobil() { // default constructor in yerine bunu yazmal�y�z
		
	}
	// onemli not: Default constructor dan baska bir constructor yazd�g�m�zda 
	// Java default olan� yok etti�i i�in MUTLAKAbiz default yerine de constructor yazmal�y�z.
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public void yakit(String yakit) { // method
		System.out.println("Araba yakit olarak "+ yakit +"kullanir");
		
	}
	
	public void vites(String vites) { // method
		System.out.println("Araba" + vites +"viteslidir");
	}
}
