package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		
		
		// kullanýcýdan bir sayý isteyin ve sayýnýn tek veya cýft sayý oldugunu yazdýrýn
		
		Scanner scann = new Scanner(System.in);
		 System.out.println("Lütfen bir tam sayý giriniz");
		 int sayi=scann.nextInt();
		 // 153%2==0 sayý cýft
		 // 153==1 sayý tek
		 
		 if(sayi%2==0) {
			 
			System.out.println("girdiðiniz sayi cift sayidýr"); 
		 }
		 
		 if (sayi%2==1 || sayi%2==-1) {
			 System.out.println(""
			 		+ "girdiginiz sayi tek sayýdýr");
		 }
		 
		 System.out.println(sayi%2);
		 System.out.println("katýldýgýnýz için tesekkur ederiz");
	
		
		
		
	}

}
