package day02;

import java.util.Scanner;

public class C1_Scannner {

	public static void main(String[] args) {
		
   // Scanner ile kullan�c�dan bilgi alabiliriz.
		// 3 ad�mla scanner i�lemini gerceklestiriyoruz.
		
		
		// 1.ad�m Scanner objesi  olusturucag�z.
		
		
		Scanner scan = new Scanner(System.in);
		
		// Scanner taray�cu = '''''''''
		
		// new: Java da ne zaman new kelimesini gorseni yeni objeckt olusturuluyor demektir.
		// parantezinin i�ine yaz�lan degerler parametre diyoruz ve scanner i�in system  in yazmam�z gerekir.
		// bir kod yaxd�g�m�zda kodun alt�nda k�rm�z� �icgi olusuyorsa veya sat�r numaras�
		
		// olan k�s�mda k�rm�z� x olusuyorsa bir seyler yanl�s demektir.
		// java.util java n�n bizim haz�rlad�g� bir kutuphanedir, ihtiyac�m�z oldugunda alabiliriz.
		// class a import etmemiz yeterlidir.
		// scan olusturdugumuz scanner objesine verdi�imiz isimdir. Farkl� isimler de verebiliriz.
		// ancak scan ismi tum programc�lar taraf�ndan kullan�lan bir ismidir.
		// kodumuz anlas�labilir ve rahat okunabilir olmas� i�in scan ismini kullanmam�z tavsiye edilir.
		
		// 2. adim kullan�c�ya bir mesaj yaz�n.
		 System.out.println("Karenin bir kenar uzunlu�unu girin");
		
		 // 3. adim kullan�c�n� konsola girdi�i degeri programimiza alacag�z.
		// ve variable olusturup bu degeri atayacag�z.
		 // kullan�c�lar�n bir kenar uzunlugu istendi�im i�in kullan�c� kucuk bir say�
		 // da girebilir, b�y�k bir say� da yazabilir, tam say� da yazabilir, virg�ll� say� da yazabiliriz.
		 
		 double kenar = scan.nextDouble();
		 System.out.println(kenar*kenar);
		 
		 scan.close();
	
		 
		
		
		
		
	}
	

}
