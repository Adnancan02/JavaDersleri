package day21_scope;

public class Scope5 {
	
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			
			String isim="Ayse";
			System.out.println(i + " " +isim);
		}
		//System.out.println(isim); // Loop i�inden olusturulan variable'lar loop 'a ozeldir
		// ve loop d�s�nda kullan�lmaz
		for (int i = 0; i < 5; i++) {
			System.out.print(i+ " ");
			
		}
		//System.out.println(i); bu cal�smaz cunku loop i�inde degil.
		int count=0;// method ' a ait local variable'dir. Deger atamadan kullanmaya cal�s�rsak CTE aliriz.
		while(count<5) {
			System.out.println(count);
			count++;
		}
	}

}
