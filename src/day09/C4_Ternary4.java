package day09;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen bir tam say� giriniz");
		
		int sayi= scan.nextInt();
		
		System.out.println(sayi%2==0 ? "�iftsay�" : "teksay�");
		
		// girilen say�n�n mutlak degerini bulunuz
		// girilen sayi x olsun . x pozitifse |x|=x   negatifse |x|=-x
		System.out.println("say�n�n mutlak degeri = "+(sayi>0? sayi :-sayi));
		
		
		
	}

}
