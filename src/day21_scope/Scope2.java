package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		// static variable 'lar icin object olusturma ihtiyac�m yoktur
		// baska bir Class ' dan static variable'lara ulasmak istedi�imizde
		// ulasmak istedg�m�z Class'in adi. static variable adi yazmam�z yeterlidir.

		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);// Java Run Time program'd�r.
											// Scope2 Class i cal�st�rd�g�nda scope1 cal�smazzzz
		                                    // dolay�s�yla en basta olusturulan veya atanan degerler gecerli olur.
		
		Scope1.okulAdi="Mehemet Koleji";
		System.out.println(Scope1.okulAdi);
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);

	}

}
