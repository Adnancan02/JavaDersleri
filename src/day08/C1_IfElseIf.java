package day08;

import java.util.Scanner;

public class C1_IfElseIf {

	 public static void main(String[] args) {
		/*Kullanicidan gun ismini yazmasini isteyin
		 * Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdir�n
		 * 
		 * gun  ismi  gecerli degilse �Gecerli gun ismi giriniz� yazdirin
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen gun ismi giriniz");
		
		String gunIsm� = scan.nextLine().toLowerCase();
		
		if(gunIsm�.equalsIgnoreCase("pazar") || gunIsm�.equalsIgnoreCase("pazartesi")) {
			System.out.println("paz");
			
		}else if(gunIsm�.equalsIgnoreCase("sali")) {
			System.out.println("sal");
		} else if(gunIsm�.equalsIgnoreCase("carsamba")) {
		
		System.out.println("car");
		
		}else if(gunIsm�.equalsIgnoreCase("persembe")) {
			System.out.println("per");
		}else if (gunIsm�.equalsIgnoreCase("cuma")) {
			System.out.println("cum");
		} else {
			System.out.println("L�tfen gecerli gun ismini giriniz");
		}
			
			
			
			
			
			
			
			
	
		}
}
