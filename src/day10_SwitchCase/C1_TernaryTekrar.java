package day10_SwitchCase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		// 
	//	kullan�c�dan 3 basamakl� b�r say� al�n
	//	Kullanicidan bir sayi alin ve sayi 3 basamakli ise �uc basamakli sayi�, yoksa  
	//�Uc  basamakli degil� yazdirin
		//		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen b�r tam say� g�r�n�z");
		int sayi = scan.nextInt();
		String sonuc= sayi>= 100 ? ( sayi<1000 ? "uc basamakl�" : "uc basamkl� degil"): "uc basamakl� degil";
		System.out.println(sonuc);
		
		// nested ternary olmas�n
		
		String sonuc2=sayi>=100 && sayi<=1000 || sayi<=-100 && sayi>-100 ? "uc basamakl�" : "uc basamakl� deg�l" ;
		
  System.out.println(sonuc2);
	}

}
