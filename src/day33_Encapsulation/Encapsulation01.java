package day33_Encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {
	
	public static void main(String[] args) {
		//OOP concept
		// Object Oriented Programing
		//Bir proje kapsamýndaki class larda olusturulan variable ve method larýn 
		// baska class larda tekrar tekrar yazýlmamasý, var oldugu class dan obje uretilerek
		//bu variable ve method larýn istendiði kadar kullanýlmasýdýr.(reusabilitiy)
		//write once Reuse Anywhere
		
		//scope6 class 'indeki variabla ve methodlara ulasmak istiyorum
		//bunun için Scope6 class ýndan obje uretmeliyýz.
		
		Scope6 obj1 = new Scope6();
		//esitligin sol tarafý declaration
		// declaration 2 parcadýr ilk parca Data turu, ikinci kýsým isim
		// non- primitive 'ler için data aynu zamanda class ismi olabilir.
		// esitliðin sagýnda ise deger, 2 parcadan olusur.
		// new keyword'u ikincisi de constructor
		// hangi class dan obje uretmek istersek o class in constructor 'ini kullanýrý
		obj1.num1 = 10;
		System.out.println(obj1.num1);
		
		obj1.add();
		
		// deneme() method 'unun içinden cagýrabilir miyim?
		// deneme(); method'u static olmadýgý için main method dan dýrek cagrýlamaz.
		// bunun yerine içinde class dan bir  object uretip onun uzerinden static olmayan method larý da cagýrabiliriz.
		
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme();
		
	}
 // Projemiz kapsamýnda bulunan tun class lardan 
	// public variable ve method lara istediðimiz yerden obje ureterek ulasabilirim.
	// eger ulasmak istediðim class uyeleri ( class nember) public degilse baska 
	// package'lerden ulasmak için extra iþlem yapmamýz gerekir.
	
	public void deneme() {
		Scope1 obj2= new Scope1();
		
		obj2.isim="Ahmet";
		obj2.soyisim="Ozcelik";
		obj2.sayi=15;
		obj2.method();
		
	}
	
}
