package day23_statickeyword;

public class StaticBlock {
	// static block class cal�st�r�ld�g�nda ilk olarak cal�s�r(main method' dan bile once cal�s�r)
	// static block lar static variable'lara deger atamak i�in kullanilir.
	
	static String isim;
	
	static {
		System.out.println("1.statich block cal�st�");
	}
	
	static { // buraya block denir
		isim="Mehmet";
		System.out.println(isim);
	}
	

	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		
		

	}

}
