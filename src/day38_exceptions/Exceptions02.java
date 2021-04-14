package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		// Kullanýcýdan iki tamsayý alýn ve bolumlerini yazýnýz.

		int count=0;
		Scanner scan = new Scanner(System.in);
		
		while(count<100) {
		
		System.out.println("Lutfen bolunecek tamsayýyý yazdýrýn");
		int sayi1 = scan.nextInt();
		System.out.println("Lutfen kaca bolmek ýstediginizi yazin");
		int sayi2 = scan.nextInt();
		// Java'ya exceptions'i handle etmek icin bir cozum uretmeszsek
		// java exception ile karsýlastýgýnda calýsmayý durdurur(stops execution)
		// throws exception (exception firlatir) (problemin kaynagýný bize gosterir.
		//tum aplication durmus olur...
		// Musterinin kullandýgý býr uygulama icin bu KABUL EDÝLEMEZ.
		//Bunun için kod yazan kýsý muhtemel sorunlar icin yol gostermelidir.
		
		System.out.println("islem no : " + count);
		try {
		
		System.out.println("bölme islemini sonucu : " + sayi1 / sayi2);
		} catch (ArithmeticException e ) {
			System.out.println("Sayiyi sýfýra bolemezsin");
		}
		count++;
		
		}

	}

}
