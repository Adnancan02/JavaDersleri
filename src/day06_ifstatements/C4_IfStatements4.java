package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatements4 {

	public static void main(String[] args) {
		//kullnýcýdan gün ismini istiyiniz
        // girilen gunun hafta içi veya hafta sonu oldugunu yazdýrýnýz
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen gün adýný giriniz");
		
		
		String gunAdi= scan.next().toLowerCase();
		//Eger String lerde esitlik sorguluyorsak == kullanmamalýyýz
		//Stringlerde esitlik olma durumunu sorgulamak için equals(=) kullanmalýyýz
		
		if(gunAdi.equals("cumartesi")|| gunAdi.equals("pazar")) {
			
			System.out.println("Haftasonu");
		}
			
			if(gunAdi.equals("pazartesi") || gunAdi.equals("sali") 
					|| gunAdi.equals("carsamba") ||
					gunAdi.equals("persembe") || gunAdi.equals("cuma")){
				System.out.println("haftaiçi");
		}
			
			// bu kods gun ismi yanlýs yazýlmasýsa olusacak durum yok
		
		scan.close();
	}

}
