package day4;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan 4 basamakl� b�r say� alal�m ve
		// say�n�n basamaklarini ters sirada yazdiralim.
		
		// bir sayinin basamaklarini elde etmek i�in i�in i�lemi tekrar tekrar yapar�z.
		//1. i�lem en sondaki basama�� elde etmek
		//2 i�lem en sondaki basamg� yok etmek.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Basamklar�n� bulmak i�in 4 basamkl� bir sayi giriniz");
		
		int sayi= scan.nextInt();// bu sat�rdan itibaren elimizde 4 basamkl� say� var
		
		// 4 basamag� elde etmek i�in yukarida yazdi�imiz i�lemi 3 kere yapiyoruz.
		//1.tekrar
		int birlerBas= sayi%10;
		sayi/=10;
		// bu sat�rdan itibaren sayimiz 3 basamakl� oldu.
		// onlar basam�g�n� bulmak i�in 2.tekrar
		
		int onlarBas = sayi % 10;
		sayi/=10;
		//bu sat�rdan itibaren sayimiz 2 basamakli
		//3.tekrar
		int y�zlerBas= sayi % 10;
		sayi/=10;
		// bu sat�rdan itibaren sayimiz 1 basamakl�
		int binlerBas =sayi % 10; // burda % i�lemi yapmak zorunda degi�iliz.
		// tum basamaklar var
		// tum basamaklar� yazd�ral�m
		System.out.println("Birler basamg� : "+ birlerBas);
		
		System.out.println("Onlar basamg� : "+ onlarBas);
		
		System.out.println("Y�zler basamg� : "+ y�zlerBas);
		
		System.out.println("Binler basamg� : "+ binlerBas);
		// sayiyi tersten yazd�ral�m
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(y�zlerBas);
		System.out.print(binlerBas);
		
		System.out.println();
		// sayinin rakamlari toplamini bulal�m
		System.out.println(birlerBas+onlarBas+y�zlerBas+binlerBas);
		//rakamlar� toplam�n� degil say�lar� yanyana yazdirmak istersek
		System.out.println("Yazdiginiz sayinin tersten yazilisi :" + birlerBas+onlarBas+y�zlerBas+binlerBas);
		int yuzlerBasamag�=sayi;
		System.out.println(yuzlerBasamag�);
		scan.close();
	}

}
