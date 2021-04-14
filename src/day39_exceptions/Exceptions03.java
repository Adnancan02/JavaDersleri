package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		/* Icice try-catch yerine 
		 1 tane try ve multiple catch blogu kullanabiliriz.
		 Ancak bu durumda yazdýgýmýz exceptionlar arasýnda Parent-Child iliþkisi varsa once child class i yazmalýyýz.
		 Aksi taktirde (yani once parent yazýlýrsa ) child a is kalmaz.
		 Java eriþilemez catch-blogu dýyerek CTE verir
		*/
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Adnan\\eclipse-workspace\\winter2021turkisch\\src\\day39_exceptions\\File");
		int k=0;
		
			while ((k=fis.read())!=-1) {
				
				System.out.print((char)k); 
			
			}	
			
		} catch (FileNotFoundException e) { // once child exception i yazdýk 
			
			e.printStackTrace();
		
		
		
		} catch (IOException e) { // sonra parent exception
		
			System.out.println(e.getMessage());
		}
		
		System.out.println("");
		
		System.out.println("Kod bloke olmamýsss");
		
		
	}

}
