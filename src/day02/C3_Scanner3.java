package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		// kullanýcýdan ismini ve soy ismini alýp aralýrýnda da bir bosluk býrakýnýz
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Lütfen isminizi giriniz");
		String name=scan.nextLine(); // sadece next secilirse kullanýcý birden fazla kelime girse ilk kelimeyi alýr
		// kullanýcýnýn girdiði tüm yazýyý almak ýsterse nextLine() secmeliyiz.
		System.out.println("lütfen soy ismini giriniz");
		String surname= scan.nextLine();
		System.out.println(name+" "+surname);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
