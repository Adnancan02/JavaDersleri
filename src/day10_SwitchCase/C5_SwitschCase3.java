package day10_SwitchCase;

import java.util.Scanner;

public class C5_SwitschCase3 {

	public static void main(String[] args) {
		//kullanýcýdan hangý gunde oldugumuzu isteyin (yazýyla)
		// girilen gunun hafta içi ve hafta sonu oldugunu gýrýnýz
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen hangi günde oldugunuzu giriniz");
        String gün=scan.next().toLowerCase(); // pAZAR__>pazar dikkat gunleri hep kucuk yazmak lazým
        
        
        switch (gün) {
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
            System.out.println("Lütfen tekrar giriniz");
          
        
        }

		
		
		scan.close();
		

	}

}
