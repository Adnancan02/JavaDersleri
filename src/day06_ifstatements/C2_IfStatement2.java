package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan bir say� isteyin ve say�n�n tek veya c�ft say� oldugunu yazd�r�n
		
		Scanner scann = new Scanner(System.in);
		 System.out.println("L�tfen bir tam say� giriniz");
		 int sayi=scann.nextInt();
		 // 153%2==0 say� c�ft
		 // 153==1 say� tek
		 
		 if(sayi%2==0) {
			 
			System.out.println("girdi�iniz sayi cift sayid�r"); 
		 }
		 
		 if (sayi%2==1 || sayi%2==-1) {
			 System.out.println(""
			 		+ "girdiginiz sayi tek say�d�r");
		 }
		 
		 System.out.println(sayi%2);
		 System.out.println("kat�ld�g�n�z i�in tesekkur ederiz");
	
		
		
		
	}

}
