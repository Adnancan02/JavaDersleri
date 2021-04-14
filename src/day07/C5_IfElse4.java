package day07;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// 

		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ücgenin kenarlarini giriniz");
		double kenar1= scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if(kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eþkenar üçgen");
		
		}else {
			System.out.println("eþkenar deðil");
		}
		
		
		scan.close();
	}

}
