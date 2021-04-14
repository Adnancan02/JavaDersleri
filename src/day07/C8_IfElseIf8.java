package day07;

import java.util.Scanner;

public class C8_IfElseIf8 {

	public static void main(String[] args) {

		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen maas teklifinizi giriniz");
		
//		 Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin. 	
//Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,	
//60 – 80.000 arasinda ise  “Konusabiliriz”, 60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin	
	
// 1. a>80000 2.a<60000 3 else
	double maas = scan.nextDouble();
	
	if (maas>80000) {
		System.out.println("Kabul ediyorum");
		
	} else if(maas>60000) {
		
		System.out.println("konuþabiliriz");
		

	} else {
	
		System.out.println("Maalesef kabul etmiyorum");
	}
	
	scan.close();
	}

}
