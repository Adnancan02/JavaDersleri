package day02;

import java.util.Scanner;

public class C2_Scanner22 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		//char ilkHarf = scan.next().toUpperCase();
		
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		// String de harflerin index leri s�f�rdan baslar.
		// biz ilk harfi almak istedi�imiz i�in index olarak 0 girmeliyiz.
		
		System.out.println("bas harfiniz : " + ilkHarf);
		
		scan.close();
		
		
			}
	

}
