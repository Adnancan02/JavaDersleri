package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatements4 {

	public static void main(String[] args) {
		//kulln�c�dan g�n ismini istiyiniz
        // girilen gunun hafta i�i veya hafta sonu oldugunu yazd�r�n�z
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen g�n ad�n� giriniz");
		
		
		String gunAdi= scan.next().toLowerCase();
		//Eger String lerde esitlik sorguluyorsak == kullanmamal�y�z
		//Stringlerde esitlik olma durumunu sorgulamak i�in equals(=) kullanmal�y�z
		
		if(gunAdi.equals("cumartesi")|| gunAdi.equals("pazar")) {
			
			System.out.println("Haftasonu");
		}
			
			if(gunAdi.equals("pazartesi") || gunAdi.equals("sali") 
					|| gunAdi.equals("carsamba") ||
					gunAdi.equals("persembe") || gunAdi.equals("cuma")){
				System.out.println("haftai�i");
		}
			
			// bu kods gun ismi yanl�s yaz�lmas�sa olusacak durum yok
		
		scan.close();
	}

}
