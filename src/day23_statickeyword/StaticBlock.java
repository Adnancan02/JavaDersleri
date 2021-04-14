package day23_statickeyword;

public class StaticBlock {
	// static block class calýstýrýldýgýnda ilk olarak calýsýr(main method' dan bile once calýsýr)
	// static block lar static variable'lara deger atamak için kullanilir.
	
	static String isim;
	
	static {
		System.out.println("1.statich block calýstý");
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
