package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Lenght {

	public static void main(String[] args) {
		// Kullanýcýdan bir String gýrmesýný ýsteyýn gýrýlen 
		//strýng ýn son harfini buyuk harf olarak yazdýrýn
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cumle giriniz");
		
		String str = scan.nextLine().toUpperCase();
		System.out.println("girdiðimiz cumlenin son harfý: " +str.charAt(str.length()-1));
		
		// length() method u gýrýlen String in uzunlugunu verir
		
		System.out.println(str); // kullanýcý  ne gýrdýyse buyuk harfle onu yazdýrýr.
		
		String str2="";
		System.out.println(str2.length());// 0 alýr
		
		String str3 = null; // null hiç demek
		// normalde Stringler cýft týrnak içine yazýlýr ama null için buna gerek yoktur
		// null case sensitive diri dolayýsýyla NULL veya Null yazýlmaz
		// null bir deger degildir , sadece hiçliði gosteren bir pointer dir.
		
		System.out.println(str3.length()); // RTE verir
		// null deger atanan String ile manipulation method larý kullanýlmaz
		System.out.println(str3.equals(str2)); // 
		
		System.out.println(str.charAt(1));// indexi 1 olan (bastan ikinci ) harfi verir
		System.out.println(str3.charAt(1)); // RTE eror verir 
	}

}
