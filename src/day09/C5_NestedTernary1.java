package day09;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		///Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
		//girilen degerlere gore dikdorgenin kare olup olmadigini yazdirin.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen kontrol i�in dikdortgenin kenar uzunluklar�n� giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
	//	System.out.println(kenar1==kenar2 ? "kare" : "kare degil");
		
		System.out.println(kenar1>0 && kenar2>0 ? kenar1==kenar2 ? 
				"kare" : "kare degil" : "gecersiz kenar uzunlugu");
		

	}

}
