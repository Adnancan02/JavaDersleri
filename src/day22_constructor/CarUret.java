package day22_constructor;

public class CarUret { // main method olmasada olur. 
	// soru ..... Constructor bu Class'da nerede?
	// su anda bu Class da gorunur bir Constructor yok
	// bir Class olusturuldugunda Java bu class dan obje uretecegı bilir
	// ve gorunmeyen DEFAULT CONSTRUCTOR'i class a yerlestirir.
	//DEfault constructor parametresizdir dolayısıyla sadece hic bir ozelliği tanımlayamayan objeler uretir(tisört uret)
	// default constuctor ile uretilen bir objenin tum ozellikleri sonradan tanımlanmalıdır
	// Eger biz sonradan bir constructor yazarsak, Java default constructor 'i iptal eder.
	
	
	//Bir Constructor olusturalım.
	public CarUret (){ 
		
	}
	// Kurallar 1- İsmi class ile ayni olmalıdır.(dolayısıyla buyuk harfle baslar)
	//2- Constructor return type'a sahip degildir
	//3-Constructor isminden sonra mutlaka parantez olur(9 ama parametre olması opsiyoneldir.
	//4- bir constructor olusturuldugunda kimlerin kullanacagını belirlemek için access modifier yazılır.
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	// bir programda cok fazla uretecegiğimiz objeler bir tane class olusrururuz.
	// bu class da olusturulacak objelere ait tum ozellikler olur.
	// bu class direk calıstırılmayacagı için main method olmasa da olur.
	// (kalphane gibidir)


	

	public void yakit(String yakit) { // method
		System.out.println("Araba yakit olarak "+ yakit +"kullanir");
		
	}
	
	public void vites(String vites) { // method
		System.out.println("Araba" + vites +"viteslidir");
	}
	
	
}
