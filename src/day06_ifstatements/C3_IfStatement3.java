package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		//  kullanýcýdan gün isminim ilk harfini isteyiniz ve harf uygun olan gun ýsýmlerýný yazdýrýnýz
		
		//c--> cum , cumartesi
		
		Scanner scan=new Scanner(System.in);
		 
		System.out.println("Lütfen gün isminin ilk harfini yazýnýz");
		char ilkHarf=scan.next().charAt(0);
		System.out.println(ilkHarf);
		// bu satýr itibariyle girilen String'in ilk karakterini almýs oldum.
		//p, s, c,
		
		if(ilkHarf=='p' || ilkHarf=='P') {
			
			System.out.println("pazari, Pazartesi  veya Perþembe");
			
		}
		
		if(ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("sali");
		}
		
		if(ilkHarf=='c' || ilkHarf=='C') {
	 System.out.println("Carsambai cuma veya cumartesi");			
	}
	 if(ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S' && ilkHarf!='c' && ilkHarf!='C' ) {}
		
		System.out.println("Lütfen gecerli bir harf yazýnýz");
		scan.close();
	}

}
