package day31_varargsstringbuilder;

public class C4_Varags03 {
	
	/* 
     * - Varargs tek method’a istediðimiz kadar parametre yollayarak sonuç almamizi saðlar. Yani parametre sayýmiz deðiþken ancak method’un 
     * yapacaðý iþ sabitse Varargs kullanarak tek method’la kodumuzu yazabiliriz.
     * - Varargs ozellik olarak list gibi calisir (uzunlugu esnektir) fakat varargs’in arka planinda Java Array ile calisir.(List olarak degil)
     * - Varargs’i declare etmek icin data type’dan sonra ... kullaniriz. (int... sayi vb..)
     * - Bir method’da varargs disinda parametre varsa varargs parametre olarak en sona yazilmalidir.(aksidurumda varargs nerede duracagini bilemez)
     * - Bir method’da sadece 1 varargs kullanilabilir
     */

	public static void main(String[] args) {
		//Verilen int lerden ilki hariç tum saylarý toplayýn ve buldgumuz toplam ilk sayiyi carpýp sonucu yazdýrýn.
		

		toplama(2, 5);
		toplama(5, 10, 15);
		toplama(4, 5, 9, 7);
		toplama(5, 6, 8, 10, 45, 78, -12);

	}

	public static void toplama( int sayi1, int... var) {// data turunde sonra yazdýgýmýz .... varags kullanacagýmýz anlamina
														// gelir.

		System.out.println("Varargs 'a dahil olmayan argument : " + sayi1);
		
		int toplam = 0;
		for (int each : var) {
			toplam+=each;
			
			
		}
		System.out.println(sayi1*toplam);
	}
}