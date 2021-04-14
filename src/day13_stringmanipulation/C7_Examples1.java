package day13_stringmanipulation;

import java.util.Scanner;

class C7_Examples1 {

	public static void main(String[] args) {

 //
		Scanner scan= new Scanner(System.in);
				System.out.println("4 harfli bir kelime giriniz");
		String str= scan.nextLine();
		if (str.length()!=4) {
			System.out.println("Lutfen 4 karakterli bir kelime giriniz");
		} else {
			System.out.println(str.substring(3));

		}
				
	}

}
