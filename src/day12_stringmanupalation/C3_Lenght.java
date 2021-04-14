package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Lenght {

	public static void main(String[] args) {
		// Kullan�c�dan bir String g�rmes�n� �stey�n g�r�len 
		//str�ng �n son harfini buyuk harf olarak yazd�r�n
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir cumle giriniz");
		
		String str = scan.nextLine().toUpperCase();
		System.out.println("girdi�imiz cumlenin son harf�: " +str.charAt(str.length()-1));
		
		// length() method u g�r�len String in uzunlugunu verir
		
		System.out.println(str); // kullan�c�  ne g�rd�yse buyuk harfle onu yazd�r�r.
		
		String str2="";
		System.out.println(str2.length());// 0 al�r
		
		String str3 = null; // null hi� demek
		// normalde Stringler c�ft t�rnak i�ine yaz�l�r ama null i�in buna gerek yoktur
		// null case sensitive diri dolay�s�yla NULL veya Null yaz�lmaz
		// null bir deger degildir , sadece hi�li�i gosteren bir pointer dir.
		
		System.out.println(str3.length()); // RTE verir
		// null deger atanan String ile manipulation method lar� kullan�lmaz
		System.out.println(str3.equals(str2)); // 
		
		System.out.println(str.charAt(1));// indexi 1 olan (bastan ikinci ) harfi verir
		System.out.println(str3.charAt(1)); // RTE eror verir 
	}

}
