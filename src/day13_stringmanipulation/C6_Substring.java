package day13_stringmanipulation;

public class C6_Substring {

	public static void main(String[] args) {


		
		String str= "Her ders Java gibi olsa";
		
		
		
		System.out.println(str.substring(10));
		// 10.index dahil (inclusive) sonuna kadar tum String
		System.out.println(str.substring(str.length()-10)); // son 10 harfi yazdýrýn
	  // ilk 10 karakteri alma
		System.out.println(str.substring(10, 10));// "" substring(0, 10) yazýldýgýnda 
		                                         // o inclusive , 10 exclusive
		//11.uncu karakterden sonuna kadar olan String i yazdýralým
		
		System.out.println(str.substring(10));
		
		// str in ilk 10 karakteri * ile gizleyin geriye kalanlar normal yazýlsýn
		
		System.out.println("**********" + str.substring(10));
		
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*")+str.substring(10));
		// str nin ilk 10 karakteri aldýk
		
		
		System.out.println(str.substring(5, 10)); //baslangýc index i olsun der ama bitis i
		                                          // index i olmasýn der, Java son soyleneni yapar
		//System.out.println(str.substring(8, 7));// RTE
		
		System.out.println(str.substring(22));// length()-1 ..... son karakter
		System.out.println(str.substring(23)); // length..... bos
		//System.out.println(str.substring(24)); // length den buyuk sayý yazarsak RTE
		
		
		// str in ilk 10 karakterin * ile gizleyin , geriye kaanlar normal yazýlsýn
		String str3= str.substring(0, 10);// str nin ilk 10 harfini aldýk
		str3= str.replaceAll("\\w", "a");
		System.out.println(str3.replaceAll("\\w", "*")+ str.substring(10));
		
		
		
		
	}

}
