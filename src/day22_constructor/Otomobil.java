package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){ // istersek constructor'i parametreli olarak olusturabiliriz
		
		
	}
	// biz bir constructor olusturdugumuzda java default olaný yok eder
	// dolyýsýyla biz bir constructor olusturdugumuzda mutlaka
	// default constructor in yerini de bir constructor yazmalýyýz.
	public Otomobil() { // default constructor in yerine bunu yazmalýyýz
		
	}
	// onemli not: Default constructor dan baska bir constructor yazdýgýmýzda 
	// Java default olaný yok ettiði için MUTLAKAbiz default yerine de constructor yazmalýyýz.
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
