package day01;

public class C2_Variables {
	
	public static void main(String[] args) {
	
		int sayi; // ; yaz�m dilindeki . gibidir . java ; u gorunce o sat�rdaki kod yaz�l�m�n�n bitti�ini
		sayi= 27;
		System.out.print(sayi); // e�er println degil de print yazarsak yazd�rma i�leminden 
		                          // sonra alt satira gecmez.
		
		
		char ilkHarf='M';  // ASC2 DEGER� M N�N 77 D�R.
		System.out.println(ilkHarf); //
		
		
		double sayiDouble = 5.34;
		System.out.println(sayiDouble);
		
		
		System.out.println(sayi + sayiDouble); 
		System.out.println(sayi + ilkHarf);
		// E�er bir toplama degerinde char degiskeni kullan�l�rsa karakterin ascii degrini ile toplama yapar.
		
		
		
	}
}
