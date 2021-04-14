package day10_SwitchCase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		// 
	//	kullanýcýdan 3 basamaklý býr sayý alýn
	//	Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa  
	//“Uc  basamakli degil” yazdirin
		//		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen býr tam sayý gýrýnýz");
		int sayi = scan.nextInt();
		String sonuc= sayi>= 100 ? ( sayi<1000 ? "uc basamaklý" : "uc basamklý degil"): "uc basamaklý degil";
		System.out.println(sonuc);
		
		// nested ternary olmasýn
		
		String sonuc2=sayi>=100 && sayi<=1000 || sayi<=-100 && sayi>-100 ? "uc basamaklý" : "uc basamaklý degýl" ;
		
  System.out.println(sonuc2);
	}

}
