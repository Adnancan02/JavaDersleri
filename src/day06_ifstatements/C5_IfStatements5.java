package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatements5 {

	public static void main(String[] args) {
		//Kullanicidan bir dikdortgenin iki kenar uzunlugunu alin
		// kenar uzunluklari esitse "kare"
		// esit degilse "dikdortgen" yazdirin
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen dikdörtgenin iki kenar uunluğunu giriniz");
		double kenar1=scan.nextDouble();
		double kenar2= scan.nextDouble();
		
		if(kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("Kare");
		}
		if(kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Dikdörtgen");
		}
		
		if(kenar1<=0 || kenar2<=0 ) {
			System.out.println("Lütfen gecerli uzunluk giriniz");
			
			
			// bug: yazılımdaki hatalara denir.
		}
		
		scan.close();
		
		
		
	}

}
