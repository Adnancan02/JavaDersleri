package day16_forloop;

import java.util.Scanner;

public class C4_ForLoop4 {

	public static void main(String[] args) {
		// 50 den buyk 150 den kucuk olan tam say�lar
		// 7 ile tam bolunebilenleri toplay�p
		// sonucu yazd�ran bir kod yaz�n�z
		
	
		
		int toplam=0;
		for (int i = 51; i < 150; i++) {
			if (i%7==0) {
				toplam+=i;  //toplam= toplma+i
			}
			
		}
		
		System.out.println(toplam);
	}

}
