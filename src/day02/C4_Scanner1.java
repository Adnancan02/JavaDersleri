package day02;

import java.util.Scanner;

public class C4_Scanner1 {

	public static void main(String[] args) {
		
		
		//Scanner : kullanýcadan bilgi almak için kullnýyoruz
		// 3 adýmda iþlem tamamlýyoruz.
		// 1. adým Scanner objesi olusturuyoruz. sol taraf variables için var. sag taraf bir deger
		
		Scanner scan = new Scanner(System.in);
		
		
		// 2. adým kullanýcýya ne istediðiniz belirten bir mesaj yazmalýyýz.
		
		System.out.println("Lütfen sadece isminizi giriniz");
		
		// 3. adým bir variable olusturup kullanýcýnýn girdiði degeri giriniz.
		
		String name = scan.nextLine();
		System.out.println("Lütfen sadece soyisminizi giriniz");
		// String surname = scan.next(); bu sekilde ilk kelineyi alýr, sonrakini almaz.		
		String surname = scan.nextLine();
		
		System.out.println("isminiz : " + name);
		System.out.println("Soyisminiz : " + surname);
		
	scan.close();	
		
	}

}
