package day09;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir tam sayı giriniz");
		
		int sayi= scan.nextInt();
		
		System.out.println(sayi%2==0 ? "çiftsayı" : "teksayı");
		
		// girilen sayının mutlak degerini bulunuz
		// girilen sayi x olsun . x pozitifse |x|=x   negatifse |x|=-x
		System.out.println("sayının mutlak degeri = "+(sayi>0? sayi :-sayi));
		
		
		
	}

}
