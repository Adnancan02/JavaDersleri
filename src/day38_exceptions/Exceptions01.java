package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		//Kullan�c�dan iki tamsay� al�n ve bolumlerini yaz�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bolunecek tamsay�y� yazd�r�n");
		int sayi1= scan.nextInt();
		System.out.println("Lutfen kaca bolmek �stediginizi yazin");
		int sayi2 = scan.nextInt();
		// Java exceptions'i handle etmek icin try-catch blogu olusturmus.
		
		
		
		
		try {
			
			System.out.println("b�lme islemini sonucu : "+ sayi1/sayi2);
			
		} catch(ArithmeticException e) {
			
			System.out.println("sayiyi s�f�r bolemezsin");
		}

	}

}
