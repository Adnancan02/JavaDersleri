package day07;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// 
		/*Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
		sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
		sayilarin ikisi  farkli isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin,  
		
		sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir�  yazdirin.
		*/
		//1. a= 0 || b=0 
		//2. a>0 && b>0
		//3. a<0 && b<0
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen iki sayi giriniz");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
	
		if(sayi1==0 && sayi2==0) {
			System.out.println("S�f�rdan carpmaya g�re yutan eleman�d�r");
			
		}else if(sayi1>0 && sayi2>0){
			System.out.println("say�lar�n toplam�n�= " +(sayi1+sayi2));
	
			
			
		}else if(sayi1<0 || sayi2<0) {
			System.out.println("sayilar�n carp�m� = "+ sayi1*sayi2);

		} else {
			System.out.println("farkl� isaretlerde say�larla i�lem yap�lmaz");
		}
		
		scan.close();
	}

}
