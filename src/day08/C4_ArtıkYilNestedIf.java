package day08;

import java.util.Scanner;

public class C4_Art�kYilNestedIf {

	public static void main(String[] args) {
		// Kullanicidan artik yil olup olmadigini kontrol 									
		 //	etmek icin yil girmesini isteyin.
		//Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		//	Kural 2: 4�un kati olmasina ragmen 100 ile	
			
			Scanner scan = new Scanner (System.in);
			System.out.println("L�tfen Y�l giriniz");
			int yil = scan.nextInt();
			
			if (yil%100==0) { // 10 bolune biliyor
				if (yil%400==0) {
					System.out.println("Art�k y�l");
				} else {
            System.out.println("Art�k y�l degil");
				}
				
				
				
				
				
			} else { // 100 bolunmmuyor

				if (yil%4==0) {
					System.out.println("Art�k y�l");
				} else {
					 System.out.println("Art�k y�l degil");

				}
			}
			
			scan.close();
			
	}

}
