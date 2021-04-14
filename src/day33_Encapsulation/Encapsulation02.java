package day33_Encapsulation;

public class Encapsulation02 {

	private String okulIsmi = "Yildiz Koleji";
	// Okul ismini baska class 'lardan okunmasýný ama deger atanmamasýný istiyorsak
	// getter() method u olusturuyoruz.
	private String tcNo = "12345678901";
	private int hesapNo = 5554321;
	// Obje olusturularak deger atanýp kullanýlmasýný ýstediðimiz ama ilk atadýgýmýz
	// degerýn gorunmesýný ýstýyorsak setter() method u kullanýrýz
	
	public int sayi= 100;

	public static void main(String[] args) {
		// eger ulasmak istediðim class uyeleri ( class nember) public degilse baska
		// package'lerden ulasmak için extra iþlem yapmamýz gerekir.

		// Yapabilcegimiz iþlemlerden 1.si Encapsulation (Data saklama)
		// bu class da kimseyle paylasmak istemediðimiz variable ve method lar
		// olusturalým.

		// private olunca guvenlik konusunu halletmiþ olduk.
		// ancak class uyeleri'nin private olmasý OOP concept'e aykýrý

		// Encapsulation class'imizda olusturdugumuz class uyelerine
		// kimlerin ne oranda ulasabilicegini belirlemek için yapýlýr.
	}

	private void denemeMethod() {
		System.out.println("Deneme method'u calýstý");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}

}
