package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		// Kullan�c�dan poz�t�f b�r tam say� al�n
		// ald�g�n�z say�dan kucuk olan f�bonacc� d�z�s� elemanlar�n� yazd�r�n
		//1 1 2 3 5 8 13 21
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen pozitif b�r tamsay� g�r�n�z");
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
