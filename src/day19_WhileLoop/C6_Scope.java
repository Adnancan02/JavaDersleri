package day19_WhileLoop;

public class C6_Scope {

	public static void main(String[] args) {
		// Bir Class icerisinde olusturulan variable lerin nerede gecerli oldugunu
	// ve nereden kullanýlabilecegini o variable in Scope u belirler
		// google Java da scope nedir?
		int sayi=10;
	
		
		denemeMethod();
		
		
		sayi++;
		System.out.println(sayi);
		//System.out.println(isim);
		
		
		
		
	}

	private static void denemeMethod() {
	//	sayi=20;
		String isim = "Mehmet";
		
	}

}
