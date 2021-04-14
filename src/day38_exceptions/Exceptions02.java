package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		// Kullan�c�dan iki tamsay� al�n ve bolumlerini yaz�n�z.

		int count=0;
		Scanner scan = new Scanner(System.in);
		
		while(count<100) {
		
		System.out.println("Lutfen bolunecek tamsay�y� yazd�r�n");
		int sayi1 = scan.nextInt();
		System.out.println("Lutfen kaca bolmek �stediginizi yazin");
		int sayi2 = scan.nextInt();
		// Java'ya exceptions'i handle etmek icin bir cozum uretmeszsek
		// java exception ile kars�last�g�nda cal�smay� durdurur(stops execution)
		// throws exception (exception firlatir) (problemin kaynag�n� bize gosterir.
		//tum aplication durmus olur...
		// Musterinin kulland�g� b�r uygulama icin bu KABUL ED�LEMEZ.
		//Bunun i�in kod yazan k�s� muhtemel sorunlar icin yol gostermelidir.
		
		System.out.println("islem no : " + count);
		try {
		
		System.out.println("b�lme islemini sonucu : " + sayi1 / sayi2);
		} catch (ArithmeticException e ) {
			System.out.println("Sayiyi s�f�ra bolemezsin");
		}
		count++;
		
		}

	}

}
