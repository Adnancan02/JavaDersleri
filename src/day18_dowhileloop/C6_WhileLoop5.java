package day18_dowhileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen sayinin asal olup olmad�g�n� bulan program yaz�n
		// asal say� : 1 ve kendisine d�s�nda hic bir pozitif bolune yokt�u
		
		int sayi= 47;
		
		String  flag="Asal";
		
		int bolen =2;
		
		while(bolen <sayi ) {
			
			if (sayi%bolen==0) {
				flag= "Asal sayi degildir";
				
			}
			bolen++;
		}
		
		System.out.println(flag);
		
		
		
		
	}

}
