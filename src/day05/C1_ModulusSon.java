package day05;

public class C1_ModulusSon {

	public static void main(String[] args) {
		// verilen bir integer in birler basamg�ndaki rakami yazd�r�n. verilen dedi�i i�in scanner gerekmez.
		
		int sayi=1469;
		System.out.println("Verilen say�n�n birler basamg� :"+sayi%10);
		// verilen say�n�n birler basamag� haric geriye kalan basamkalar� yazd�r�n.
		
	System.out.println(sayi/10); //146

	
	System.out.println(sayi); //1469
	
	System.out.println(sayi/=10); //146
	sayi/=10;
	
	
	System.out.println(sayi/10);
	}

}
