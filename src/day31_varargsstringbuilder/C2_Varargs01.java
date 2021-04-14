package day31_varargsstringbuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		//Verilen iki sayiyi toplayan ve sonucu yazdýran bir method yazýnýz.
		//         uc
		
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		toplama(sayi1,sayi2);// method call
		

		toplama(sayi1,sayi2, sayi3);// method call
		
		// oyle bir method yazalým ki içine kac yazý yazarsak yazalým toplasýn.
		toplama(2,3);// iki sayinin toplami method
		toplama(2,5,8);// uc sayýnýn toplamý methodu calýsýr.
		//istediðimiz kadar sayýyý yazabilecegimiz method olusturabilmemiz için java Varargs olusturur.
		
		
		
	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		
		System.out.println("uc sayinin toplami : " + (sayi1+sayi2 + sayi3));
		
	}

	public static void toplama(int sayi1, int sayi2) {


		System.out.println("iki sayinin toplami : " + (sayi1+sayi2));
		
	}

}
