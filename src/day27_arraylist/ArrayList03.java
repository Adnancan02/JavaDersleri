package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		// Kullanýcýdan pozýtýf býr tam sayý alýn
		// aldýgýnýz sayýdan kucuk olan fýbonaccý dýzýsý elemanlarýný yazdýrýn
		//1 1 2 3 5 8 13 21
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen pozitif býr tamsayý gýrýnýz");
		int sayi = scan.nextInt();
		List<Integer> fibo = new ArrayList<>();
		
		fibo.add(1);
		fibo.add(1);
		
		System.out.println(fibo);
		
		System.out.println(fibo.get(0)+ fibo.get(1));
		
		/* for (int i = 2; fibo.get(i-2) +fibo.get(i-1)< sayi; i++) {
			fibo.add(fibo.get(i-2) +fibo.get(i-1));
			
		}
		
		System.out.println(fibo);
		*/
		
		int i= 2;
		int yeniSayi=0;
		
		while(yeniSayi<sayi) {
			yeniSayi= fibo.get(i-2) + fibo.get(i-1);
			fibo.add(yeniSayi);
			i++;
		}
 
		System.out.println(fibo);
 
 
 
	
	}

}
