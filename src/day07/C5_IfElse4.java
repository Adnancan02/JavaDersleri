package day07;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// 

		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�cgenin kenarlarini giriniz");
		double kenar1= scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if(kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("E�kenar ��gen");
		
		}else {
			System.out.println("e�kenar de�il");
		}
		
		
		scan.close();
	}

}
