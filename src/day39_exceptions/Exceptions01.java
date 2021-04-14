package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		// Java ya bir dosyay� okumas�n� veya yazmas�n� soyled�g�n�zde 
		// java "Ya dosyasi bulamazsam" der ve bizden cozum uretmemizi bekler
		// Dosya bulma ile ilgili exception turu: FileNotFoundException
		// Java kodu yazar yazmaz buradaki olas� problemi gorur ve CTE verir.
		// Kodumuzu yazd�g�m�z anda ortaya c�kan bu tur exception lara Checked Exceptions diyoruz.
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Adnan\\eclipse-workspace\\winter2021turkisch\\src\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
		// adresinde src1 yaparsak hata kodu verir	
		//	e.printStackTrace();// tum hata ac�klamalar�n� yazd�rr� ama kodumuz bloke olmaz.
			System.out.println(e.getMessage());
		}
		
		System.out.println("Kod bloke olmam�sss");

	}

}
