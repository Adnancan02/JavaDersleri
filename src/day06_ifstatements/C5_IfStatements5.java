package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatements5 {

	public static void main(String[] args) {
		//Kullanicidan bir dikdortgenin iki kenar uzunlugunu alin
		// kenar uzunluklari esitse "kare"
		// esit degilse "dikdortgen" yazdirin
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen dikd�rtgenin iki kenar uunlu�unu giriniz");
		double kenar1=scan.nextDouble();
		double kenar2= scan.nextDouble();
		
		if(kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("Kare");
		}
		if(kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Dikd�rtgen");
		}
		
		if(kenar1<=0 || kenar2<=0 ) {
			System.out.println("L�tfen gecerli uzunluk giriniz");
			
			
			// bug: yaz�l�mdaki hatalara denir.
		}
		
		scan.close();
		
		
		
	}

}
