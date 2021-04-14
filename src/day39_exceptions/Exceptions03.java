package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		/* Icice try-catch yerine 
		 1 tane try ve multiple catch blogu kullanabiliriz.
		 Ancak bu durumda yazd�g�m�z exceptionlar aras�nda Parent-Child ili�kisi varsa once child class i yazmal�y�z.
		 Aksi taktirde (yani once parent yaz�l�rsa ) child a is kalmaz.
		 Java eri�ilemez catch-blogu d�yerek CTE verir
		*/
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Adnan\\eclipse-workspace\\winter2021turkisch\\src\\day39_exceptions\\File");
		int k=0;
		
			while ((k=fis.read())!=-1) {
				
				System.out.print((char)k); 
			
			}	
			
		} catch (FileNotFoundException e) { // once child exception i yazd�k 
			
			e.printStackTrace();
		
		
		
		} catch (IOException e) { // sonra parent exception
		
			System.out.println(e.getMessage());
		}
		
		System.out.println("");
		
		System.out.println("Kod bloke olmam�sss");
		
		
	}

}
