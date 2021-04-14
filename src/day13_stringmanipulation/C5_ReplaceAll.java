package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		// 
		
		String str = "Java ogren, mutlu ol, Java candýr 12345";
		System.out.println(str.replace("Java", "hava"));
		
		// replaceAll () method u replace() method una benzer ama 2 farký vardýr.
		// 1-replace() method char kabul eder ama replaceAll () kabul etmez
		//2- replaceAll method u regex kullanýmýna ýzýn verýr
		System.out.println(str.replaceAll("\\w", "*"));
		//tum harf ve rakamlar yerýne * yazar. sadece bosluk ve virgulle kalýr
		
		System.out.println(str.replaceAll("\\W", "*")); // w nin tersi
		
		System.out.println(str.replaceAll("\\d", ".")); // sayýlarý . yapar

		System.out.println(str.replaceAll("\\D", "."));// sayi olmayanlari . yapar
		System.out.println(str.replaceAll("\\s", "&"));// bosluklarý & yapar
		System.out.println(str.replaceAll("\\S", "&"));// bosluk olmayan herseyi & yapar
		System.out.println(str.replaceAll("\\d", "")); // sayilari siler
	}

}
