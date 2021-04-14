package day13_stringmanipulation;

public class C6_Substring {

	public static void main(String[] args) {


		
		String str= "Her ders Java gibi olsa";
		
		
		
		System.out.println(str.substring(10));
		// 10.index dahil (inclusive) sonuna kadar tum String
		System.out.println(str.substring(str.length()-10)); // son 10 harfi yazd�r�n
	  // ilk 10 karakteri alma
		System.out.println(str.substring(10, 10));// "" substring(0, 10) yaz�ld�g�nda 
		                                         // o inclusive , 10 exclusive
		//11.uncu karakterden sonuna kadar olan String i yazd�ral�m
		
		System.out.println(str.substring(10));
		
		// str in ilk 10 karakteri * ile gizleyin geriye kalanlar normal yaz�ls�n
		
		System.out.println("**********" + str.substring(10));
		
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*")+str.substring(10));
		// str nin ilk 10 karakteri ald�k
		
		
		System.out.println(str.substring(5, 10)); //baslang�c index i olsun der ama bitis i
		                                          // index i olmas�n der, Java son soyleneni yapar
		//System.out.println(str.substring(8, 7));// RTE
		
		System.out.println(str.substring(22));// length()-1 ..... son karakter
		System.out.println(str.substring(23)); // length..... bos
		//System.out.println(str.substring(24)); // length den buyuk say� yazarsak RTE
		
		
		// str in ilk 10 karakterin * ile gizleyin , geriye kaanlar normal yaz�ls�n
		String str3= str.substring(0, 10);// str nin ilk 10 harfini ald�k
		str3= str.replaceAll("\\w", "a");
		System.out.println(str3.replaceAll("\\w", "*")+ str.substring(10));
		
		
		
		
	}

}
