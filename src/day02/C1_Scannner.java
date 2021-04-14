package day02;

import java.util.Scanner;

public class C1_Scannner {

	public static void main(String[] args) {
		
   // Scanner ile kullanýcýdan bilgi alabiliriz.
		// 3 adýmla scanner iþlemini gerceklestiriyoruz.
		
		
		// 1.adým Scanner objesi  olusturucagýz.
		
		
		Scanner scan = new Scanner(System.in);
		
		// Scanner tarayýcu = '''''''''
		
		// new: Java da ne zaman new kelimesini gorseni yeni objeckt olusturuluyor demektir.
		// parantezinin içine yazýlan degerler parametre diyoruz ve scanner için system  in yazmamýz gerekir.
		// bir kod yaxdýgýmýzda kodun altýnda kýrmýzý çicgi olusuyorsa veya satýr numarasý
		
		// olan kýsýmda kýrmýzý x olusuyorsa bir seyler yanlýs demektir.
		// java.util java nýn bizim hazýrladýgý bir kutuphanedir, ihtiyacýmýz oldugunda alabiliriz.
		// class a import etmemiz yeterlidir.
		// scan olusturdugumuz scanner objesine verdiðimiz isimdir. Farklý isimler de verebiliriz.
		// ancak scan ismi tum programcýlar tarafýndan kullanýlan bir ismidir.
		// kodumuz anlasýlabilir ve rahat okunabilir olmasý için scan ismini kullanmamýz tavsiye edilir.
		
		// 2. adim kullanýcýya bir mesaj yazýn.
		 System.out.println("Karenin bir kenar uzunluðunu girin");
		
		 // 3. adim kullanýcýný konsola girdiði degeri programimiza alacagýz.
		// ve variable olusturup bu degeri atayacagýz.
		 // kullanýcýlarýn bir kenar uzunlugu istendiðim için kullanýcý kucuk bir sayý
		 // da girebilir, büyük bir sayý da yazabilir, tam sayý da yazabilir, virgüllü sayý da yazabiliriz.
		 
		 double kenar = scan.nextDouble();
		 System.out.println(kenar*kenar);
		 
		 scan.close();
	
		 
		
		
		
		
	}
	

}
