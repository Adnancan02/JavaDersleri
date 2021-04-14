package day19_WhileLoop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullanýcýdan bir cumle alýn, while loop kullanarak
		// Cumlede buyuk harf var mý, yok mu yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle =scan.nextLine();
		
		String flag = "yok";
		
		int index=0;
		
		while (index<cumle.length()) {
			
			if (cumle.charAt(index)>='A' && cumle.charAt(index)<='Z') {
				flag="var";
			}
			index++;
		
		}
		
		System.out.println("Verdiðiniz cumlede buyuk harf " +flag);
		
	}

}
