package day01;

public class C2_Variables {
	
	public static void main(String[] args) {
	
		int sayi; // ; yazým dilindeki . gibidir . java ; u gorunce o satýrdaki kod yazýlýmýnýn bittiðini
		sayi= 27;
		System.out.print(sayi); // eðer println degil de print yazarsak yazdýrma iþleminden 
		                          // sonra alt satira gecmez.
		
		
		char ilkHarf='M';  // ASC2 DEGERÝ M NÝN 77 DÝR.
		System.out.println(ilkHarf); //
		
		
		double sayiDouble = 5.34;
		System.out.println(sayiDouble);
		
		
		System.out.println(sayi + sayiDouble); 
		System.out.println(sayi + ilkHarf);
		// Eðer bir toplama degerinde char degiskeni kullanýlýrsa karakterin ascii degrini ile toplama yapar.
		
		
		
	}
}
