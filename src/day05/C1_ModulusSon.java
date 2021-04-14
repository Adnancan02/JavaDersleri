package day05;

public class C1_ModulusSon {

	public static void main(String[] args) {
		// verilen bir integer in birler basamgýndaki rakami yazdýrýn. verilen dediði için scanner gerekmez.
		
		int sayi=1469;
		System.out.println("Verilen sayýnýn birler basamgý :"+sayi%10);
		// verilen sayýnýn birler basamagý haric geriye kalan basamkalarý yazdýrýn.
		
	System.out.println(sayi/10); //146

	
	System.out.println(sayi); //1469
	
	System.out.println(sayi/=10); //146
	sayi/=10;
	
	
	System.out.println(sayi/10);
	}

}
