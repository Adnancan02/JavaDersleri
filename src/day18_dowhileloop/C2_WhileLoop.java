package day18_dowhileloop;

public class C2_WhileLoop {

	public static void main(String[] args) {
		// While : iken, oldu�u s�rece
	   // 10 dan 30 a kadar olan say�lardan 4 ile bolunbilenler
		//
		
		
		
		// once for loop ile yapal�m
		
		for (int i = 10; i <= 30 ; i++) {
			if (i%4==0) {
				System.out.print(i+ " ");
			}
			
		}
		
		System.out.println("");
		
		// ayn�s�n� while loop ile yapal�m
		int sayi=10; // 1.sart gerceklesd�rdim
		while (sayi<=30) {// 2. sarti gerceklestirdim (bitis kosulu)
			if (sayi%4==0) {
				System.out.print(sayi + " ");
			
			}
		sayi++;  // 3. sart� gerceklestirdim( art�s, degi�im degeri)	
	
			
		}

	}

}
