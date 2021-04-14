package day13_stringmanipulation;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		//kulnýcýdan bir cumle ýsteyýn
		// cumledeki tum bosluklarý silin
		// tum a'larýn yerine e yazdýrýn
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir cumle giriniz");
		String str= scan.nextLine();
	str=str.replace(" ","");
		str=str.replace("a","e");
		System.out.println(str); // atama yapmazsanýz i manýpulatýon str i degistýrmez
		// eger atama yaparsak str kalici olarak degistigi için biz bir daha orjinal str a ulasamaz
		//bunun için kullanýcýnýn aldýgýmýz str a degil yeni bir string atamak daha mantýklýdýr
		
		System.out.println("Lütfen bir cumle giriniz");
		String str2= scan.nextLine();
		System.out.println(str2.replace(" ","").replace('a',  'e'));

		// hem a hemde e nin yerine i yazalým
		System.out.println(str.replace("a", "i").replace('e',  'i'));
		
		// hem a hem de e nin yerine i yazalým buyuk kucuk harf gozetmeksizin
		
		
		
	}

}
