package day10_SwitchCase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		// kullan�c�dan b�r say� al�n
		// say� c�ft �se "c�ft" yazd�r�n
		// deg�lse say�n�nn kares�n� yazd�r�n
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen b�r tam say� g�r�n�z");
		int sayi = scan.nextInt();
	//  String sonuc= sayi%2==0? "cift" : sayi*sayi;( say� uymaz uyar�s� ver�r)
    String sonuc = sayi%2==0? "cift" : sayi*sayi +"";
	// eger ternary	
		System.out.println(sayi%2==0? "cift" : sayi*sayi);
		System.out.println(sonuc);
		

	}

}
