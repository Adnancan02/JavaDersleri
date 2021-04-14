package day15_methodcreation;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		// Java da ayný isimle birden fazla method olusturulursa buna overloading denir
	    // Overloading yapabilmek için Method Signature larýnýn farklý olmasý gerekir
		// Method Signature = isim + parametre sayisi + parametre data turu
		// birbirini kapsayan data turleri oldugunda java optimum cozumu uretir
		// (bir bir uyan varsa o methodu calýstýrý, bire bir uyan yoksa en fazla uyan methodu kullanýr
		// Eger kapsayan bir method da bulamazsa java CTE verir.
		
		
		
		toplama("Ali", "Veli");

	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu : "+ (sayi1 + sayi2));
		
	}
	public static void toplama(double sayi1, double sayi2) {
		System.out.println("Double method sonucu : "+ (sayi1 + sayi2));
	}
	
	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer / double method sonucu : "+ (sayi1 + sayi2));
	}
	public static void toplama(double sayi2, int sayi1) {
		System.out.println("double / integer method sonucu : "+ (sayi1 + sayi2));
	}
	public static void toplama(char sayi1, char sayi2) {
		System.out.println("char method sonucu : "+ (sayi1 + sayi2));
	}
	public static void toplama(String sayi1, String sayi2) {
		System.out.println("String method sonucu : "+ (sayi1 + sayi2));
	}
}

