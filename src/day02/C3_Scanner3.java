package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		// kullan�c�dan ismini ve soy ismini al�p aral�r�nda da bir bosluk b�rak�n�z
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" L�tfen isminizi giriniz");
		String name=scan.nextLine(); // sadece next secilirse kullan�c� birden fazla kelime girse ilk kelimeyi al�r
		// kullan�c�n�n girdi�i t�m yaz�y� almak �sterse nextLine() secmeliyiz.
		System.out.println("l�tfen soy ismini giriniz");
		String surname= scan.nextLine();
		System.out.println(name+" "+surname);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
