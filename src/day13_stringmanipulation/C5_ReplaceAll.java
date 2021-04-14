package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		// 
		
		String str = "Java ogren, mutlu ol, Java cand�r 12345";
		System.out.println(str.replace("Java", "hava"));
		
		// replaceAll () method u replace() method una benzer ama 2 fark� vard�r.
		// 1-replace() method char kabul eder ama replaceAll () kabul etmez
		//2- replaceAll method u regex kullan�m�na �z�n ver�r
		System.out.println(str.replaceAll("\\w", "*"));
		//tum harf ve rakamlar yer�ne * yazar. sadece bosluk ve virgulle kal�r
		
		System.out.println(str.replaceAll("\\W", "*")); // w nin tersi
		
		System.out.println(str.replaceAll("\\d", ".")); // say�lar� . yapar

		System.out.println(str.replaceAll("\\D", "."));// sayi olmayanlari . yapar
		System.out.println(str.replaceAll("\\s", "&"));// bosluklar� & yapar
		System.out.println(str.replaceAll("\\S", "&"));// bosluk olmayan herseyi & yapar
		System.out.println(str.replaceAll("\\d", "")); // sayilari siler
	}

}
