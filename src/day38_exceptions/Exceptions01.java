package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		//Kullanýcýdan iki tamsayý alýn ve bolumlerini yazýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bolunecek tamsayýyý yazdýrýn");
		int sayi1= scan.nextInt();
		System.out.println("Lutfen kaca bolmek ýstediginizi yazin");
		int sayi2 = scan.nextInt();
		// Java exceptions'i handle etmek icin try-catch blogu olusturmus.
		
		
		
		
		try {
			
			System.out.println("bölme islemini sonucu : "+ sayi1/sayi2);
			
		} catch(ArithmeticException e) {
			
			System.out.println("sayiyi sýfýr bolemezsin");
		}

	}

}
