package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		//istediðimiz kadar sayý girdigimizde tum sayýlarýn toplayan bir method yazalým.
		// Var----- variety den geliyor cesitlilik denir. args ----arguments
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);

	}
// varags adi i = var dir.
	public static void toplama(int... var) {//data turunde sonra yazdýgýmýz .... varags kullanacagýmýz anlama gelir.
		
		int toplam=0;
		for (int j : var) {// var git her biri int i bana sýrayla getir.
			toplam+=j;
			
		}
		
		System.out.println("toplam = " + toplam);
	}

}
