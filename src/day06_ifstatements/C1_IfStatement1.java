package day06_ifstatements;

public class C1_IfStatement1 {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=8;
		if (a>b) {
			
			System.out.println("ilk sayi buyuk");
			
		}
		
		if(a*b<0) {
			
			System.out.println("sayýlarýn carpýmý negatif"); // sýfýrdan kucuk olmadýgý için burasý calýsmaz.
			
			
		}
		
		if(a<b || b>0) {  // 10<8 || 8>0 
			
			
		System.out.println("or'lu cumle calýþtý");
		}
		
		if( a-b>0 && a-b>0) { //10-8>0 && 10*8>0 treu ve body calýsýr
			 System.out.println("and cumlesi calýsti");
			
		}
		
		
	}

}
