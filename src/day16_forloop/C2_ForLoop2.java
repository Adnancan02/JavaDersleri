package day16_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		// Kullan�c�dan iki tam sayi al�n
		// ilk sayidan ikinci sayiya kadar tum tam say�lar�
		// yanyana aralar�nda bosluk olarak yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 2 pozitif sayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		if (sayi1>sayi2) {
			for(int i= sayi1; i >= sayi2; i--) {
				System.out.print(i+ " ");
			}
			
		} else { // sayi1<=sayi2

			for(int i= sayi1; i <= sayi2; i++) {
				System.out.print(i+ " ");
			}
		}

		
	}

}
