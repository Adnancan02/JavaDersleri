package day10_SwitchCase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		// kullanýcýdan býr sayý alýn
		// sayý cýft ýse "cýft" yazdýrýn
		// degýlse sayýnýnn karesýný yazdýrýn
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen býr tam sayý gýrýnýz");
		int sayi = scan.nextInt();
	//  String sonuc= sayi%2==0? "cift" : sayi*sayi;( sayý uymaz uyarýsý verýr)
    String sonuc = sayi%2==0? "cift" : sayi*sayi +"";
	// eger ternary	
		System.out.println(sayi%2==0? "cift" : sayi*sayi);
		System.out.println(sonuc);
		

	}

}
