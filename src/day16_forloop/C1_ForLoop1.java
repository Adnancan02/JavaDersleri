package day16_forloop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		// kullan�c�dan pozitif iki say� al�n
		// ald�g�m�z degerlerden kucuk olandan baslay�p, buyuk olana kadar tum say�lar� yanyana(virg�lle ayrilarak) yazd�r�n
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 2 pozitif sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int kucukSayi=0;
		int buyukSayi=0;
		if(sayi1<0 || sayi2<0 ) {
			System.out.println("L�tfen pozitif sayi giriniz");
		}
			
		if (sayi1>sayi2) {
			buyukSayi= sayi1;
			kucukSayi= sayi2;
		} else {
			buyukSayi=sayi2;
			kucukSayi=sayi1;
		}
			for (int i= kucukSayi; i<=buyukSayi; i++) {
				System.out.println(i+ ",");
			}
 
		}
		
		
		
		
		
		
	}


