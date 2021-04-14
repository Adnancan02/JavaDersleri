package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		 /* Nested try catch var. Disarda olan Dosya bulunamazsa diyeydi, FileNotFoundException. 
         * Dosyayi buldu diyelim simdi icerideki try catch'e bakacagim burada ise Dosyayi Okuyamazsam durumuna bakiyorum, IOException.
         * FileNotFoundException is-A IOException iliskisi var . Eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum
         * olusuyorsa, nested try-catch bloklari olusturabiliriz. Bu ornekte ilk once dosyayi okutmak istedik,
         * Java, "Ya dosyayi bulamazsam ? " diye bizden yardim istedi . Biz de try-catch blogu ile FileNOTDounfException ile 
         * handle etmesinde yardimci olduk. Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "Ya dosyayi okuyamazsam"
         * diye yardim istedi, biz de try-catch blogu ile IOException ile handle etmesini sagladik.
         */ 
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Adnan\\eclipse-workspace\\winter2021turkisch\\src\\day39_exceptions\\File");
		int k=0;
		try {
			while ((k=fis.read())!=-1) {
				
				System.out.print((char)k); // Eger buraya char yazmasaydýk File içindeki harflerin ASCI degerlerini alýr.
				//bu olmamasý için char yazdýk.
				
			}
		} catch (IOException e) {// Dosyalarla ilgili genel yazma ve okuma sorunlarý ile handle eder
			
			e.printStackTrace();
		}
		
		
		} catch (FileNotFoundException e) {
		
			System.out.println(e.getMessage());
		}
		
		System.out.println("Kod bloke olmamýsss");

	}

}
