package day13_stringmanipulation;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		//kuln�c�dan bir cumle �stey�n
		// cumledeki tum bosluklar� silin
		// tum a'lar�n yerine e yazd�r�n
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen bir cumle giriniz");
		String str= scan.nextLine();
	str=str.replace(" ","");
		str=str.replace("a","e");
		System.out.println(str); // atama yapmazsan�z i man�pulat�on str i degist�rmez
		// eger atama yaparsak str kalici olarak degistigi i�in biz bir daha orjinal str a ulasamaz
		//bunun i�in kullan�c�n�n ald�g�m�z str a degil yeni bir string atamak daha mant�kl�d�r
		
		System.out.println("L�tfen bir cumle giriniz");
		String str2= scan.nextLine();
		System.out.println(str2.replace(" ","").replace('a',  'e'));

		// hem a hemde e nin yerine i yazal�m
		System.out.println(str.replace("a", "i").replace('e',  'i'));
		
		// hem a hem de e nin yerine i yazal�m buyuk kucuk harf gozetmeksizin
		
		
		
	}

}
