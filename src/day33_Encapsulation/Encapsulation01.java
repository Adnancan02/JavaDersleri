package day33_Encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {
	
	public static void main(String[] args) {
		//OOP concept
		// Object Oriented Programing
		//Bir proje kapsam�ndaki class larda olusturulan variable ve method lar�n 
		// baska class larda tekrar tekrar yaz�lmamas�, var oldugu class dan obje uretilerek
		//bu variable ve method lar�n istendi�i kadar kullan�lmas�d�r.(reusabilitiy)
		//write once Reuse Anywhere
		
		//scope6 class 'indeki variabla ve methodlara ulasmak istiyorum
		//bunun i�in Scope6 class �ndan obje uretmeliy�z.
		
		Scope6 obj1 = new Scope6();
		//esitligin sol taraf� declaration
		// declaration 2 parcad�r ilk parca Data turu, ikinci k�s�m isim
		// non- primitive 'ler i�in data aynu zamanda class ismi olabilir.
		// esitli�in sag�nda ise deger, 2 parcadan olusur.
		// new keyword'u ikincisi de constructor
		// hangi class dan obje uretmek istersek o class in constructor 'ini kullan�r�
		obj1.num1 = 10;
		System.out.println(obj1.num1);
		
		obj1.add();
		
		// deneme() method 'unun i�inden cag�rabilir miyim?
		// deneme(); method'u static olmad�g� i�in main method dan d�rek cagr�lamaz.
		// bunun yerine i�inde class dan bir  object uretip onun uzerinden static olmayan method lar� da cag�rabiliriz.
		
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme();
		
	}
 // Projemiz kapsam�nda bulunan tun class lardan 
	// public variable ve method lara istedi�imiz yerden obje ureterek ulasabilirim.
	// eger ulasmak istedi�im class uyeleri ( class nember) public degilse baska 
	// package'lerden ulasmak i�in extra i�lem yapmam�z gerekir.
	
	public void deneme() {
		Scope1 obj2= new Scope1();
		
		obj2.isim="Ahmet";
		obj2.soyisim="Ozcelik";
		obj2.sayi=15;
		obj2.method();
		
	}
	
}
