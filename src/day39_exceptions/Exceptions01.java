package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		// Java ya bir dosyayý okumasýný veya yazmasýný soyledýgýnýzde 
		// java "Ya dosyasi bulamazsam" der ve bizden cozum uretmemizi bekler
		// Dosya bulma ile ilgili exception turu: FileNotFoundException
		// Java kodu yazar yazmaz buradaki olasý problemi gorur ve CTE verir.
		// Kodumuzu yazdýgýmýz anda ortaya cýkan bu tur exception lara Checked Exceptions diyoruz.
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Adnan\\eclipse-workspace\\winter2021turkisch\\src\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
		// adresinde src1 yaparsak hata kodu verir	
		//	e.printStackTrace();// tum hata acýklamalarýný yazdýrrý ama kodumuz bloke olmaz.
			System.out.println(e.getMessage());
		}
		
		System.out.println("Kod bloke olmamýsss");

	}

}
