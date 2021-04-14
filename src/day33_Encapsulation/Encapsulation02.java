package day33_Encapsulation;

public class Encapsulation02 {

	private String okulIsmi = "Yildiz Koleji";
	// Okul ismini baska class 'lardan okunmas�n� ama deger atanmamas�n� istiyorsak
	// getter() method u olusturuyoruz.
	private String tcNo = "12345678901";
	private int hesapNo = 5554321;
	// Obje olusturularak deger atan�p kullan�lmas�n� �stedi�imiz ama ilk atad�g�m�z
	// deger�n gorunmes�n� �st�yorsak setter() method u kullan�r�z
	
	public int sayi= 100;

	public static void main(String[] args) {
		// eger ulasmak istedi�im class uyeleri ( class nember) public degilse baska
		// package'lerden ulasmak i�in extra i�lem yapmam�z gerekir.

		// Yapabilcegimiz i�lemlerden 1.si Encapsulation (Data saklama)
		// bu class da kimseyle paylasmak istemedi�imiz variable ve method lar
		// olustural�m.

		// private olunca guvenlik konusunu halletmi� olduk.
		// ancak class uyeleri'nin private olmas� OOP concept'e ayk�r�

		// Encapsulation class'imizda olusturdugumuz class uyelerine
		// kimlerin ne oranda ulasabilicegini belirlemek i�in yap�l�r.
	}

	private void denemeMethod() {
		System.out.println("Deneme method'u cal�st�");
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
