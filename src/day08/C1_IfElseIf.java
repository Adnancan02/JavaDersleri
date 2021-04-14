package day08;

import java.util.Scanner;

public class C1_IfElseIf {

	 public static void main(String[] args) {
		/*Kullanicidan gun ismini yazmasini isteyin
		 * Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirýn
		 * 
		 * gun  ismi  gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen gun ismi giriniz");
		
		String gunIsmý = scan.nextLine().toLowerCase();
		
		if(gunIsmý.equalsIgnoreCase("pazar") || gunIsmý.equalsIgnoreCase("pazartesi")) {
			System.out.println("paz");
			
		}else if(gunIsmý.equalsIgnoreCase("sali")) {
			System.out.println("sal");
		} else if(gunIsmý.equalsIgnoreCase("carsamba")) {
		
		System.out.println("car");
		
		}else if(gunIsmý.equalsIgnoreCase("persembe")) {
			System.out.println("per");
		}else if (gunIsmý.equalsIgnoreCase("cuma")) {
			System.out.println("cum");
		} else {
			System.out.println("Lütfen gecerli gun ismini giriniz");
		}
			
			
			
			
			
			
			
			
	
		}
}
