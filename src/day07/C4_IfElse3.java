package day07;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// 
// kullan�c�dan yas�n� sorun
		// 65 den buyukse "emekli olabilirsin" yoksa emekli olamazs�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		if(yas>=65 ) {
			System.out.println("Emeki olabilirsin");
		}else {
				System.out.println("Emekli olamazs�n");
			}
		scan.close();
	}

}
