package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		//  kullan�c�dan g�n isminim ilk harfini isteyiniz ve harf uygun olan gun �s�mler�n� yazd�r�n�z
		
		//c--> cum , cumartesi
		
		Scanner scan=new Scanner(System.in);
		 
		System.out.println("L�tfen g�n isminin ilk harfini yaz�n�z");
		char ilkHarf=scan.next().charAt(0);
		System.out.println(ilkHarf);
		// bu sat�r itibariyle girilen String'in ilk karakterini alm�s oldum.
		//p, s, c,
		
		if(ilkHarf=='p' || ilkHarf=='P') {
			
			System.out.println("pazari, Pazartesi  veya Per�embe");
			
		}
		
		if(ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("sali");
		}
		
		if(ilkHarf=='c' || ilkHarf=='C') {
	 System.out.println("Carsambai cuma veya cumartesi");			
	}
	 if(ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S' && ilkHarf!='c' && ilkHarf!='C' ) {}
		
		System.out.println("L�tfen gecerli bir harf yaz�n�z");
		scan.close();
	}

}
