package day07;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi isteyin
        // sayi pozitif ise "sayi pozitif" yazdirin
        // sayi 100'den kucukse "kucuk sayi" yazdirin
        // sayi 1000'den buyukse "buyuk sayi" yazdirin
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();
        
        if(sayi>0) {
        	
        	System.out.println("sayý pozitif");
        	
        } if (sayi<100) {
        System.out.println("Kucuk sayi");
        } if (sayi>100) {
        	System.out.println("buyuk sayý");
        }
    
        scan.close();

		
		
	}

}
