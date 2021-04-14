package day09;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen karsılastırmak icin iki sayi giriniz");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		System.out.println(sayi1>=sayi2 ? sayi1 : sayi2);
		
		
		

	}

}
