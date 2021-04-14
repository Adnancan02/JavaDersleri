package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		//istedi�imiz kadar say� girdigimizde tum say�lar�n toplayan bir method yazal�m.
		// Var----- variety den geliyor cesitlilik denir. args ----arguments
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);

	}
// varags adi i = var dir.
	public static void toplama(int... var) {//data turunde sonra yazd�g�m�z .... varags kullanacag�m�z anlama gelir.
		
		int toplam=0;
		for (int j : var) {// var git her biri int i bana s�rayla getir.
			toplam+=j;
			
		}
		
		System.out.println("toplam = " + toplam);
	}

}
