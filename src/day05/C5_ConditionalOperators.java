package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		// 

		
		//&&&, OR / AND && , OR || ayi1 < =sayi2  sayi1 > ayi2
		
		boolean isTreu= 5>4 && 7-3 > 0; // T and T = T hepsi treu ise sonuc Treu dur.
		// and operatörü mükemmelliyetçidir.
		// matamatikteki carpma isþemi gibidir(treu 1 false 0)
		System.out.println(isTreu);
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && x*y>20 && x-y>0); // == eþit mi demektir.
	
		System.out.println(x+y<0 && x-y>0);
		
		//OR operatoru ise optimisttir. verilen karsýlastýrmalarada 1 tanesi bile dogru ise sonuc treu olur.
		// toplama iþlemi gibidir.
		System.out.println(x<y || x+y<0 || x-y>0); // treu
		
		
		
		
		
		
		
		
		
		

	}

}
