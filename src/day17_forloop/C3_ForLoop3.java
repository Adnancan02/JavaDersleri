package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// Kullanýcýdan 35 ' dan kucuk pozitif bir sayi alin 
		// girilen sayinin faktoryelini hesaplayip yazdýran bir method olusturun.
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 35 ' dan kucuk pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();
        int faktoryel =1;
        if (sayi<=0 || sayi>=35) {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		} else {

			faktoryelBul(sayi);
		} 
		
		
	}

	public static void faktoryelBul(int sayi) {
		long faktoryel=1;
		for (int i = 1; i <= sayi; i++) {
			faktoryel*=i;
			System.out.println(faktoryel);
			
		}
		
	}

}
