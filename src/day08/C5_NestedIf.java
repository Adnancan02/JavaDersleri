package day08;

import java.util.Scanner;

public class C5_NestedIf {

	public static void main(String[] args) {
	/*	Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	 Kullanicidan bir sifre girmesini isteyin
	 Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  
	 “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
 Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise 
  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
	*/ 
		// 1. iþlem kullanýcýdan sifreyi alýp ilk harfine bak
		// buyuk harfmi yoksa kucuk harf mý?
		
		Scanner scan= new Scanner(System.in);
		
	System.out.println("lütfen sifrenizi yazýnýz");
	char ilkHarf = scan.next().charAt(0);
		if (ilkHarf>='A' && ilkHarf<='Z') {
			if (ilkHarf=='A') {
				System.out.println("sifre gecerli");
				
			} else {
       System.out.println("sifre gecersiz");
			}
			
		} else if (ilkHarf>='a' && ilkHarf<='z') {
			
			if (ilkHarf=='z') {
				System.out.println("sifre gecerli");
			} else {
				System.out.println("sifre gecersiz");

			}
			
		} else {
			System.out.println("sifre gecersiz");

		} {

		}
		
		
	}

}
