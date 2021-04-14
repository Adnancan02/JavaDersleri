package day18_dowhileloop;

import java.util.Scanner;

public class C5_WhileLoop {

	public static void main(String[] args) {
		// soru 6) Kullanicidan bir pazitif sayi alin ve bu sayiyi tam bolen sayilari ve toplam
		// kac tane olduklarini ekranda yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif tamsayi giriniz");
		int sayi= scan.nextInt();// 100 girdi kullanýcý
		int bolen=1;
		int count=0;
		while(bolen<=sayi) {
			
			if (sayi%bolen==0) {
				
				System.out.print(bolen+ " ");
				count++; // boleni bulunca count u bir artýrýyorum.
			}
			bolen++;
		}

		System.out.println(sayi + "sayisinin bolenleri : " + count + " adettir");
		
		// bolenleri su sekilde yazdýrýn
		//1- 1
		//2- 2		
		//3- 4
		//4- 5
		//5- 10
		
		 bolen=1;
		 count=0;
		while(bolen<=sayi) {
			
			if (sayi%bolen==0) {
				count++; // boleni bulunca count u bir artýrýyorum.
				System.out.println(count +"-" + bolen);
				
			}
			bolen++;
		}

		
		
		
	}

}
