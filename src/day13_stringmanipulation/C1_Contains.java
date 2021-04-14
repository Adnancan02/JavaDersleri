package day13_stringmanipulation;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
	     Scanner scan= new Scanner (System.in);
		 /* 
		System.out.println("Lütfen bir cümle giriniz");
		String cumle= scan.nextLine().toLowerCase(); // Java guzel
		System.out.println("Lütfen arammi istediðinizi String i giriniz");
		String aranan =scan.nextLine().toLowerCase(); // java
		
		System.out.println(cumle.contains(aranan) ? "Basarýlý" : "Basarýsýz");
		
		*/
		// kullanýcýdan mail adresini isteyi. Mail adresi '@gmail.com iceriyorsa
		// "mailiniz kaydedildi" yoksa "Lütfen gmail adresini giriniz" yazdýrýn
		
		
		
		
		System.out.println("Lutfen mailinizi giriniz");
		String email = scan.next();
		if (email.contains("@gmail.com")) {
			System.out.println("mailiniz kaydedildi");
		} else {
          System.out.println("Lutfen gmail adresinizi giriniz");
          
          // eger @gmail.com un en sonda oldugunu kontrol etmek ýstersek
        int sondami= email.indexOf("@gmail.com", email.length()-10);
        // index olarak length()-10 yazarsak
        // eger email gmail.com ile bitiyorsa bu islemin sonucu bir index olur(int)
        // eger email gmail.com ile bitiyorsa -1
        
        if (email.contains("@gmail.com")&& sondami!=-1) {
			System.out.println("mailiniz kaydedildi");
			
		} else {
            System.out.println("lutfen gecerli gmail adresinizi giriniz");
		}
        
		}
		
		
	}

}
