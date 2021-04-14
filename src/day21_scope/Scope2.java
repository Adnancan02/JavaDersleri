package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		// static variable 'lar icin object olusturma ihtiyacým yoktur
		// baska bir Class ' dan static variable'lara ulasmak istediðimizde
		// ulasmak istedgýmýz Class'in adi. static variable adi yazmamýz yeterlidir.

		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);// Java Run Time program'dýr.
											// Scope2 Class i calýstýrdýgýnda scope1 calýsmazzzz
		                                    // dolayýsýyla en basta olusturulan veya atanan degerler gecerli olur.
		
		Scope1.okulAdi="Mehemet Koleji";
		System.out.println(Scope1.okulAdi);
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);

	}

}
