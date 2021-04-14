package day12_stringmanupalation;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
	
		
		// Kullanýcýdan bir cumle alýn ve asagýdaki uc durumdan uygun olaný yazdýrýn
		// 1 cumle java içeriyor
		// 2 cumle 1 tane java içeriyor
		// 3 cumlede birden fazla java var
		

		
		Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen bir cumle giriniz");
	 String cumle = scan.nextLine().toLowerCase();
	 int ilkJava = cumle.indexOf("java");
	 int sonJava = cumle.lastIndexOf("java");
	if (ilkJava==-1) {
		System.out.println("cumle java içermiyor");
	} else if (ilkJava== sonJava) {
		System.out.println("cumle 1 java kelimesi içeriyor");
	} else {
System.out.println("cumle 1 den fazla java içeriyor");
	}{

	}
	
	
	}

}
