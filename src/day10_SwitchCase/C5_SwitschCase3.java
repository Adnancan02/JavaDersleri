package day10_SwitchCase;

import java.util.Scanner;

public class C5_SwitschCase3 {

	public static void main(String[] args) {
		//kullan�c�dan hang� gunde oldugumuzu isteyin (yaz�yla)
		// girilen gunun hafta i�i ve hafta sonu oldugunu g�r�n�z
		
		Scanner scan=new Scanner(System.in);
        System.out.println("L�tfen hangi g�nde oldugunuzu giriniz");
        String g�n=scan.next().toLowerCase(); // pAZAR__>pazar dikkat gunleri hep kucuk yazmak laz�m
        
        
        switch (g�n) {
        case "pazartesi":     
        case "sali":          
        case "carsamba":          
        case "persembe":
        case "cuma":
            System.out.println("hafta ici");
            break;
        case "cumartesi":      
        case "pazar":
            System.out.println("hafta sonu");
            break;
        default:
            System.out.println("L�tfen tekrar giriniz");
          
        
        }

		
		
		scan.close();
		

	}

}
