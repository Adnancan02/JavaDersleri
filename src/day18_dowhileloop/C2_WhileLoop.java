package day18_dowhileloop;

public class C2_WhileLoop {

	public static void main(String[] args) {
		// While : iken, olduðu sürece
	   // 10 dan 30 a kadar olan sayýlardan 4 ile bolunbilenler
		//
		
		
		
		// once for loop ile yapalým
		
		for (int i = 10; i <= 30 ; i++) {
			if (i%4==0) {
				System.out.print(i+ " ");
			}
			
		}
		
		System.out.println("");
		
		// aynýsýný while loop ile yapalým
		int sayi=10; // 1.sart gerceklesdýrdim
		while (sayi<=30) {// 2. sarti gerceklestirdim (bitis kosulu)
			if (sayi%4==0) {
				System.out.print(sayi + " ");
			
			}
		sayi++;  // 3. sartý gerceklestirdim( artýs, degiþim degeri)	
	
			
		}

	}

}
