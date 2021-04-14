package day22_constructor;

public class CarUret { // main method olmasada olur. 
	// soru ..... Constructor bu Class'da nerede?
	// su anda bu Class da gorunur bir Constructor yok
	// bir Class olusturuldugunda Java bu class dan obje ureteceg� bilir
	// ve gorunmeyen DEFAULT CONSTRUCTOR'i class a yerlestirir.
	//DEfault constructor parametresizdir dolay�s�yla sadece hic bir ozelli�i tan�mlayamayan objeler uretir(tis�rt uret)
	// default constuctor ile uretilen bir objenin tum ozellikleri sonradan tan�mlanmal�d�r
	// Eger biz sonradan bir constructor yazarsak, Java default constructor 'i iptal eder.
	
	
	//Bir Constructor olustural�m.
	public CarUret (){ 
		
	}
	// Kurallar 1- �smi class ile ayni olmal�d�r.(dolay�s�yla buyuk harfle baslar)
	//2- Constructor return type'a sahip degildir
	//3-Constructor isminden sonra mutlaka parantez olur(9 ama parametre olmas� opsiyoneldir.
	//4- bir constructor olusturuldugunda kimlerin kullanacag�n� belirlemek i�in access modifier yaz�l�r.
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	// bir programda cok fazla uretecegi�imiz objeler bir tane class olusrururuz.
	// bu class da olusturulacak objelere ait tum ozellikler olur.
	// bu class direk cal�st�r�lmayacag� i�in main method olmasa da olur.
	// (kalphane gibidir)


	

	public void yakit(String yakit) { // method
		System.out.println("Araba yakit olarak "+ yakit +"kullanir");
		
	}
	
	public void vites(String vites) { // method
		System.out.println("Araba" + vites +"viteslidir");
	}
	
	
}
