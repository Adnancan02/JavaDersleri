package day20_scope;

import java.util.Scanner;

public class Scope1 {
	// bu Instance variable dir.
	public int sayi; // class 'in icinde fakat main method un d�s�nda olusturulan
	         // ve static olmayan variable lara INSTANCE(objekt) variable denir.
	         // class level de olusturuldugu i�in class in her yerinden belli �artlarla kullan�labilir.
	
	// Instance variable 'lar object e bagl� olarak cal�s�r.(ogretmen ad� veya ogrenci notu gibi)
	public String isim="Mehmet";
	public String soyisim;
	boolean izindeMi;
	char ilkHarf;

	public static void main(String[] args) {
		staticMethod();
		//method(); bu cal��maz cunku static degil
		//System.out.println(sayi);// static olmayan bit variable a static method icinden ulasamay�z
		                         // main method umuz static oldugu i�in main method icerisinden 
		                         // static olmayan variable veya method lara direk ulasamay�z.
		// instance bir variable a main method i�erisinden ulasmak istedi�inizde 
		// OBJECT olusturmal�y�z
		
		Scanner       scan =     new                     Scanner(System.in);// bu javada ki standart obje olusturma formudur
		
	//class ismi    obje ismi   obje olusturma keyword    class ismi
		
		Scope1 obj1= new Scope1();
		System.out.println(obj1.sayi);// buna deger atamad�k java buna default deger verdi. 0
		// instance variable 'lar olusturdugunda biz deger atayabiliriz
		System.out.println(obj1.isim);
		System.out.println(obj1.soyisim); // buna deger atamad�k java default deger verdi. null

		Scope1 obj2= new Scope1();
		obj2.isim="Muslum";
		obj2.soyisim="Baba";
		System.out.println(obj2.isim+" "+obj2.soyisim);// Muslum Baba
		System.out.println(obj1.isim+" "+obj1.soyisim);// Mehemet null
		System.out.println(obj1.izindeMi);
		System.out.println(obj2.ilkHarf);
		
		
		Scope1 obj3 = new Scope1();
		obj3.isim= "Ferdi";
		obj3.soyisim="Tayfur";
		obj3.izindeMi=true;
		System.out.println(obj3.isim + " "+ obj3.soyisim+ " " + obj3.izindeMi); // Ferdi Tayfur true
		
		scan.close();
		
		
	}
	public static void staticMethod() {
		System.out.println("Statich method cali�ti");
	}

	
	public void method() {
		System.out.println(sayi);// bu method static olmad�g� i�in instance variable lara dierek eri�ilebilir.
		sayi= sayi+20; // ve bu method icerisinde gecerli olmak uzere degerini degistirilibiri.
	}
}
