package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {

		// Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren
		// bir program yazin.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen cevirmek istediginiz bir yaz� g�r�n�z");
		String yazi = scan.nextLine(); 
		// 1.yol variable olusturup en son yazd�rabilirim.
		String tersYazi="";
		
		
		
		for (int i = yazi.length()-1; i > 0; i--) {
			tersYazi+=yazi.charAt(i);
			
			
		}
		System.out.println("Girdigimiz yaz�n�n tersten Yaz�l�s� : "+tersYazi);
		//2. yol tersyazi yi sadece yazd�racaksak variable olusturmadan da yapabiliriz.
		
		System.out.println("Girdiginiz yaz�n�n tersi");
		for (int i = yazi.length()-1; i >=0; i--) {
		
			System.out.print(yazi.charAt(i));
			
		}
		System.out.println("");
		
		
	}

}
