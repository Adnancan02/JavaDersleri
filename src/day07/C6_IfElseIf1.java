package day07;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin. 
		
	//50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen Notunuzu Giriniz");
		double not=scan.nextDouble();
		
		if (not<0 || not>100 ) { // istenmeyen durum
			System.out.println("Lütfen gecerli bir not gýrýnýz");
		
	}  else if (not<50) { // notumuz 0 <=not<100 0 ile 100 arasýnda
		System.out.println("Notumuz : D ");
		
		
	} else if(not<60) {
		System.out.println("Notunuz : C");
		
		
	} else if(not<80) { // not 60 ile 100 arasýnda
		System.out.println("Notunu : B ");

		
	} else { // notumuz 80 ile 100 arasýnda
		
		System.out.println("Notunuz : A ");
		
		
	}
		scan.close();
		
	}
		
		
	}
	
		



