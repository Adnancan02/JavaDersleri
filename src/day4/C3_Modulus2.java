package day4;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		
		// kullanýcýdan 4 basamaklý býr sayý alalým ve
		// sayýnýn basamaklarini ters sirada yazdiralim.
		
		// bir sayinin basamaklarini elde etmek için için iþlemi tekrar tekrar yaparýz.
		//1. iþlem en sondaki basamaðý elde etmek
		//2 iþlem en sondaki basamgý yok etmek.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Basamklarýný bulmak için 4 basamklý bir sayi giriniz");
		
		int sayi= scan.nextInt();// bu satýrdan itibaren elimizde 4 basamklý sayý var
		
		// 4 basamagý elde etmek için yukarida yazdiðimiz iþlemi 3 kere yapiyoruz.
		//1.tekrar
		int birlerBas= sayi%10;
		sayi/=10;
		// bu satýrdan itibaren sayimiz 3 basamaklý oldu.
		// onlar basamýgýný bulmak için 2.tekrar
		
		int onlarBas = sayi % 10;
		sayi/=10;
		//bu satýrdan itibaren sayimiz 2 basamakli
		//3.tekrar
		int yüzlerBas= sayi % 10;
		sayi/=10;
		// bu satýrdan itibaren sayimiz 1 basamaklý
		int binlerBas =sayi % 10; // burda % iþlemi yapmak zorunda degiðiliz.
		// tum basamaklar var
		// tum basamaklarý yazdýralým
		System.out.println("Birler basamgý : "+ birlerBas);
		
		System.out.println("Onlar basamgý : "+ onlarBas);
		
		System.out.println("Yüzler basamgý : "+ yüzlerBas);
		
		System.out.println("Binler basamgý : "+ binlerBas);
		// sayiyi tersten yazdýralým
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yüzlerBas);
		System.out.print(binlerBas);
		
		System.out.println();
		// sayinin rakamlari toplamini bulalým
		System.out.println(birlerBas+onlarBas+yüzlerBas+binlerBas);
		//rakamlarý toplamýný degil sayýlarý yanyana yazdirmak istersek
		System.out.println("Yazdiginiz sayinin tersten yazilisi :" + birlerBas+onlarBas+yüzlerBas+binlerBas);
		int yuzlerBasamagý=sayi;
		System.out.println(yuzlerBasamagý);
		scan.close();
	}

}
