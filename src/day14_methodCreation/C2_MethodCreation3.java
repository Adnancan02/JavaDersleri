package day14_methodCreation;

public class C2_MethodCreation3 {

	public static void main(String[] args) {
		// Verilen 3 double sayýný ortalamasýný alan bir method yazýn 
		// main method içinden cagýrarak yazýn
		
 
		ortalama(80,60); // method call 2. yi calýstýrý
		ortalama(80,60,55); // 3. lü yü calýstýrýr.
		
		
	} //main sonu
	
	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		
		System.out.println("girdiginiz üç sayinin ortalamasi : "+(sayi1+sayi2+sayi3)/3);
		
	}
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("girdiginiz iki sayinin ortalamasi : "+(sayi1+sayi2)/2);
	}
	

} // calss sonu
