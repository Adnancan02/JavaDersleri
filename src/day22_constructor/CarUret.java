package day22_constructor;

public class CarUret { // main method olmasada olur. 
	// soru ..... Constructor bu Class'da nerede?
	// su anda bu Class da gorunur bir Constructor yok
	// bir Class olusturuldugunda Java bu class dan obje uretecegý bilir
	// ve gorunmeyen DEFAULT CONSTRUCTOR'i class a yerlestirir.
	//DEfault constructor parametresizdir dolayýsýyla sadece hic bir ozelliði tanýmlayamayan objeler uretir(tisört uret)
	// default constuctor ile uretilen bir objenin tum ozellikleri sonradan tanýmlanmalýdýr
	// Eger biz sonradan bir constructor yazarsak, Java default constructor 'i iptal eder.
	
	
	//Bir Constructor olusturalým.
	public CarUret (){ 
		
	}
	// Kurallar 1- Ýsmi class ile ayni olmalýdýr.(dolayýsýyla buyuk harfle baslar)
	//2- Constructor return type'a sahip degildir
	//3-Constructor isminden sonra mutlaka parantez olur(9 ama parametre olmasý opsiyoneldir.
	//4- bir constructor olusturuldugunda kimlerin kullanacagýný belirlemek için access modifier yazýlýr.
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	// bir programda cok fazla uretecegiðimiz objeler bir tane class olusrururuz.
	// bu class da olusturulacak objelere ait tum ozellikler olur.
	// bu class direk calýstýrýlmayacagý için main method olmasa da olur.
	// (kalphane gibidir)


	

	public void yakit(String yakit) { // method
		System.out.println("Araba yakit olarak "+ yakit +"kullanir");
		
	}
	
	public void vites(String vites) { // method
		System.out.println("Araba" + vites +"viteslidir");
	}
	
	
}
