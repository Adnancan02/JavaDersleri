package day07;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanicidan bir karakter girmesini isteyin
        // harf olup olmadigini yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir karakter giriniz ");
		
		char karakter= scan.next().charAt(0);
		
		if ((karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='z')) {
			
			System.out.println("Harf");
		} else {
			System.out.println("Harf değil");

		}

		
		scan.close();
	}

}
