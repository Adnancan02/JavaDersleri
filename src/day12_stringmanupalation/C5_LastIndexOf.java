package day12_stringmanupalation;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
	
		
		// Kullan�c�dan bir cumle al�n ve asag�daki uc durumdan uygun olan� yazd�r�n
		// 1 cumle java i�eriyor
		// 2 cumle 1 tane java i�eriyor
		// 3 cumlede birden fazla java var
		

		
		Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen bir cumle giriniz");
	 String cumle = scan.nextLine().toLowerCase();
	 int ilkJava = cumle.indexOf("java");
	 int sonJava = cumle.lastIndexOf("java");
	if (ilkJava==-1) {
		System.out.println("cumle java i�ermiyor");
	} else if (ilkJava== sonJava) {
		System.out.println("cumle 1 java kelimesi i�eriyor");
	} else {
System.out.println("cumle 1 den fazla java i�eriyor");
	}{

	}
	
	
	}

}
