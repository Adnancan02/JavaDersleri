package day07;

import java.util.Scanner;

public class C2_IfElse2 {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin kenar uzunluklarini alin
        // uzunluklar esit ise Kare, degilse Kare Degil yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Kenar uzunluklar�n� giriniz");
		 double kenar1= scan.nextDouble();
		 double kenar2= scan.nextDouble();
		 
		 if (kenar1==kenar2) {
			 System.out.println("Kare");
			
		} else {
			System.out.println("Kare de�il");

		}
		
		scan.close();
		
		
		
	}

}
