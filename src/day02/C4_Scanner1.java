package day02;

import java.util.Scanner;

public class C4_Scanner1 {

	public static void main(String[] args) {
		
		
		//Scanner : kullan�cadan bilgi almak i�in kulln�yoruz
		// 3 ad�mda i�lem tamaml�yoruz.
		// 1. ad�m Scanner objesi olusturuyoruz. sol taraf variables i�in var. sag taraf bir deger
		
		Scanner scan = new Scanner(System.in);
		
		
		// 2. ad�m kullan�c�ya ne istedi�iniz belirten bir mesaj yazmal�y�z.
		
		System.out.println("L�tfen sadece isminizi giriniz");
		
		// 3. ad�m bir variable olusturup kullan�c�n�n girdi�i degeri giriniz.
		
		String name = scan.nextLine();
		System.out.println("L�tfen sadece soyisminizi giriniz");
		// String surname = scan.next(); bu sekilde ilk kelineyi al�r, sonrakini almaz.		
		String surname = scan.nextLine();
		
		System.out.println("isminiz : " + name);
		System.out.println("Soyisminiz : " + surname);
		
	scan.close();	
		
	}

}
