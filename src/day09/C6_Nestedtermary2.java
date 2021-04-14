package day09;

import java.util.Scanner;

public class C6_Nestedtermary2 {

	public static void main(String[] args) {
		/*Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , 
		 *buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
		*/
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		char harf= scan.next().charAt(0);
		if (harf>='a' && harf<='z') {
			System.out.println("Kucuk harf");
			
		}else if (harf>='A' && harf<='Z') {
			System.out.println("Buyuk harf");
			
		} else {
			System.out.println("Giris hatalý, lutfenharf giriniz!");
		}
		
	
		
		
		
		
		

	}

}
